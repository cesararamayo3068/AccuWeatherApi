package com.developer.springboot.apirest.models.entity;



import com.developer.springboot.apirest.response.Temperature;


public class ClimaCiudad {
	
	private String LocalObservationDateTime;
	private Integer EpochTime;
	private String WeatherText;
	private Integer WeatherIcon;
	private Boolean HasPrecipitation;
	private String PrecipitationType;
	private Boolean IsDayTime;
	
	private Temperature Temperature;
	

    private String MobileLink;
    private String Link;
	public ClimaCiudad(String localObservationDateTime, Integer epochTime, String weatherText, Integer weatherIcon,
			Boolean hasPrecipitation, String precipitationType, Boolean isDayTime,
			com.developer.springboot.apirest.response.Temperature temperature, String mobileLink, String link) {
		super();
		LocalObservationDateTime = localObservationDateTime;
		EpochTime = epochTime;
		WeatherText = weatherText;
		WeatherIcon = weatherIcon;
		HasPrecipitation = hasPrecipitation;
		PrecipitationType = precipitationType;
		IsDayTime = isDayTime;
		Temperature = temperature;
		MobileLink = mobileLink;
		Link = link;
	}
	public ClimaCiudad() {
		super();
	}
	public String getLocalObservationDateTime() {
		return LocalObservationDateTime;
	}
	public void setLocalObservationDateTime(String localObservationDateTime) {
		LocalObservationDateTime = localObservationDateTime;
	}
	public Integer getEpochTime() {
		return EpochTime;
	}
	public void setEpochTime(Integer epochTime) {
		EpochTime = epochTime;
	}
	public String getWeatherText() {
		return WeatherText;
	}
	public void setWeatherText(String weatherText) {
		WeatherText = weatherText;
	}
	public Integer getWeatherIcon() {
		return WeatherIcon;
	}
	public void setWeatherIcon(Integer weatherIcon) {
		WeatherIcon = weatherIcon;
	}
	public Boolean getHasPrecipitation() {
		return HasPrecipitation;
	}
	public void setHasPrecipitation(Boolean hasPrecipitation) {
		HasPrecipitation = hasPrecipitation;
	}
	public String getPrecipitationType() {
		return PrecipitationType;
	}
	public void setPrecipitationType(String precipitationType) {
		PrecipitationType = precipitationType;
	}
	public Boolean getIsDayTime() {
		return IsDayTime;
	}
	public void setIsDayTime(Boolean isDayTime) {
		IsDayTime = isDayTime;
	}
	public Temperature getTemperature() {
		return Temperature;
	}
	public void setTemperature(Temperature temperature) {
		Temperature = temperature;
	}
	public String getMobileLink() {
		return MobileLink;
	}
	public void setMobileLink(String mobileLink) {
		MobileLink = mobileLink;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}

}
