# Metodos útiles para trabajar con listas

# 1. append(item):  Añade un elemento al final de la lista

frutas = ["banana", "manzana"]
frutas.append("naranja")
print(frutas) # Salida: [banana, manzana, naranja]

# 2. extend(intem): Añade todos los elementos de un iterable (puede ser una lista) al final de la lista

frutas = ["banana", "manzana"]
frutas.extend(["naranja", "kiwi", "tomate"])
print(frutas)

# 3. insert(index, item) Inserta un elemento en la lista en la posición que indica el índice
frutas = ["manzana", "banana"]
frutas.insert(1, "platano")
print(frutas) # out: ['manzana', 'platano', 'banana']

# 4. remove(item) Elimina el primer elemento especificado de la lista, si no existe, genera un error
frutas = ["manzana", "banana", "naranja"]
frutas.remove("banana")
print(frutas) # out ['manzana', 'naranja']

# 5. pop([index]). Elimina y devuelve el elemento en la posicion especificada por el índice. Si no se especifica un índice elimina y devuelve el último elemento de la lista.abs
frutas = ["manzana", "banana", "naranja"]
fruit = frutas.pop(0) #Elimina y devuelve el último elemento de la lista
print("Elimino el elemento de indice o pos 0: ",frutas.pop(0))
print("pop(): ", frutas)


# 6. index(item) Devuelve el índice de la primera aparición del elemento especificado. Si no lo encuentra, genera un error
frutas = ["manzana", "banana", "naranja"]
indice = frutas.index("banana")
print(indice)

# 7. count(item) devuelve el número de veces que aparece un elemento en una lista
frutas = ["manzana", "banana", "naranja", "banana"]
cantidad = frutas.count("banana")
print("count(): ", "Las veces que se repite el item son: ", cantidad)

# 8. sort(key=None), reverse=(False) Ordena los elementos de la lista en su lugar, modificando una función key para personalizar el orden y un parámetro reserve para ordenar en orden descendente
frutas = ["manzana", "banana", "naranja"]
frutas.sort()
print(frutas)

# 9. reverse()  Invierte el orden de los elementos de la lista
frutas = ["manzana", "banana", "naranja"]
frutas.reverse()
print("reverse()", frutas)

# 10. clear() elimina todos los elementos de la lista dejándola vacía
frutas = ["manzana", "banana", "naranja"]
frutas.clear()
print("clear(): ", frutas)
print("clear() directo : ", frutas.clear())

print(type(frutas))
print(type(frutas.clear()))
