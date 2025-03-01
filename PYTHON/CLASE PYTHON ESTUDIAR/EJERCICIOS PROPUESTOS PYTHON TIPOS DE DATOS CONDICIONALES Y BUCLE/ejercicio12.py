#    12. Escribir un programa que pida al usuario un número entero positivo
#    y muestre por pantalla todos los números impares desde 1 hasta ese 
#    número separados por comas.
#    Programa que pide una palabra y la muestra 10 veces por pantalla


# Introducimos en la variable num_positivo un numero positivo, esto lo hacemos con input
num_positivo = int(input("Introduce un numero positivo y entero: "))


# Ahora utilizamos de nuevo un bucle for, en el que comenzara desde uno hasta el numero introducido más uno, para 
# hacer una pasada mas. Luego incrementara i de dos en dos, por eso el dos al final
for contador in range(1, num_positivo+1, 2):
    print(contador, end=", ")

# Hacemos un salto de linea
print("\n")