#    Escribir un programa que pida al usuario dos números y devuelva su división. Si el 
#    usuario no introduce números debe devolver un aviso de error y si el divisor es cero también.

# Introducimos en la variable num_1 y num_2 el dividendo y el divisor, esto lo hacemos con input
num1 = int(input("Introduce el valor del numero 1: "))
num2 = int(input("Introduce el valor del numero 2: "))

# Si por ejemplo en estos dos input de arriba introducimos letras, nos dará error, ya que le pedimos que introduzca un int (entero)

# Ahora ponemos un if, en el que si num2 es igual a 0, muestra un mensaje de error
if num2 == 0:
    print("Error")

# Si num2 es distinto a 0, se hará la división y se mostrará por pantalla
else:
    resultado_divison = num1/num2
    print("El resultado de la divison entre", num1, "y", num2, "es", resultado_divison)