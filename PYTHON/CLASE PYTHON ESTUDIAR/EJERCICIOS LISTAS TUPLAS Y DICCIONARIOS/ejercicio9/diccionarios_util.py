'''def revertir_diccionario(diccionario):
    clave, valor = zip(*diccionario.items())
    diccionario_revertido = dict(zip(valor, clave))
    return diccionario_revertido'''

def revertir_diccionario(diccionario):
    diccionario_invertido = {}
    for clave, valor in diccionario.items():
        diccionario_invertido[valor] = clave
    return diccionario_invertido
