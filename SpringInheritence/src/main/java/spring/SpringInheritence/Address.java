package spring.SpringInheritence;

public class Address {
	
	private String city;
	private String Country;
	
	
	public Address(String city, String country) {
		this.city = city;
		Country = country;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + "]";
	}
	
}
