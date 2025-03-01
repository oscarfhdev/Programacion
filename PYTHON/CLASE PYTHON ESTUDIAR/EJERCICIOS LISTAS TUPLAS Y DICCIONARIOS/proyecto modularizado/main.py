import listas_util
import diccionarios_util
import ordenar
lista_numeros_aleatorios = None
while True:
    print("\n\n")
    print("Mini Proyecto Óscar Fernández")

    print("Opciones disponibles")
    print()
    print("1: Generar lista aleatoria")
    print("2: Encontrar el número más grande y más pequeños de la lista anterior")
    print("3: Contar cuántas veces aparece cada número en la lista")
    print("4: Ordenar la lista de manera ascendente")
    print("5: Salir del programa")

    print()
    try:
        opcion = int(input("\nEscoge una opción: "))
    except ValueError:
        print("Entrada inválida, por favor ingresa un número del 1 al 5.")
        continue

    print()


    if opcion <1 or opcion > 5:
        print("Opcion invalida, vuelve a intentarlo...")
        print()

    if opcion == 1:
        lista_numeros_aleatorios = listas_util.num_aleatorios()

    elif opcion == 2:
        if lista_numeros_aleatorios is None:
            print("No has generado los números aleatorios, ve al 1")
        else:
            print(f"Esta es la lista del anterior paso: {lista_numeros_aleatorios}")
            print()
            listas_util.num_max_y_min(lista_numeros_aleatorios)

    elif opcion == 3:
        if lista_numeros_aleatorios is None:
            print("No has generado los números aleatorios, ve al 1")
        else:
            print(f"Esta es la lista del anterior paso: {lista_numeros_aleatorios}")
            print()
            diccionarios_util.contar_apariciones(lista_numeros_aleatorios)

    elif opcion == 4:
        if lista_numeros_aleatorios is None:
            print("No has generado los números aleatorios, ve al 1")
        else:
            print(f"Esta es la lista del anterior paso: {lista_numeros_aleatorios}")
            print()
            ordenar.ordenar_ascendente(lista_numeros_aleatorios)

    elif opcion == 5:
        print("Saliendo del programa...")
        break