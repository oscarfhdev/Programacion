import funciones_calculadora
from  funciones_calculadora import input_usuario

print("Estas son las funciones de la calculadora: ")
print("")
print("1 - Sumar")
print("2 - Restar")
print("3 - Multiplicar")
print("4 - Dividir")
print("5 - Pontencial")
print("6 - Raiz")
print("7 - Salir")
print("")

while True:
    entrada = int(input("Ingrese la opción que deseas escoger: "))
    print("")
    if entrada == 1:
        print(funciones_calculadora.sumar(input_usuario(), input_usuario()))
    elif entrada == 2:
        print(funciones_calculadora.restar(input_usuario(), input_usuario()))
    elif entrada == 3:
        print(funciones_calculadora.multiplicar(input_usuario(), input_usuario()))
    elif entrada == 4:
        print(funciones_calculadora.dividir(input_usuario(), input_usuario()))
    elif entrada == 5:
        print(funciones_calculadora.potencial(input_usuario(), input_usuario()))
    elif entrada == 6:
        print(funciones_calculadora.raiz(input_usuario()))
    elif entrada == 7:
        print("Finalizando...")
        break
    else:
        print("Ingresa uno de los números establecidos")
        print("\n")



