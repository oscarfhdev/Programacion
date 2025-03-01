ingredientes_disponibles =  ["Tomate, Queso, Nata, Cebolla, Pollo, Huevo, Salami, Anchoa, Bacon, Gamba"]

def inicializar():
    pizzeria = {
        "numero_pedidos":0,
        "codigo_pedidos":0,
        "lista_pedidos":[], #Aquí almacenamos los pedidos
    }
    return pizzeria

def agregar_pedidos(pizzeria):
    nombre = input("Introduce el nombre del cliente: ")
    telefono = input("Introduce el telefono del cliente: ")
    print("Selecciona los ingredientes: ")
    contador = 0
    for i in ingredientes_disponibles:
        print(f"{contador}, {i}")
        contador += 1

    ingredientes = []
    while len(ingredientes) < 10:
        try:
            seleccion = int(input("Seleccione el numero del ingrediente de 0-9, y el -1 para acabar: "))
            if seleccion == -1:
                break
            if seleccion <0 or seleccion >9:
                print("Seleccione un numero valido, debe de estar entre 0 y 9")
            elif ingredientes_disponibles[seleccion] in ingredientes:
                print(f"Ya has seleccionado{ingredientes_disponibles[seleccion]}. Elige otro.")
            else:
                ingredientes.append(ingredientes_disponibles[seleccion])

        except ValueError:
            print("Entrada no válida, ingrese un número.")

    numero_pedido = {
        "nombre": nombre,
        "telefono": telefono,
        "numero_ingredientes": len(ingredientes),
        "ingredientes": ingredientes,
    }

    # Agregar pedido a la lista
    pizzeria["lista_pedidos"].append(numero_pedido)
    pizzeria["numero_pedidos"] += 1
    pizzeria["codigo_pedidos"] += 1

    print(f"Pedido de {nombre} creado con éxito")
    return pizzeria

def eliminar_pedidos(pizzeria):
    codigo = int(input("Introduce el codigo del pedido a eliminar: "))
    for i in pizzeria["lista_pedidos"]:
        if i["codigo_pedido"] == codigo:
            pizzeria["lista_pedidos"].remove(i)
            print(f"El pedido con codigo {codigo} eliminado correctamente")
            return pizzeria

    print(f"El pedido no existe, no se econtró un pedido con el codigo {codigo}")
    return pizzeria

pizzeria = inicializar()
agregar_pedidos(pizzeria)
agregar_pedidos(pizzeria)
eliminar_pedidos(pizzeria)
print(pizzeria)