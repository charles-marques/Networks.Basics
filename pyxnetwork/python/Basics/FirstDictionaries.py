#! /usr/bin/python

lista = {'a' : 3, 'b' : 2, 'c' : 1}

print lista.get('a')
lista['d'] = 5
if lista.get('d') != 'none':
   print lista.get('d')
   print 'd foi adicionado'
else:
   print 'd nao foi adicionado'
if lista.get('e') != 'none':
   print 'e foi adicionado'
else:
   print 'e nao foi adicionado'
