package com.bridgelabz.CountryApp.model;

import java.util.Date;

public class Country {

	private Integer id;
	private String name;
	private Integer area;
	private Long population;
	private Date lastupdate;
	private String currency;
	
	
	
	public Country(Integer id, String name, Integer area, Long population, Date lastupdate, String currency) {
		this.id = id;
		this.name = name;
		this.area = area;
		this.population = population;
		this.lastupdate = lastupdate;
		this.currency = currency;
	}
	
	public boolean isNew() {
		return id==null;
		}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public Date getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
