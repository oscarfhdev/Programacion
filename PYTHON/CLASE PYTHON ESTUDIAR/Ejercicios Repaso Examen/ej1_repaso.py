# 1. Ejercicio: Crear una lista de nombres
#Crea un programa que pida al usuario que ingrese cinco nombres, uno por uno, y los guarde en una lista. Al final, el programa debe imprimir todos los nombres ingresados.


def lista_nombres():
    lista_de_nombres= []
    for i in range(5):
        nombre = input("Ingrese un nombre: ")
        lista_de_nombres.append(nombre)
    print(lista_de_nombres)
lista_nombres()
