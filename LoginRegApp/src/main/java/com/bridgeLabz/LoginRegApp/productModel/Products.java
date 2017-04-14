package com.bridgeLabz.LoginRegApp.productModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.bridgeLabz.LoginRegApp.model.Customer;

@Entity
@Table(name="Product_Info")
public class Products {

	
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int id;
	private String productName;
	private double price;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private CustomerProduct customerProduct;*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/*public CustomerProduct getCustomerProduct() {
		return customerProduct;
	}
	public void setCustomerProduct(CustomerProduct customerProduct) {
		this.customerProduct = customerProduct;
	}*/
	
}
