package com.developer.springboot.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.developer.springboot.apirest.models.entity.ClimaCiudad;
import com.developer.springboot.apirest.request.ClimaCiudadRequest;

import com.developer.springboot.apirest.services.ClimaCiudadService;

@RestController
public class ClimaController {
	
	@Autowired
	private ClimaCiudadService climaCiudadService;
	
	@GetMapping ("/clima/{language}/{details}")
	public ClimaCiudad obtenerClimaDeCiudad (@PathVariable String language , @PathVariable String details) {
		ClimaCiudadRequest climaCiudadRequest = new ClimaCiudadRequest();
		climaCiudadRequest.setLanguage(language);
		climaCiudadRequest.setDetails(details);
		ClimaCiudad climaCiudad = climaCiudadService.climaCiudades(climaCiudadRequest);
		 
		 return climaCiudad;
	}

}
