#     2. Escribir un programa que pregunte el nombre del usuario en la consola y 
#     un número entero e imprima por pantalla en líneas distintas el nombre del usuario 
#     tantas veces como el número introducido.

# Introducimos en la variable nombre_usuario y numero_entero el nombre y el numero, esto lo hacemos con input
nombre_usuario = input("Introduce tu nombre de usuario:  ")
numero_entero = int(input("Introduce un numero entero:  "))

# Declaramos una variable llamada contador con un valor incial de 0
contador = 0

# Ahora con el while decimos que mientras el numero que hemos introducido sea mayor a la variable contador, se imprima el nombre de usuario.  Después se le suma 1 al contador, por lo que cuando contador llegue al numero de la variable numero_entero parará de imprimir el nombre de usuario.
while contador < numero_entero:
    print(nombre_usuario)
    contador += 1