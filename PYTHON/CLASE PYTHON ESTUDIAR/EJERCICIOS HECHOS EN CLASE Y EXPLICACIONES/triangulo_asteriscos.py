# Dinujar un triáng3 EJERCICIOS HECHOS EN CLASEulo de asteriscos con altura N

# El ejercicio solicita leer un numero entero N del teclado para dibujar el triángulo de asteriscos


# Se deben definir almenos tres subprogramas

# Ejemplo de output: triangulo de altura 4
# .
# ..
# ...
# ....

''' MI SOLUCIÓN
def dibujar_linea(fila):
    for i in range(fila):
        print("*", end="")
    print()

def imprimir_triangulo(altura):
    for fila_triangulo in range(1, altura + 1):
        dibujar_linea(fila_triangulo)

def main():
    altura = int(input("Ingresa la altura del triángulo: "))
    imprimir_triangulo(altura)

main()'''

# solucion profesor
def dibujar_linea(n):
    print("*" * n)

def dibujar_triangulo(n):
    for i in range(1, n+1):
        dibujar_linea(2*i - 1)

def main():
    n = int(input("Ingresa la altura del triangulo: "))
    dibujar_triangulo(n)
main()