def crear_diccionario(claves, valores):
    diccionario = {}
    if len(claves) != len(valores):
        raise ValueError("Las dos listas no tienen la misma longitud")
    for i in range(len(claves)):
        diccionario[claves[i]] = valores[i]
    return diccionario


# Segunda manera con ZIP, La función zip() para combinar las listas de claves y valores.
'''
def crear_diccionario(claves, valores):
    diccionario = {}
    
    # Usar zip para combinar claves y valores
    for clave, valor in zip(claves, valores):
        diccionario[clave] = valor  # Asignar la clave al valor correspondiente

    return diccionario'''