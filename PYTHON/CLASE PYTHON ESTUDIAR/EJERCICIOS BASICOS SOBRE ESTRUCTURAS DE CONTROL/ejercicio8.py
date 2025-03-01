numero1 = int(input("Introduce un numero: "))
numero2 = int(input("Introduce otro numero: "))

if numero1 > numero2:
    numero1, numero2 = numero2, numero1

if numero1 % 2 == 0:
      numero1 += 1

print(f"\n Números impares entre {numero1-1} y {numero2}:")
20
for i in range(numero1, numero2 +1, 2):
        print(i)
