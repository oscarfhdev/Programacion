# Tarea 1, Cada ejercicio es una función
# Habrá un menú en mi main, que será una función que invoque a otras funciones .abs

def ejercicio_1():
    nombre = input("Introduce tu nombre: ")
    print(f"¡Hola {nombre}!")

def ejercicio_14():
    #Inversión anual con interés
    cantidad = float(input("Introduce la cantidad a invertir: "))
    interes_anual = float(input("¿Que interes anual tiene tu inversion?: "))
    anos_de_inversion = int(input("¿Cuantos años va a durar tu inversion?: "))
    for contador in range(1,anos_de_inversion+1):
        cantidad+= (cantidad*interes_anual)/100
        print(f"Año {contador}: Capital acumulado: {cantidad:.2f} €")  

def ejercicio_2_8():
    # Numeros impares entre dos numeros.abs

    inicio = int(input("Introduce el primer numero: "))
    fin = int(input("Introduce el segundo numero"))

    for i in range(inicio, fin + 1, 2):
        if i % 2 == 0:
            i+= i
            print(i)
        else:
            print(i)

def main():
    while True:
        print("\nMenú de Ejercicios:")
        print("1. Saludo")
        print("2. Inversión anual")
        print("3. Numeros impares")
        print("4. Salir")
        
        opcion = input("Selecciona una opción (1-3): ")
        
        if opcion == '1':
            ejercicio_1()
        elif opcion == '2':
            ejercicio_14()
        elif opcion == '3':
            print("Saliendo del programa...")
            break        
        elif opcion == '4':
            ejercicio_2_8()
        else:
            print("Opción no válida, por favor selecciona otra.")
main()