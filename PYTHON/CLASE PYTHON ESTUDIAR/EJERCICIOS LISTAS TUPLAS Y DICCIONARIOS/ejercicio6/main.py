import tuplas_util

tupla_repetida = (1, 2, 3, 1, 2, 1, 3, 5, 6)
print(tupla_repetida)
seleccion = int(input("¿Qué elemento de la tupla quieres ver cuantas veces se repite?: "))
elemento_repetido = tuplas_util.contar_elementos_tupla(tupla_repetida, seleccion)
print(f"El elemento {seleccion} aparece {elemento_repetido} veces")