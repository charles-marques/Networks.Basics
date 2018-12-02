package br.edu.unifor.timexnetwork.model;

import java.util.Date;

import br.edu.unifor.timexnetwork.MSG;

public class GPS {
	Date dateTime;
	String direction;
	Double lat;
	Double lng;
	Double speed;
	Integer busId;

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	@Override
	public String toString() {
		return dateTime.toString() + MSG.TRACO
				+ lat.toString() + MSG.TRACO
				+ lng.toString() + MSG.TRACO
				+ busId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		GPS gps = (GPS) o;
		return busId.equals(gps.busId) 
			&& dateTime.equals(gps.getDateTime())
			&& lat.equals(gps.getLat())
			&& lng.equals(gps.getLng());
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
	    hash = 31 * hash + (int) busId;
	    hash = 31 * hash + dateTime.hashCode();
	    hash = 31 * hash + lat.hashCode();
	    hash = 31 * hash + lng.hashCode();
	    return hash;
	}
}
