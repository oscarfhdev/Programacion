# Ejercicio que solicita leer de dos números enteros de teclado y sumar todos los números pares en el intervalo. También se debe definir un procedimiento para la lectura correcta del intervalo y una función para calcular la suma

def leer_intervalo():
    a = int(input("Primer nuemro: "))
    b = int(input("Segundo nuemro: "))
    while a>=b:
        print("El primer numero debe de ser menor")
        a=int(input("Primer nuemro: "))
        b=int(input("Segundo nuemro: "))
        return a, b
    def suma_pares(a, b):
        suma = 0
        for i in range(a, b+1):
            if i % 2 == 0:
                suma += i
        return suma

    def main():
        n1, n2 = leer_intervalo()
        resultado = suma_pares(n1, n2)
        print(f"La suma de los números pares entre {n1} y {n2} es {resultado}")
