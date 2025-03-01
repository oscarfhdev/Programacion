def nota():
    calificacion = int(input('Ingresa un número del 0-10: '))
    if 0 <= calificacion <= 10:
        if calificacion <= 5:
            print('Has supendido, suerte para la proxima')
        elif  5 >= calificacion < 6:
            print("suficiente")
        elif  6 >= calificacion < 7:
             print("BIEN")
        elif 7 >=  calificacion < 9: 
            print("NOTABLE")
        elif 9 >=  calificacion < 10:
            print("SOBRESALIENTE")
        elif calificacion == 10:
            print("MATRÍCULA DE HONOR")


    else:
        print('El numero que has introducido no esta dentro del rango establecido')

nota()