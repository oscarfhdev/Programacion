# Ej1 Define una funcion que reciba una lista de números y retorne una nueva lista con los números pares

def es_par(num):
    return num % 2 == 0

def numero_pares(lista):
    pares = []
    for i in lista:
        if es_par(i):
            pares.append(i)
    return pares

def obtener_lista():
    lista = []
    while True:
        numeros = input("Dame números y termina con 'fin': ")
        if numeros.lower() == "fin":
            break
        numero = int(numeros)
        lista.append(numero)

    return lista

# Ejemplo de uso, prueba de las funciones, ejecución final
lista_usuarios = obtener_lista()
print(f"La lista original es : {lista_usuarios}")
print(f"La lista de numeros pares es: {numero_pares(lista_usuarios)}")

print("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::")

listilla = [1, 2, 3, 4, 5, 6]
print(numero_pares(listilla))


