ph = int(input("Ingresa un valor del pH, entre 0 y 14: "))
if 0 <= ph <= 14:  
    print("Has introducido un pH de", ph)
    
    if ph > 7:
        print("El pH es Básico")
    elif ph < 7:
        print("El pH es Ácido")
    else:
        print("El pH es Neutral")
else:
    print("Introduce un valor entre 0 y 14")