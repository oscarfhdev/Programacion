num_multiplicar = int(input("¿De que numero quieres saber la tabla de multiplicar? : "))

for contador in range (1,11):
    print(f"{num_multiplicar}x{contador} = {num_multiplicar*contador}")