#! /usr/bin/python

from keras import backend as k
# from keras.backend.cntk_backend import shape

inputs = k.placeholder(shape=(2, 4, 5))
print inputs

inputs = k.placeholder(shape=(None, 4, 5))
print inputs

inputs = k.placeholder(ndim=3)
print inputs