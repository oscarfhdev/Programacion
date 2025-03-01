cont_negativo = 0
while True:
    numero = int(input("Introduce un numero negativo o positivo, 0 si quieres finalizar: "))
    if numero == 0:
        print(f"Fueron introducidos {cont_negativo} num negativos")
        break
    elif numero <0:
        cont_negativo += 1
        