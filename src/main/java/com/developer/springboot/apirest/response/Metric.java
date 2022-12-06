package com.developer.springboot.apirest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metric {
	@JsonProperty("Value")
	private Double Value;
	@JsonProperty("Unit")
	private String Unit;
	@JsonProperty("UnitType")
	private Integer UnitType;

	public Metric(Double value, String unit, Integer unitType) {
		super();
		Value = value;
		Unit = unit;
		UnitType = unitType;
	}

	public Metric() {
		super();
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public Integer getUnitType() {
		return UnitType;
	}

	public void setUnitType(Integer unitType) {
		UnitType = unitType;
	}

}
