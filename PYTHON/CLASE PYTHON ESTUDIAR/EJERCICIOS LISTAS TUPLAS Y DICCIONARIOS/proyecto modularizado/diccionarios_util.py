def contar_apariciones(lista_aleatoria):
    diccionario_contador = {}
    for elemento in lista_aleatoria:
        if elemento not in diccionario_contador:
            diccionario_contador[elemento] = 1
        else:
            diccionario_contador[elemento] += 1
    print(f" Este es el diccionario donde aparece cuántas veces sale cada número: {diccionario_contador}")
    return diccionario_contador
