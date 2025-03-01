#    7. Escribir un programa que pida al usuario dos números y muestre por pantalla su división. 
#    Si el divisor es cero el programa debe mostrar un error.


# Introducimos en la variable num_1 y num_2 el dividendo y el divisor, esto lo hacemos con input
num1 = int(input("Introduce el valor del numero 1: "))
num2 = int(input("Introduce el valor del numero 2: "))


# Ahora ponemos un if, en el que si num2 es igual a 0, muestra un mensaje de error
if num2 == 0:
    print("Error")

# Si num2 es distinto a 0, se hará la división y se mostrará por pantalla
else:
    resultado_divison = num1/num2
    print("El resultado de la divison entre", num1, "y", num2, "es", resultado_divison)