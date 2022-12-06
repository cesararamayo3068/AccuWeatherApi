package com.developer.springboot.apirest.request;

import org.springframework.beans.factory.annotation.Value;

public class ClimaCiudadRequest {
	@Value("${apikey}")
	private String apiKey;
	
	private String language;
	
	private String details;
	

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}
