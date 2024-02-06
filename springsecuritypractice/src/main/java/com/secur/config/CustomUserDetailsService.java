package com.secur.config;

import com.secur.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.secur.repository.EmpRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private EmpRepo empRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Employee emp = empRepo.findByEmail(email);
		if (emp == null) {
			throw new UsernameNotFoundException("user not found");
		} else {
			return new CustomUser(emp);
		}

	}

}
