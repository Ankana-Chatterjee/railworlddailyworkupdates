package com.practice.controllervalid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.ValidationRequest;
import com.twilio.rest.verify.v2.service.Verification;
import com.twilio.rest.verify.v2.service.VerificationCheck;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/api/verification")
public class PhoneNumberVerificationController {
	@PostMapping("/send-code")
	public ResponseEntity<String> sendVerificationCode(@RequestBody String phoneNumber) {
		try {
			// Replace these placeholder values with your actual Twilio Account SID and Auth
			// Token
			String accountSid = "ACad939c6098b0e04c1f277b5aad6e1a99";
			String authToken = "8f9c1b281ad101b094008e59ceb1d952";

			// Replace this placeholder value with your actual Twilio Service SID
			String serviceSid = "VAa67ec2054b4d30eb836f15a0c8a4f1af";

			Twilio.init(accountSid, authToken);

			Verification verification = Verification.creator(serviceSid, phoneNumber, "sms").create();

			System.out.println("Verification SID: " + verification.getSid());
			return new ResponseEntity<>("Verification code sent successfully.", HttpStatus 	.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Error sending verification code.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/verifyPhoneNumber")
	public ResponseEntity<String> verifyPhoneNumber(@RequestBody ValidationRequest request) {
		try {
			PhoneNumber phoneNumberObject = request.getPhoneNumber();

			if (phoneNumberObject != null) {
				String phoneNumber = phoneNumberObject.getEndpoint();

				VerificationCheck verificationCheck = VerificationCheck
						.creator("VAa67ec2054b4d30eb836f15a0c8a4f1af", request.getValidationCode()).setTo(phoneNumber)
						.create();

				if ("approved".equalsIgnoreCase(verificationCheck.getStatus())) {
					return new ResponseEntity<>("Phone number verified successfully", HttpStatus.OK);
				} else {
					return new ResponseEntity<>("Phone number verification failed", HttpStatus.BAD_REQUEST);
				}
			} else {
				return new ResponseEntity<>("Phone number is null", HttpStatus.BAD_REQUEST);
			}
		} catch (ApiException e) {
			return new ResponseEntity<>("Failed to verify phone number: " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
