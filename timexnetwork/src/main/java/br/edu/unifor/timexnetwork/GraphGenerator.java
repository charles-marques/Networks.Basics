package br.edu.unifor.timexnetwork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class GraphGenerator {
	private static boolean first = true;
	private static String[] array = new String[8];
	private static Set<String> vertices = new HashSet<String>();
	private static Set<Aresta> arestas = new HashSet<Aresta>();	
	private static void addVertex(String vertex) {
		if (vertex == null || vertex.trim().isEmpty())
			return;
		if (!vertices.contains(vertex.trim()))
			vertices.add(vertex.trim());
	}
	
	private static void addEdge(String origin, String destination, Integer count) {
		if (origin == null || origin.trim().isEmpty() || destination == null || destination.trim().isEmpty())
			return;
		Aresta aresta = new Aresta(origin, destination, count);
		if (!arestas.contains(aresta)) {
			arestas.add(aresta);
		} else {
			Aresta a = arestas.stream().filter(edge -> edge.equals(aresta)).findFirst().get();
			a.setCount(a.getCount() + aresta.getCount());
		}
	}
	
	private static void loadGraphData() {
		String fileName = "/home/suporte/eclipse-workspace/timexnetwork/timexnetwork/resource/Arestas.csv";
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			lines.forEach(line -> {
				if (first) {
					first = false;
				} else {
					array = line.split(",");
					addVertex(array[0]);
					addVertex(array[1]);
					addEdge(array[0], array[1], Integer.valueOf(array[7]));
					System.out.println(line);
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
						+ Math.round((scale * maximumsize) + minimumsize) + "px;");
			} else {
				n.addAttribute("ui.style", " size:" + Math.round((scale * maximumsize) + minimumsize) + "px;");
			}
		}
	}

//	private static void contigStyle() {
////		Configurando Style
//		graph.getNode("A").setAttribute("ui.style", "shape:pie-chart;fill-color:rgb(127,0,55),rgb(255,0,110),rgb(1,127,1);");
//		graph.getNode("A").setAttribute("ui.pie-values", "0.333,0.333,0.333");
//		graph.getNode("B").setAttribute("ui.style", "shape:pie-chart; fill-color: rgb(255,0,110), rgb(0,255,1);");
//		graph.getNode("B").setAttribute("ui.pie-values", "0.5,0.5");
//		graph.getNode(3).setAttribute("ui.style", "shape:pie-chart; fill-color: rgb(255,0,110), rgb(0,255,1);");
//		graph.getNode(3).setAttribute("ui.pie-values", "0.5,0.5");
//		graph.addAttribute("ui.quality");
//		graph.addAttribute("ui.antialias");
//		graph.addAttribute("ui.stylesheet", "url('resource/style.css')");
//	}

	
//	private static void showProperties( ) {
//		System.out.println(VERTICES);
//		graph.getEachNode().forEach(node -> {
//			System.out.println(ID + node.getId() + VIRGULA + DEGREE + node.getDegree());
//		});
//		System.out.println(ARESTAS);
//		graph.getEachEdge().forEach(edge -> {
//			System.out.println(ID + edge.getId());
//		});
//	}
	
	public static void main(String[] args) {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new SingleGraph("Tutorial 1");
		graph.setStrict(false);
		
		loadGraphData();
		
		// CARREGANDO VERTICES
		for (String v : vertices) {
			graph.addNode(v.trim());
		}
		for (Aresta aresta : arestas) {
			for (int i = 0; i < aresta.getCount(); i++) {
				graph.addEdge(aresta.toString(), aresta.getOrigin().trim(), aresta.getDestination().trim());
				System.out.println(aresta.toString());
			}
		}
		
		setNodesSizes(graph, 2);
		
		graph.display();
	}
}
