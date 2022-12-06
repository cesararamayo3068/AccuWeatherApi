package com.developer.springboot.apirest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {
	@JsonProperty("Metric")
	private Metric Metric;
	@JsonProperty("Imperial")
	private Imperial Imperial;
	public Temperature(com.developer.springboot.apirest.response.Metric metric,
			com.developer.springboot.apirest.response.Imperial imperial) {
		super();
		Metric = metric;
		Imperial = imperial;
	}
	public Temperature() {
		super();
	}
	public Metric getMetric() {
		return Metric;
	}
	public void setMetric(Metric metric) {
		Metric = metric;
	}
	public Imperial getImperial() {
		return Imperial;
	}
	public void setImperial(Imperial imperial) {
		Imperial = imperial;
	}
	
	

}
