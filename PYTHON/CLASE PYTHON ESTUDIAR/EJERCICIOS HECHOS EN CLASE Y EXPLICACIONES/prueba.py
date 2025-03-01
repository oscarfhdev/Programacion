'''cuenta = 0
for i in range(2,36):
    print(i)
    cuenta += 1

print(cuenta)'''

inicio = int(input("Introduce el primer numero: "))
fin = int(input("Introduce el segundo numero"))

for i in range(inicio, fin + 1, 2):
    if i % 2 == 0:
        i+= i
        print(i)
    else:
        print(i)

