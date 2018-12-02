package br.edu.unifor.timexnetwork.model;
/**
 * Campos: date_time,integration,user_id,busline_id,bus_id
 * @author charles.marques
 * @since 20.11.2018
 * @version 1.0
 */

import java.util.Date;

public class Validation {
	Date dateTime;
	String integration;
	Integer userId;
	String buslineId;
	Integer busId;

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getIntegration() {
		return integration;
	}

	public void setIntegration(String integration) {
		this.integration = integration;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBuslineId() {
		return buslineId;
	}

	public void setBuslineId(String buslineId) {
		this.buslineId = buslineId;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

}
