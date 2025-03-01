import texto_util

texto = "hola hola adios hola adios tu tu el tu el"
texto_a_lista_separado = texto.split()

diccionario_resultado = texto_util.contar_palabras(texto_a_lista_separado)
print(diccionario_resultado)