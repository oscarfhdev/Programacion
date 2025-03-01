# Metodo 1: Usando un diccionario con dict.fromkeys
def eliminar_duplicados(lista):
    return list(dict.fromkeys(lista))

# Metodo 2: Usando set, pero sin orden garantizado
# def eliminar_duplicados(lista):
#     return list(set(lista))  # Convierte a set y luego a lista

# Metodo 3: Implementación manual
# def eliminar_duplicados(lista):
#     lista_sin_duplicados = []
#     for i in lista:
#         if i not in lista_sin_duplicados:
#             lista_sin_duplicados.append(i)
#     return lista_sin_duplicados