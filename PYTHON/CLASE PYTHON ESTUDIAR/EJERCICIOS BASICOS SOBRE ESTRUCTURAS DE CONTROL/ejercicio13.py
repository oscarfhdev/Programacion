import random

numero = random.randint(1, 100)

intento_adivinar = int(input("Se ha escogido un numero aleatorio entre 1 y 100, intenta adivinarlo: "))

if intento_adivinar == numero:
    print("Felicidades, has acertado!")
else:
    while intento_adivinar != numero:
        print("Intenta otra vez..")
        
        if numero <= 50:
            if numero <= 25:
                print("El número es menor o igual a 25.")
            else:
                print("El número es menor o igual a 50 pero mayor a 25.")
        else:
            if numero < 75:
                print("El número es mayor de 50 pero menor de 75.")
            else:
                print("El número es mayor o igual a 75.")

        intento_adivinar = int(input("Intenta adivinarlo: "))

    print("Felicidades, has acertado!")
