def contar_elementos_tupla(tupla, elemento):
    contador = 0
    for i in tupla:
        if elemento == i:
            contador += 1
    return contador

