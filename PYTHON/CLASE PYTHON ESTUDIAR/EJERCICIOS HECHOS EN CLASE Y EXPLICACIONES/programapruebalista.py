# Programa que realice las siguientes acciones

# Crea una lista llamda "frutas" que contenga almenos 5 frutas
# a) Imprime la lista original
# b) Añade una nueva fruta a la lista
# c) Elimina una fruta de la lista
# d) Imprime la lista final

'''.append (elemento)
.extend (iterable)
.insert (indice, elemento)
.remove (elemento)
.pop (indice)
.count (elemento)
.reverse ()
sort ()
clear ()'''

frutas = ["sandia", "melon", "pera", "manzana", "melocoton"]
print(frutas)
frutas.append("platano")
frutas.remove("pera")
print(frutas)