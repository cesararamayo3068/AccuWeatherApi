package com.developer.springboot.apirest.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.developer.springboot.apirest.models.entity.ClimaCiudad;
import com.developer.springboot.apirest.request.ClimaCiudadRequest;
import com.developer.springboot.apirest.response.ClimaCiudadResponse;

@Service
public class ClimaCiudadServiceImpl implements ClimaCiudadService {
	@Autowired
	private RestTemplate restTemplate;

	private String url = "http://dataservice.accuweather.com/currentconditions/v1/11238?apikey={apikey}&language={language}&details={details}";

	private final String API_KEY = "InAGx8JRGcpvHlndifwSgSpFAcrNVqew";
	// http://dataservice.accuweather.com/currentconditions/v1/11238?apikey={apikey}&language={languaje}&details={details}

	@Override
	public ClimaCiudad climaCiudades(ClimaCiudadRequest climaCiudadRequest) {
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("apikey", API_KEY);
		pathVariables.put("language", climaCiudadRequest.getLanguage());
		pathVariables.put("details", climaCiudadRequest.getDetails());
		ClimaCiudadResponse[] climaCiudadResponse = restTemplate.getForObject(url, ClimaCiudadResponse[].class,
				pathVariables);
		ClimaCiudad climaCiudad = new ClimaCiudad();

		for (ClimaCiudadResponse climaCiudadResponse2 : climaCiudadResponse) {
			climaCiudad.setLocalObservationDateTime(climaCiudadResponse2.getLocalObservationDateTime());
			climaCiudad.setEpochTime(climaCiudadResponse2.getEpochTime());
			climaCiudad.setWeatherText(climaCiudadResponse2.getWeatherText());
			climaCiudad.setWeatherIcon(climaCiudadResponse2.getWeatherIcon());
			climaCiudad.setHasPrecipitation(climaCiudadResponse2.getHasPrecipitation());
			climaCiudad.setPrecipitationType(climaCiudadResponse2.getPrecipitationType());
			climaCiudad.setIsDayTime(climaCiudadResponse2.getIsDayTime());
			climaCiudad.setTemperature(climaCiudadResponse2.getTemperature());
			climaCiudad.setMobileLink(climaCiudadResponse2.getMobileLink());
			climaCiudad.setLink(climaCiudadResponse2.getLink());
			
		}
		return climaCiudad;
	}

}
