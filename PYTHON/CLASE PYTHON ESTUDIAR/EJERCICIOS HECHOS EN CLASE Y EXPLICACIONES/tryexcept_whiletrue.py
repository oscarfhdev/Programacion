while True:
    try:
        n1 = int(input("Escribe un numero: "))
        n2 = int(input("Escribe un numero: "))
        print(f"El resultado es {round(n1/n2)}")
        break
    except ValueError:
        print(f"Nº no introducido")
    except ZeroDivisionError:
        print(f"No se puede dividir por 0.")