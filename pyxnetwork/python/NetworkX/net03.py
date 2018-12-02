#! /usr/bin/python

# import matplotlib.pyplot as plt
# import networkx as nx

filedata = None

file1 = open('/home/suporte/eclipse-workspace/Networks.Data.Processing/pyxnetwork/resource/od_path/path-origens-e-destinos-11-3-2015.txt.txt','r')
file2 = open('/home/suporte/eclipse-workspace/Networks.Data.Processing/pyxnetwork/resource/od_path/path-origens-e-destinos-11-3-2015.txt.csv','w')
file3 = open('/home/suporte/eclipse-workspace/Networks.Data.Processing/pyxnetwork/resource/od_path/path-origens-e-destinos-por-usuario.txt','w')

for line in file1:
    if 'cod_acao5544486' in line:
        line = line.replace('cod_acao5544486','cod_acao\n5544486')
    if 'direcao_linha_destinonum_veiculo_destino' in line:
        line = line.replace('direcao_linha_destinonum_veiculo_destino','direcao_linha_destino,num_veiculo_destino')
    file2.write(line)
    dados = line.split(',')
    file3.write(dados[0] + ',' + dados[1] + ',' + dados[3] + ',' + dados[4] + ',' + dados[9] + ',' + dados[10] + ',' + dados[15] + ',' + dados[18] + ',' + dados[16] + ',' + dados[19] + '\n')
file1.close()
file2.close()
file3.close()