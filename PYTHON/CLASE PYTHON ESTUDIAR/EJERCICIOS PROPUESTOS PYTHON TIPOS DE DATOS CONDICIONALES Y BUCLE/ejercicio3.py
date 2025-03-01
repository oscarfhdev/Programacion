#    3. Escribir un programa que pregunte el nombre del usuario en la consola y después 
#    de que el usuario lo introduzca muestre por pantalla el nombre en mayúsculas y el
#    número de caracteres que contiene en líneas distintas

# Introducimos en la variable nombre el nombre, esto lo hacemos con input
nombre = input("Introduce tu nombre: ")

# Ahora con .upper ponemos la variable nombre en MAYUSCULAS y lo imprimimos
print(nombre.upper())

# Con len, podemos contar cuantos caracteres tiene nuestro nombre, y lo imprimimos
print(len(nombre))