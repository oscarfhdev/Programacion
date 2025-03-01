numero = int(input("Escribe el numero entero y positivo del que quieres calcular el factorial:  "))
resultado_factorial = 1
for contador in range(numero, 0, -1):
    resultado_factorial*= contador 


print(f"{numero}! = {resultado_factorial}")