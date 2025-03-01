''' Programa que lea de teclado una letra minuscula (suponemos que la entrada de datos es correcta), y escriba la letra mayúscula correspondiente a la letra leída previamente'''
while True:
    try:
        # Leer una letra desde el teclado
        letra_min = str(input("Introduce una letra minuscula: "))

        # Comprobamos que se haya introducido una única letra
        if len(letra_min) != 1:
            raise ValueError ("La entrada debe de ser una unica letra")

        # Comprobamos que sea un caracter alfabético
        if not letra_min.isalpha():
            raise ValueError("La entrada debe ser una letra")

        # Comprobamos que la letra de entrada sea minuscula
        if not letra_min.islower():
            raise ValueError ("La letra debe de ser minuscula")

        print(f"Tu letra introducida '{letra_min}' ahora es '{letra_min.upper()}' ")
        break
    except ValueError as e:
        print(f"Error: {e}")
