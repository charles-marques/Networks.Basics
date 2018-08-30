#! /usr/bin/python
#Importing libraries

import matplotlib.pyplot as plt
import numpy as np
# import pandas as pd

from graph_tool.all import *

modo = 'r'
csv = '.csv'
vertices = []

vfile = "/home/suporte/Documentos/network/timexnetwork/resource/Vertices"
vf = open(vfile + csv, modo)
primeiro = 'true'

for line in vf:
    if primeiro == 'false':
        arr = line.split(',')
        print arr[0]
        vertices.append(arr[0])
    else:
        primeiro = 'false'
        print('Lendo primeira linha do arquivo de vertices...')
vf.close()

print 'Ordenando...'
vertices.sort()
print 'Tamanho: '
print len(vertices)

g = Graph()
g.set_directed(1 == 1)

vlist = g.add_vertex(len(vertices))
print 'Total de vertices:'
print len(list(vlist))


filename = "/home/suporte/Documentos/network/timexnetwork/resource/Arestas"
f = open(filename + csv, modo)
primeiro = "true"

for aline in f:
    if primeiro != "true":
        vray = aline.split(',')
        print 'Linha vray:'
        print vray
        print 'Tamanho do array: '
        print len(vray)
        index_o = vertices.index(vray[0])
        index_d = vertices.index(vray[1])
        origen  = g.vertex(index_o)
        destino = g.vertex(index_d)
#        g.add_edge(origen, destino)
        i = int(vray[6],10)
        for x in range(i):
            g.add_edge(origen, destino)
    else:
        primeiro = "false"
f.close()

pos = sfdp_layout(g)
bv, be = betweenness(g)
be.a /= be.a.max() / 5

graph_draw(g, pos=pos, vertex_fill_color=bv, edge_pen_width=be, output="timexnetwork_v4.png")
# graph_draw(g, vertex_text=g.vertex_index, vertex_font_size=18, output_size=(200, 200), output="two-nodes.png")
#graph_draw(g, output_size=(1200, 1200), vertex_color=[1,1,1,0], vertex_fill_color=g.vertex_index, vertex_size=1, edge_pen_width=1.2, vcmap=matplotlib.cm.gist_heat_r, output="timexnetwork.png")
