# Funciones iterativas
#
# Las que repiten una operación o varias operaciones hasta que se cumple una condición
from math import factorial


# Son útiles cuando se necesita procesar una colección de datos o se desea realizar una tarea repetitiva un numero específico de veces

# Factorial de un número N. Es el producto de todos los números enteros positivos menores o iguales a ese número.abs


def factorial_iterativa():
    n = int(input("Ingresa el numero que quieres ver el factorial: "))
    contador = 1
    factorial = 1
    while contador <= n:
        factorial *= contador
        contador += 1

    print(f"El factorial de {n} es {factorial}")

factorial_iterativa()

# Ejemplo rápido de uso

