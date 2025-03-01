def es_primo(num):
    if num <= 1:
        return False
    
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False 
    return True


numero_1 = int(input("Ingresa el numero 1:  "))
numero_2 = int(input("Ingresa el numero 2:  "))

if numero_1 > numero_2:
    numero_1, numero_2 = numero_2, numero_1

for contador in range(numero_1, numero_2+1):
    if es_primo(contador):
        print(contador)