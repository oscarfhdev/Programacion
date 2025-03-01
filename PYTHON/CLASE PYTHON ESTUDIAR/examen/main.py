import ingrediente_preferido
import mostrar_pedidos
numero_pedidos = 0
codigo_pedidos = 0
lista_pedidos = []
while True:

    print("Índice Gestión de pedidos de una pizzería")
    print("\n1: Inicializar pizzería ")
    print("2: Agregar pedido")
    print("3: Eliminar pedido a partir del código")
    print("4: Buscar un pedido por nombre")
    print("5: Ver el ingrediente más utilizado")
    print("6: Mostrar todos los pedidos actuales")
    print("7: Salir \n")

    seleccion = int(input("\nSelecciona una opción: "))
    if seleccion == 1:
        # Ponemos los valores a 0, inicializando la pizería, ponemos global para que afecte a los elementos de arriba
        def inicializar_pizzeria():
            global numero_pedidos
            global codigo_pedidos
            global lista_pedidos
            numero_pedidos = 0
            codigo_pedidos = 0
            lista_pedidos = []
        inicializar_pizzeria()

    if seleccion == 2:
        # Creamos la función para agregar un pedido
        def agregar_pedido():
            global lista_pedidos
            global codigo_pedidos
            global numero_pedidos
            lista_ingredientes_ofrecidos = ["Tomate", "Queso", "Nata", "Cebolla", "Pollo", "Huevo", "Salami", "Anchoa",
                                            "Bacon", "Gamba"]
            lista_ingredientes_elegidos = []
            print("\n \n")
            print("Estos son los ingredientes disponibles: ")
            print(
                "0: 'Tomate', \n1: 'Queso', \n2: 'Nata',\n3: 'Cebolla',\n4: 'Pollo', \n5: 'Huevo', \n6: 'Salami', \n7: 'Anchoa', \n8: 'Bacon', \n9: 'Gamba'")

            print()
            nombre = input("Ingresa tu nombre: ")
            telefono = input("Ingresa tu telefono: ")
            numero_ingredientes = int(input("Ingresa el número de ingredientes que quieres ponerle a la pizza: "))
            try:
                if numero_ingredientes <= 10:
                    for i in range(numero_ingredientes):
                        ingrediente = int(input(
                            "Ingresa el números del ingrediente(anteriormente mostrado) que quieres ponerle a la pizza: "))
                        print("Has seleccionado", lista_ingredientes_ofrecidos[ingrediente])
                        lista_ingredientes_elegidos.append(lista_ingredientes_ofrecidos[ingrediente])
                        print("Ingrediente añadido")
                    print(
                        f"Estos son los {numero_ingredientes} ingredientes de tu pizza: {lista_ingredientes_elegidos}")
                else:
                    raise ValueError("Debe de haber entre 1 y 10 ingredientes")
            except ValueError as a:
                print(a)

            diccionario_pedido = {}
            diccionario_pedido["nombre"] = nombre
            diccionario_pedido["telefono"] = telefono
            codigo_pedidos += 1
            diccionario_pedido["codigo_pedidos"] = codigo_pedidos
            diccionario_pedido["numero_ingredientes"] = numero_ingredientes
            diccionario_pedido["ingredientes"] = lista_ingredientes_elegidos
            try:
                if len(lista_pedidos) < 20:
                    lista_pedidos.append(diccionario_pedido)
                else:
                    raise ValueError("Debe de haber un máximo de 20 pedidos")
            except ValueError as b:
                print(b)
            print(f"Este es tu pedido: \n {diccionario_pedido}")
            numero_pedidos += 1
        agregar_pedido()

        if seleccion == 3:
            def eliminar_pedido():
                global lista_pedidos
                global numero_pedidos
                print("Estos son los pedidos actuales")
                print(lista_pedidos)
                pedido_eliminar = (int(input("Ingresa el código de pedido que deseas eliminar: ")))
                for i in lista_pedidos:
                    if i["codigo_pedidos"] == pedido_eliminar:
                        lista_pedidos.remove(i)
                        numero_pedidos -= 1
            eliminar_pedido()

    if seleccion == 4:
        def buscar_pedido_por_nombre():
            global lista_pedidos
            try:
                nombre = input("Ingresa tu nombre, y buscamos tu pedido: ")
                for i in lista_pedidos:
                    if i["nombre"] == nombre:
                        print(f"Este es tu pedido: \n {i}")
                    else:
                        raise ValueError("Error, Aún no tenemos un pedido con tu nombre")
            except ValueError as c:
                print(c)

    if seleccion == 5:
        ingrediente_preferido.ingrediente_preferido(lista_pedidos)

    if seleccion == 6:
        mostrar_pedidos.mostrar_pedidos(lista_pedidos)
    if seleccion == 7:
        (print("Saliendo del programa..."))
        break



