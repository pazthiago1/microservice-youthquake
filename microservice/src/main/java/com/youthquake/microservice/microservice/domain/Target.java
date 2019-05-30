package com.youthquake.microservice.microservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Target {

	
	@JsonProperty
	private long idTarget;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String description;
	
	@JsonProperty
	private String dtStart;
	
	@JsonProperty
	private String dtEnd;
	
	@JsonProperty
	private int value;
	
	@JsonProperty
	private int valueAccumulated;
	
	@JsonProperty
	private int percentage;
	
	public Target(){}

	public long getIdTarget() {
		return idTarget;
	}

	public void setIdTarget(long idTarget) {
		this.idTarget = idTarget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDtStart() {
		return dtStart;
	}

	public void setDtStart(String dtStart) {
		this.dtStart = dtStart;
	}

	public String getDtEnd() {
		return dtEnd;
	}

	public void setDtEnd(String dtEnd) {
		this.dtEnd = dtEnd;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValueAccumulated() {
		return valueAccumulated;
	}

	public void setValueAccumulated(int valueAccumulated) {
		this.valueAccumulated = valueAccumulated;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}