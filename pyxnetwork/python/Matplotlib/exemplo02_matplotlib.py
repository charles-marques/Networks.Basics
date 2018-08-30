#! /usr/bin/python

import numpy as np
from matplotlib import pyplot as plt

x = np.arange(1,11)
y = 2 * x + 5

plt.title("Matplotlib Funcao")
plt.xlabel("X axis")
plt.ylabel("Y axis")
plt.plot(x,y)
plt.show()
