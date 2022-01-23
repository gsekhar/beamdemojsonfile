package model;

import java.io.Serializable;
import java.util.Objects;

public class Gdp implements Serializable{

	private String countryiso3code;
	
	private String date;
	
	private float value;
	
	private Country country;
	
	private Indicator indicator;
	
	private String unit;
	
	private String obs_status;
	
	private float decimal;
	

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Indicator getIndicator() {
		return indicator;
	}

	public void setIndicator(Indicator indicator) {
		this.indicator = indicator;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getObs_status() {
		return obs_status;
	}

	public void setObs_status(String obs_status) {
		this.obs_status = obs_status;
	}


	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public float getDecimal() {
		return decimal;
	}

	public void setDecimal(float decimal) {
		this.decimal = decimal;
	}

	public String getCountryiso3code() {
		return countryiso3code;
	}

	public void setCountryiso3code(String countryiso3code) {
		this.countryiso3code = countryiso3code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryiso3code, date, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gdp other = (Gdp) obj;
		return Objects.equals(countryiso3code, other.countryiso3code) && Objects.equals(date, other.date)
				&& value == other.value;
	}

	
	
	
}
