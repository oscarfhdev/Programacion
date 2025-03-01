#   13. Escribir un programa que pida al usuario un número entero positivo y muestre por
#   pantalla la cuenta atrás desde ese número hasta cero separados por comas.

# Introducimos en la variable num_positivo un numero positivo, esto lo hacemos con input
num_positivo = int(input("Introduce un numero positivo y entero: "))


# Ahora utilizamos de nuevo un bucle for, en el que comenzara desde el numero introducido hasta -1 uno, para 
# hacer una pasada mas. Luego decrementará i de uno en uno, por eso el -1 al final
for contador in range(num_positivo, -1, -1):
    print(contador)


# Hacemos un salto de linea
print("\n")