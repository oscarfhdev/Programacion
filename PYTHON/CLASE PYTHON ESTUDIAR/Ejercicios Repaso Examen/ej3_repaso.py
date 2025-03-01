# 3. Ejercicio: Contar ocurrencias de elementos en una lista
# Escribe un programa que reciba una lista de palabras y cuente cuántas veces aparece cada palabra. Imprime los resultados.

palabras = ["manzana", "pera", "manzana", "pera", "naranaja", "pera"]
conteo_palabras = {}

for i in palabras:
    if i in conteo_palabras:
        conteo_palabras[i] += 1
    else:
        conteo_palabras[i] = 1
print(f"Conteo de palabras: {conteo_palabras}")


'''# MANERA 2
palabras_solas = []
conteo_palabras = []
for i in palabras:
    if i in palabras_solas:
        index = palabras_solas.index(i)
        conteo_palabras[index] += 1
    else:
        palabras_solas.append(i)
        conteo_palabras.append(1)

for j in range(len(conteo_palabras)):
    print(f"{palabras_solas[j]} : {conteo_palabras[j]}")'''
