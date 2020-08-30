package model.shoppingdb.collections;

import org.bson.Document;

public class Customer extends Document{

	private static final long serialVersionUID = -8815579648006143693L;
	String name, city, country, phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	public Customer(String name, String city, String country, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", country=" + country + ", phone=" + phone + "]";
	}
	

}
