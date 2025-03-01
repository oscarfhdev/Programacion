#   6. Escribir un programa que pregunte al usuario su edad y muestre por 
#   pantalla si es mayor de edad o no.


# Introducimos en la variable edad la edad, esto lo hacemos con input

edad = int(input("Introduce tu edad: "))

# Aquí tenemos un if, esto hará que si la variable edad es mayor o igual a 18 imprimirá un mensaje
if edad >= 18:
    print("Felicidades, eres mayor de edad!")

# Si no es mayor o igual a 18, mostrará lo de abajo    
else:
    print("Lo siento, no eres mayor de edad")