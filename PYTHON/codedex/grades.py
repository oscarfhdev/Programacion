def suspensoAprobado():
    calificacion = int(input('Ingresa un número del 0-100: '))
    if 0 <= calificacion <= 100:
        if calificacion >= 55:
            print('Felicidades, ¡Has aprobado!')

        else:
            print('Has supendido, suerte para la proxima')
    else:
        print('El numero que has introducido no esta dentro del rango establecido')

suspensoAprobado()