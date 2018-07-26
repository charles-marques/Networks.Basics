package br.edu.unifor.timexnetwork;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class Processor {

	private static final String VIRGULA = ", ";
	private static final String ARESTAS = "ARESTAS";
	private static final String VERTICES = "Vértices:";
	private static final String DEGREE = "Degree: ";
	private static final String ID = "ID: ";
	
	public static void setNodesSizes(Graph graph, Integer escalaTamanho) {
		int minimumsize = 1;
		int maximumsize = graph.getNodeCount() * graph.getEdgeCount() * escalaTamanho;
		int smaller = -1;
		int greater = -1;
		for (Node n : graph.getEachNode()) {
			if (n.getDegree() > greater || smaller == -1)
				greater = n.getDegree();
			if (n.getDegree() < smaller || greater == -1)
				smaller = n.getDegree();
		}
		for (Node n : graph.getEachNode()) {
			double scale = (double) (n.getDegree() - smaller) / (double) (greater - smaller);
			if (null != n.getAttribute("ui.style")) {
				n.setAttribute("ui.style", n.getAttribute("ui.style") + " size:"
						+ Math.round((scale * maximumsize ) + minimumsize) + "px;");
			} else {
				n.addAttribute("ui.style", " size:" + Math.round((scale * maximumsize) + minimumsize) + "px;");
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new SingleGraph("Tutorial 1");
		graph.setStrict(false);
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addEdge("AB", "A", "B", true);
//		graph.addEdge("BC", "B", "C", true);
//		graph.addEdge("CD", "C", "D", true);
		graph.addEdge("DA", "D", "A", true);
		graph.addEdge("CA", "C", "A", true);
		graph.addEdge("BD", "B", "D", true);
		graph.addEdge("BD2", "B", "D", true);
		graph.addEdge("BD3", "B", "D", true);
		graph.addEdge("BD4", "B", "D", true);
		
		setNodesSizes(graph, 5);
		
		graph.display();

		System.out.println(VERTICES);
		graph.getEachNode().forEach(node -> {
			System.out.println(ID + node.getId() + VIRGULA + DEGREE + node.getDegree());
		});

		System.out.println(ARESTAS);
		graph.getEachEdge().forEach(edge -> {
			System.out.println(ID + edge.getId());
		});
	}

}
