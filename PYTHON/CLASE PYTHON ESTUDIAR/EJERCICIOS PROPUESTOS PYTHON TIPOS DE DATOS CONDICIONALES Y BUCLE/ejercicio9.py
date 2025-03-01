#   9. Escribir un programa para una empresa que tiene salas de juegos para todas las
#   edades y quiere calcular de forma automática el precio que debe cobrar a sus
#   clientes por entrar. El programa debe preguntar al usuario la edad del cliente y
#   mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar gratis,
#   si tiene entre 4 y 18 años debe pagar 5€ y si es mayor de 18 años, 10€.

# Introducimos en la variable edad_cliente la edad, esto lo hacemos con input
edad_cliente = int(input("Introduce la edad del cliente: "))

# Ponemos un if en el que si el numero de edad_cliente es menor a 4 imprime este mensaje
if edad_cliente < 4:
    print ("El cliente no debe pagar nada")

# Aquí ponemos un elif para que si no se cumple la de arriba comprobar esta, revisando que estén entre 4 y 18 ambos incluidos    
elif edad_cliente >= 4 and edad_cliente <= 18:
    print ("El cliente debe de pagar 5€")

# Si no es nada de lo otro imprmimos el mensaje de abajo
else:
    print("El cliente debe de pagar 10€")