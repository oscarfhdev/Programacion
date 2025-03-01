import random

def num_aleatorios():
    lista_aleatorios = []
    while True:
        try:
            cantidad_lista = int(input("¿De cuántos números quieres ver la lista aleatoria?: "))
            if cantidad_lista <= 0:
                raise ValueError("no se pueden ingresar números negativos, ni tampoco el 0")
            break
        except ValueError as e:
            print(f"Error, {e} , intentalo de nuevo...")

    for i in range(cantidad_lista):
        numero = random.randint(0, 100)
        lista_aleatorios.append(numero)
    print(f"Lista de aleatorios generada aleatoriamente: {lista_aleatorios}")
    return lista_aleatorios


def num_max_y_min(lista_aleatorios):
    numero_max = max(lista_aleatorios)
    numero_min = min(lista_aleatorios)
    print(f"El numero máximo es: {numero_max} y el número mínimo es: {numero_min}")
    return numero_max, numero_min