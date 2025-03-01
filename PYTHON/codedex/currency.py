def calcularUSD():
    pesos_colombianos = float(input('Ingresa cuantos Pesos Colombianos: '))
    soles_peruanos = float(input('Ingresa cuantos Soles Peruanos: '))
    reales_brasilenos = float(input('Ingresa cuantos Reais Brasilenos: '))

    pesos_colombianos_en_dolares = pesos_colombianos * 0.00024
    soles_peruanos_en_dolares = soles_peruanos * 0.26
    reales_brasilenos_en_dolares = reales_brasilenos * 0.18

    dolares_totales = pesos_colombianos_en_dolares + soles_peruanos_en_dolares + reales_brasilenos_en_dolares

   # print('Con '+ (str(pesos_colombianos)) +' Pesos Colombianos, ' + (str(soles_peruanos)) + ' Soles Peruanos, y ' + (str(reales_brasilenos)) + ' Reales Brasilenos, son un total de: ' + (str(dolares_totales)) + ' dolares totales')

    print("Con", pesos_colombianos_en_dolares, " y ", soles_peruanos_en_dolares, " y ", reales_brasilenos_en_dolares, " tenemos un total de :", dolares_totales, "$")

calcularUSD()