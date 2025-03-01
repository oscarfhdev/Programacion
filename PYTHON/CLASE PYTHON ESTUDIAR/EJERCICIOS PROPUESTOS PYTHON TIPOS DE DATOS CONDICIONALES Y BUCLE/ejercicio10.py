#    10. Escribir un programa que pida al usuario una palabra y la muestre 10 veces por
#    pantalla.


# Introducimos en la variable palabra una cadena de caracteres, esto lo hacemos con input

palabra = input("Introduce una palabra: ")


# Usamos un bucle for para mostrar la palabra 10 veces, range comienza desde el 0 y avanza hasta el 9 veces, por lo
# que contador va a incrementarse hasta 9, ahí finalizará. Cada vez que hace una pasada imprime la palabra

for contador in range(10):
    print(palabra)
