#! /usr/bin/python
#Importing libraries

import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

#Read dataset
dataset = pd.read_csv('./Data.csv')
x = dataset.iloc[:, :-1].values
# y = dataset.iloc[:, 1].values

print x
# print y
# print z
