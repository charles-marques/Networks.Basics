package br.edu.unifor.timexnetwork.model;

public class BusStop {
	private Integer id;
	private Double lat;
	private Double lng;
	
	public BusStop() {
	}
	
	public BusStop(String[] line) {
		this(line[0], line[1], line[2]);
	}
	
	public BusStop(String id, String lat, String lng) {
		super();
		this.id = Integer.valueOf(id);
		this.lat = Double.valueOf(lat);
		this.lng = Double.valueOf(lng);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        BusStop busStop = (BusStop) o;
        return id == busStop.id;
    }
	
	@Override
	public int hashCode() {
		int hash = 7;
        hash = 31 * hash + id.hashCode();
        return hash;
	}
	
}
