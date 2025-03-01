# Crea un programa que imprima todas las tablas de multiplicar del 1 al 9 ambos incluidos
# Por ejemplo 1*1=1
#Pista de eficencia: utiliza dos bucles anidados

for contador in range(1,10):
    for i in range(1,11):
        print(f"{contador}x{i} = {contador*i}")

    print("\n\n")