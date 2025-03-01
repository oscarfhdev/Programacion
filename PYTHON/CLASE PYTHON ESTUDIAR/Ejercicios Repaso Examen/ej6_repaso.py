# 6. Ejercicio: Búsqueda en una lista
# Crea un programa que permita al usuario ingresar varios nombres de personas y luego buscar si un nombre específico está en la lista. Si el nombre existe, muestra su posición en la lista; si no, indica que no se encontró.

lista_nombres = []

# Recolectar nombres

iteracion = 1
while True:
    name = input(f"Ingrese el nombre {iteracion}, ingresa 'end' para acabar: ")
    if name == 'end':
        break

    lista_nombres.append(name)
    iteracion += 1

# Buscar un nombre en la lista
nombre_a_buscar = input("Ingrese el nombre que desea buscar: ")
if nombre_a_buscar in lista_nombres:
    print(f"El nombre {nombre_a_buscar} está en la posición {lista_nombres.index(nombre_a_buscar)+1}")
else:
    print(f"El nombre {nombre_a_buscar} no se encuentra en la lista")