#! /usr/bin/python

datasetBusStop = []

print 'BusStops...'
fbus = open("/home/suporte/eclipse-workspace/Networks.Data.Processing/resource/mobility-dataset/bus_stops.csv",'r')

primeira = True

for line in fbus:
    if primeira:
        primeira = False
    else:
        datasetBusStop.append(line.split(','))
fbus.close

print "BusStop: "
print len(datasetBusStop)