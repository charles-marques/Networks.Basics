#! /usr/bin/python

from keras import backend as k
from keras.engine.sequential import Sequential
from keras.layers.embeddings import Embedding

import numpy as np

model = Sequential()
model.add(Embedding(100, 64, input_length=10))

input_array = np.random.randint(1000, size=(32,10))


model.compile('rmsprop', 'mse')
output_array = model.predict(input_array)

assert output_array == (32, 10, 64)