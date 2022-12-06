package com.developer.springboot.apirest.services;

import com.developer.springboot.apirest.models.entity.ClimaCiudad;
import com.developer.springboot.apirest.request.ClimaCiudadRequest;

public interface ClimaCiudadService {
	public ClimaCiudad climaCiudades(ClimaCiudadRequest climaCiudadRequest);

}
