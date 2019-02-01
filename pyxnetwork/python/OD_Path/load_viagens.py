#! /usr/bin/python

print 'CARREGANDO DADOS DE VIAGENS'
print 'Inicianlizando variaveis'

# 0 matricula
# 1 data_hora_ida
# 2 data_hora_volta
# 3 num_linha_origem
# 4 direcao_linha_origem
# 5 num_veiculo_origem
# 6 num_parada_origem
# 7 lat_origem
# 8 lng_origem
# 9 num_linha_destino
# 10 direcao_linha_destino
# 11 num_veiculo_destino
# 12 num_parada_destino
# 13 lat_destino
# 14 lng_destino
# 15 integracoes
# 16 linhas_path
# 17 distancia
# 18 qtd_baldeacoes
# 19 caminho
# 20 cod_acao
datasetViagens = []

print 'Viagens...'
fod = open("/home/suporte/eclipse-workspace/Networks.Data.Processing/resource/od_path/path-origens-e-destinos-11-3-2015.processado.original.csv",'r')
primeira = True
for line in fod:
    line = line.replace('"','')
    if primeira:
        primeira = False
    else:
        datasetViagens.append(line.split(','))
fod.close

print "Viagens: "
print len(datasetViagens)