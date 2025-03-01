n = int(input("Introduce cuántos números de la serie de Fibonacci deseas ver: "))
a, b = 0, 1
contador = 0
while contador < n:
    print(a)
    a, b = b, a + b
    contador += 1   