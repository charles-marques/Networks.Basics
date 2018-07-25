package br.edu.unifor.timexnetwork;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class Processor {

	private static final String DEGREE = "Degree: ";
	private static final String ID = "ID: ";

	public static void main(String[] args) {
		Graph graph = new SingleGraph("Tutorial 1");
		graph.setStrict(false);
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addEdge("AB", "A", "B");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CD", "C", "D");
//		graph.addEdge("DA", "D", "A");
//		graph.addEdge("CA", "C", "A");
//		graph.addEdge("BD", "B", "D");
//		graph.addEdge("BD2", "B", "D");
		graph.display();
		
		graph.getEachNode().forEach(node -> {
			System.out.println(ID + node.getId());
			System.out.println(DEGREE + node.getDegree());
		});
	}

}
