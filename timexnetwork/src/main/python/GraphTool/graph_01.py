#! /usr/bin/python
#Importing libraries

# import matplotlib.pyplot as plt
# import numpy as np
# import pandas as pd

from graph_tool.all import *

g = Graph()

v1 = g.add_vertex()
v2 = g.add_vertex()

e = g.add_edge(v1,v2)

graph_draw(g, vertex_text=g.vertex_index, vertex_font_size=18, output_size=(200, 200), output="two-nodes.png")

print("Out Degree v1: ")
print(v1.out_degree())

print "Out Degree v2: "
print(v2.out_degree())

print(e.source(), e.target())
