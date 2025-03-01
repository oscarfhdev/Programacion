try:
    letra = input("Ingresa una letra del abecedario: ").lower()


    if len(letra) != 1:
        raise ValueError ("La entrada debe de ser una unica letra")    


    if not letra.isalpha():
        raise ValueError("La entrada debe ser una letra")
    

    if letra == "a":
        print("La letra introducida es una vocal")
    elif letra == "e":
            print("La letra introducida es una vocal")
    elif letra == "i":
            print("La letra introducida es una vocal")
    elif letra == "o":
            print("La letra introducida es una vocal")
    elif letra == "u":
            print("La letra introducida es una vocal")

    else:
            print("La letra introducida NO es una vocal")
    


except ValueError as e:
    print(f"Error: {e}")

