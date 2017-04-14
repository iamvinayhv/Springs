package com.bridgelabz.CountryApp.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bridgelabz.CountryApp.model.Country;
import com.bridgelabz.CountryApp.service.WorldService;
import com.bridgelabz.CountryApp.service.WorldServiceImpl;

@Controller
public class CountryController {

	private WorldService worldService = new WorldServiceImpl();
	 
	@RequestMapping("/countryList.jsp")
	@ModelAttribute("countries")
	public Collection<Country> getCountries() {
	return worldService.getCountries();
	}
	 
	@RequestMapping("/countryDetails.jsp")
	public Country getCountry(@RequestParam(value="id", required=true) int countryId) {
	return worldService.getCountrybyId(countryId);
	}
}
