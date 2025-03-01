def crear_lista_tuplas(lista):
    contador = 0
    lista_prueba = []
    for i in lista:
        tupla_interior = (contador, i)
        lista_prueba.append(tupla_interior)
        contador += 1

    return lista_prueba

'''
def crear_lista_tuplas(lista):
    lista_prueba = []  # Inicializar la lista dentro de la función
    for contador, valor in enumerate(lista):  # Usar enumerate para obtener índice y valor
        tupla_interior = (contador, valor)
        lista_prueba.append(tupla_interior)

    return lista_prueba'''