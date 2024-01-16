package com.railworld.testhiber2;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;
@Entity
public class Address {
	@Id
	   private int adsressId;
		@Column(length=100 ,name="STRRET")
	   private String street;
		@Column(length=100 ,name="CITY")
	   private String city; 
		@Column(name="ISOPEN")
	   private boolean isOpen;
	
		@Transient()
	   private double x;
		@Lob()
	   private byte[] image;
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(int adsressId, String street, String city, boolean isOpen, double x, byte[] image) {
			super();
			this.adsressId = adsressId;
			this.street = street;
			this.city = city;
			this.isOpen = isOpen;
			this.x = x;
			this.image = image;
		}
		public int getAdsressId() {
			return adsressId;
		}
		public void setAdsressId(int adsressId) {
			this.adsressId = adsressId;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public boolean isOpen() {
			return isOpen;
		}
		public void setOpen(boolean isOpen) {
			this.isOpen = isOpen;
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public byte[] getImage() {
			return image;
		}
		public void setImage(byte[] image) {
			this.image = image;
		}
		@Override
		public String toString() {
			return "Address [adsressId=" + adsressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
					+ ", x=" + x + ", image=" + Arrays.toString(image) + "]";
		}
		
}
