#! /usr/bin/python

from keras import backend as K

import numpy as np
val = np.random.random((3, 4, 5))
var = K.variable(value=val)

var = K.zeros(shape=(3, 4, 5))

var = K.ones(shape=(3, 4, 5))

b = K.random_uniform_variable(shape=(3,4), low=0, high=1)
c = K.random_normal_variable(shape=(3,4), mean=0, scale=1)
d = K.random_normal_variable(shape=(3,4), mean=0, scale=1)

a = b + c * K.abs(d)
c = K.dot(a, K.transpose(b))
a = K.sum(b, axis=1)
a = K.softmax(b)
a = K.concatenate([b, c], axis=-1)

print K.epsilon()
print K.floatx()
print K.image_data_format()