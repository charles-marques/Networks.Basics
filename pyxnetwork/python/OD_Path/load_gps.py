#! /usr/bin/python

datasetGps     = []

print 'GPS...'
fgps = open("/home/suporte/eclipse-workspace/Networks.Data.Processing/resource/mobility-dataset/gps.csv",'r')

primeira = True

for line in fgps:
    line = line.replace('"','')
    if primeira:
        primeira = False
    else:
        datasetGps.append(line.split(','))
fgps.close

print "GPS....: "
print len(datasetGps)