package com.developer.springboot.apirest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Imperial {
	@JsonProperty("Value")
	private Integer Value;
	@JsonProperty("Unit")
	private String Unit;
	@JsonProperty("UnitType")
	
	private Integer UnitType;
	
	public Imperial(Integer value, String unit, Integer unitType) {
		super();
		Value = value;
		Unit = unit;
		UnitType = unitType;
	}
	public Imperial() {
		super();
	}
	public Integer getValue() {
		return Value;
	}
	public void setValue(Integer value) {
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
