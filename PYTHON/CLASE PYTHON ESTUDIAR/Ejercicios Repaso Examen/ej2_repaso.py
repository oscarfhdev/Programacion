# 2. Ejercicio: Validación de números enteros
# Crea un programa que solicite al usuario un número entero positivo. Si el número no es válido (por ejemplo, si es negativo o no es un número), el programa debe pedir que se ingrese de nuevo hasta que se ingrese un valor correcto.

while True:
    try:
        num_entero_positivo = input("Ingresa un número entero positivo: ")

        if num_entero_positivo.isdigit():
            num_entero_positivo = int(num_entero_positivo)
            if num_entero_positivo <= 0:
                raise ValueError("Error, no se pueden ingresar números negativos, ni tampoco el 0")
        else:
            raise ValueError("Ingresa un número válido...")
        break
    except ValueError as e:
        print(f"Error, {e}")
