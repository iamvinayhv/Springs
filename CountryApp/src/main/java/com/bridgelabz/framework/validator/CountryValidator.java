package com.bridgelabz.framework.validator;

import org.springframework.validation.Errors;

import com.bridgelabz.CountryApp.model.Country;
import com.bridgelabz.CountryApp.service.WorldService;
import com.bridgelabz.CountryApp.service.WorldServiceImpl;

public class CountryValidator {

	private WorldService worldService = new WorldServiceImpl();
	 
	public void validate(Country country, Errors errors) {
	 
		if(country.getArea() !=null && country.getArea()<=0)
		
	if (country.getArea() != null && country.getArea() <= 0) {
	errors.rejectValue("area", "validation.negative", "must be > 0");
	}
	 
	if (country.getPopulation() != null && country.getPopulation() <= 0) {
	errors.rejectValue("population", "validation.negative", "must be > 0");
	}
	 
	if (!errors.hasFieldErrors("name")) {
	Country existingCountry = worldService.getCountrybyName(country.getName());
	if (existingCountry != null && (country.isNew() || !country.getId().equals(existingCountry.getId()))) {
	errors.rejectValue("name", "validation.exists", "exists");
	}
	}
	}
}
