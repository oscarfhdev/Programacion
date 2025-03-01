import random

print('Bienvenido a Piedra, Papel o Tijera')
def piedraPapelTijeras():
    tu_eleccion = input('Ingresa con lo que quieres jugar: "piedra", "papel", "tijeras": ')
    print(f'Has elegido: {tu_eleccion}')

    if tu_eleccion not in ['piedra', 'papel', 'tijeras']:
            print("Opción no válida. Por favor, elige piedra, papel o tijeras.")

def resultadoAleatorio():
    opciones = ['piedra', 'papel', 'tijeras']
    return random.choice(opciones)


def ganador():
    if tu_eleccion == resultadoAleatorio:
        print ('Habeis sacado lo mismo, es un empate')
piedraPapelTijeras()
