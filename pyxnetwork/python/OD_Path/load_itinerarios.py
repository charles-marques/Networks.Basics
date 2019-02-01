#! /usr/bin/python

import load_viagens as lv
import datetime as dt

print 'CARREGANDO DADOS DE ITINERARIO DE VEICULOS'

print 'Descobrindo cada parada dos onibus'

itinerarios = []

# 5 num_veiculo_origem
# 4 direcao_linha_origem
# 6 num_parada_origem
# 1 data_hora_ida

# 11 num_veiculo_destino
# 10 direcao_linha_destino
# 12 num_parada_destino
# 2 data_hora_volta

for viagem in lv.datasetViagens:
    it = [ viagem[5] , viagem[4] , viagem[6] , viagem[1][0:19] ]
    if it not in itinerarios:
        itinerarios.append(it)
    it2 = [ viagem[11], viagem[10], viagem[12], viagem[2][0:19] ]
    if it2 not in itinerarios:
        itinerarios.append(it2)

file_itinerarios = open("/home/suporte/eclipse-workspace/Networks.Data.Processing/resource/od_path/itinerarios.checked.txt.csv","w") 
file_itinerarios.write('num_veiculo_origem, direcao_linha_origem, num_parada_origem, data_hora_ida\n')

for itinerario in itinerarios:
    file_itinerarios.write( itinerario[5] + ', ' + itinerario[4] + ', ' + itinerario[6] + ', ' + itinerario[1] + '\n') 
    file_itinerarios.write( itinerario[11] +', ' + itinerario[10]+ ', ' + itinerario[12]+ ', ' + itinerario[2] + '\n')
    print itinerario
    print dt.datetime.now()
file_itinerarios.close()

print 'total de itinerarios:'
print len(itinerarios)
print 'Finalizando itinerarios...'