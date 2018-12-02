package br.edu.unifor.timexnetwork.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.edu.unifor.timexnetwork.model.BusStop;
import br.edu.unifor.timexnetwork.model.od_path.OdPathData;

public class OdPathController {
	
	private static boolean first = true;
	private static List<OdPathData> odPathDataSet = new ArrayList<>();
	private static List<BusStop> listaBusStops = new ArrayList<>();
//	private static String[] dados;
	
	private static void loadDataFromCSV(String resourceFile) {
		try (Stream<String> lines = Files.lines(Paths.get(resourceFile))) {
			lines.forEach(line -> {
				if (first) {
					first = false;
				} else {
					add(listaBusStops, new BusStop(line.split(",")));
					System.out.println(line);
				}
			});
			System.out.println("Size: " + listaBusStops.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void loadGraphData(String fileOdPath) {
		try (Stream<String> lines = Files.lines(Paths.get(fileOdPath))) {
			lines.forEach(line -> {
				if (first) {
					first = false;
				} else {
					try {
						add(odPathDataSet, new OdPathData(line));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(line);
				}
			});
			System.out.println("Size: " + odPathDataSet.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void add(List list, Object o) {
		if (!list.contains(o)) list.add(o);
		return;
	}
	
	public static void main(String[]  args) {
		String busStopsPath = "/home/suporte/eclipse-workspace/Networks.Data.Processing/timexnetwork/resource/mobility-dataset/bus_stops.csv";
		loadDataFromCSV(busStopsPath);
		String odpathFile = "/home/suporte/eclipse-workspace/Networks.Data.Processing/timexnetwork/resource/od_path/path-origens-e-destinos-11-3-2015.sample";
//		loadDataFromCSV(odpathFile, odPathDataSet);
		loadGraphData(odpathFile);
	}
	
}
