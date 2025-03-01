'''matriz = {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
for matriz in matriz:
    print(matriz)'''

for i in range(1,4):
    for j in range(1,4):
        print(f"{i*j}", end=" ")
    print()


contador = 1
for i in range(3):
    for j in range(3):
        print(f"{contador:3}", end=" ")
        contador += 1
    print()
