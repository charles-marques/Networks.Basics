#! /usr/bin/python

import matplotlib.pyplot as plt
import scipy as sp
import networkx as nx

# import numpy as np
# import pandas as pd

modo = 'r'
csv = '.csv'

G = nx.Graph()
# G = nx.DiGraph()
# G = nx.petersen_graph()
# G = nx.tutte_graph()
# G = nx.sedgewick_maze_graph()
# G = nx.tetrahedral_graph()

vfile = "/home/suporte/eclipse-workspace/Networks.Data.Processing/pyxnetwork/resource/od/Vertices"
vf = open(vfile + csv, modo)
primeiro = 'true'

for line in vf:
    if primeiro == 'false':
        arr = line.split(',')
        print arr[0]
        G.add_node(arr[0])
    else:
        primeiro = 'false'
        print('Lendo primeira linha do arquivo de vertices...')
vf.close()

print 'Total de vertices:'


filename = "/home/suporte/eclipse-workspace/Networks.Data.Processing/pyxnetwork/resource/od/Arestas"
k = open(filename + csv, modo)
primeiro = "true"

for aline in k:
    if primeiro != "true":
        vray = aline.split(',')
        print 'Linha vray:'
        print vray
        print 'Tamanho do array: '
        print len(vray)
        i = int(vray[6])
        G.add_edge(vray[0], vray[1])
        # G.edges[vray[0],vray[1]]['weight'] = i
    else:
        primeiro = "false"
k.close()

A = nx.adjacency_matrix(G)
print(A.todense())

A.setdiag(A.diagonal()*2)
print(A.todense())

nodes = G.nodes
# cc = closeness_centrality(G, nodes, normalized=True)


# pos = nx.spring_layout(G)
# nx.draw(G,pos)
# nx.draw_networkx_edge_labels(G,pos, font_color = 'blue', font_size = 8)
# plt.subplot(121)
# nx.draw(G, with_labels = True, font_weight = 'bold')
# plt.subplot(122)
# nx.draw_shell(G, nlist = [range(5, 10), range(5)], with_labels = True, font_weight = 'bold')
# plt.show()

# nx.draw(G, with_labels = True, font_weight = 'bold')
# plt.subplot(122)
# nx.draw_shell(G, nlist = [range(5, 10), range(5)], with_labels = True, font_weight = 'bold')