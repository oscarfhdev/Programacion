def contar_palabras(lista_palabras):
    diccionario_palabras = {}
    for i in lista_palabras:
        if i in diccionario_palabras:
            diccionario_palabras[i] += 1
        else:
            diccionario_palabras[i] = 1
    return diccionario_palabras