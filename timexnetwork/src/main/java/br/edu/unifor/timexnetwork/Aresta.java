package br.edu.unifor.timexnetwork;

public class Aresta {
	private String origin;
	private String destination;
	private Integer count;

	public Aresta(String origin, String destination, Integer count) {
		this.origin = origin;
		this.destination = destination;
		this.count = count;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return this.origin + MSG.TRACO + this.destination;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Aresta))
			return false;
		if (obj == this)
			return true;
		Aresta a = (Aresta) obj;
		return this.getOrigin().equals(a.getOrigin()) && this.getDestination().equals(a.getDestination());
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * 17 + origin.hashCode();
		hash = hash * 31 + destination.hashCode();
//		hash = hash * 13 + (x == null ? 0 : dept.hashCode());
		return hash;
	}

}
