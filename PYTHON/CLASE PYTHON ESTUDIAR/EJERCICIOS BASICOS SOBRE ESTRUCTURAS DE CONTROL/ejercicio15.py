num_entero = int(input("Introduce un numero entero: "))

for i in range(1,num_entero+1):
    for j in range(1,i+1):
        print(j, end="")
    print()