package com.youthquake.microservice.microservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Target {

	
	@JsonProperty
	private String idTarget;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String description;
	
	@JsonProperty
	private String dtStart;
	
	@JsonProperty
	private String dtEnd;
	
	@JsonProperty
	private String value;
	
	@JsonProperty
	private String valueAccumulated;
	
	@JsonProperty
	private String percentage;
	
	public Target(){}

	public String getIdTarget() {
		return idTarget;
	}

	public void setIdTarget(String idTarget) {
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValueAccumulated() {
		return valueAccumulated;
	}

	public void setValueAccumulated(String valueAccumulated) {
		this.valueAccumulated = valueAccumulated;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Target [idTarget=" + idTarget + ", name=" + name + ", description=" + description + ", dtStart="
				+ dtStart + ", dtEnd=" + dtEnd + ", value=" + value + ", valueAccumulated=" + valueAccumulated
				+ ", percentage=" + percentage + "]";
	}
}