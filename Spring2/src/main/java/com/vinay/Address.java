package com.vinay;

public class Address {

	private String city;
	private String country;
	private long phone;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", phone=" + phone + "]";
	}
	
	
	
}
