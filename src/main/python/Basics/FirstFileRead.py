#! /usr/bin/python

f = open('/home/suporte/Documentos/timexnetwork/timexnetwork/resource/Arestas.csv','r')

print "Lendo lista:"
myList = []
for line in f:
    myList.append(line)
    colunas = line.split(',');
    print line;
    for col in colunas:
        col = col.replace('\n','').strip()
        print "'" + col + "'"
print(myList)
