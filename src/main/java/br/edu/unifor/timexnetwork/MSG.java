package br.edu.unifor.timexnetwork;

public enum MSG {
	VIRGULA(", "), 
	ARESTAS("ARESTAS"), 
	VERTICES("Vértices:"),
	DEGREE("Degree: "),
	ID("ID: "),
	TRACO("-");
	
	private String name;
	
	private MSG(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.getName().toString();
	}
}
