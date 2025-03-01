# Definir 'lista' como una lista utilizando corchetes []
lista = [1, 2, 3, 4, 5]
lista_recibida = input("Introduce una lista de números, separados por comas: ").split(',')


# Añadir un elemento extra a esta lista
#lista += [4]
lista.append(4)
print(lista)

#Modificar el primer elemento de la lista por el numero 10
#lista[0] = 10

print(lista)



# Iterar directamente sobre los elementos de la lista
for contador in lista:
    print(contador)


