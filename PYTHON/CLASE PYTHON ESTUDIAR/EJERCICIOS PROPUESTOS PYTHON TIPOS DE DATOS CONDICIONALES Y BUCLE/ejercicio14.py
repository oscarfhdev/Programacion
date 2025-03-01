#   14. Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual
#    y el número de años, y muestre por pantalla el capital obtenido en la inversión cada
#    año que dura la inversión.

# Introducimos en la variable cantidad la cantidad a invertir, esto lo hacemos con input, por si pone 
# decimales lo ponemos float.
cantidad = float(input("Introduce la cantidad a invertir: "))

# Aquí le pedimos al usuario que ingrese el interes, normalmente el interes tiene decimales, por lo que
# tambien lo ponemos float
interes_anual = float(input("¿Que interes anual tiene tu inversion?: "))

# Introducimos en la anos_de inversion los años, esto lo hacemos con input y le permitimos un entero
anos_de_inversion = int(input("¿Cuantos años va a durar tu inversion?: "))

# Aquí mediante un bucle for, le decimos que a partir de 1 haga tantas pasadas como años haya introducido, por eso el +1
for contador in range(1,anos_de_inversion+1):
    cantidad+= (cantidad*interes_anual)/100    # Aquí le calculamos los beneficios y se los sumamos a la variable cantidad

    # Luego imprimimos por pantalla los beneficios de cada año, y cantidad le ponemos l :.2f para mostrarlo con dos decimales
    print(f"Año {contador}: Capital acumulado: {cantidad:.2f} €")  

    
