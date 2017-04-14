package com.bridgelabz.CountryApp.service;

import java.util.Collection;

import com.bridgelabz.CountryApp.model.Country;

public interface WorldService {

	public Collection<Country>getCountries();
	public Country getCountrybyId(Integer id);
	public Country getCountrybyName(String name);
	public void saveCountry(Country country);
	public void deleteCountry(Country country);
}
