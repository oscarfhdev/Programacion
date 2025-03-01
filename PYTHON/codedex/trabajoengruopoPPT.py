import randomh

print('Bienvenido a Piedra, Papel o Tijera, desarrollado por el grupo de "Los Bicholovers, los integrantes somos:"')
print('')
print('Jonathan Moreno Carrasco')
print('Daniel Beltran Ruiz')
print('Oscar Fernandez Hernandez')
print('')

def piedraPapelTijeras():
    opciones = ['piedra', 'papel', 'tijeras']
    

    tu_eleccion = input('Ingresa con lo que quieres jugar: "piedra", "papel", "tijeras": ').lower()
    

    if tu_eleccion not in opciones:
        print("Opción no válida. Por favor, elige piedra, papel o tijeras.")
        return 
    

    eleccion_computadora = random.choice(opciones)
    print('Has elegido: '+tu_eleccion)
    print('La computadora eligió: '+eleccion_computadora)
    
    
    if tu_eleccion == eleccion_computadora:
        print('Habeis sacado lo mismo, es un empate')
    elif (tu_eleccion == 'piedra' and eleccion_computadora == 'tijeras') or \
         (tu_eleccion == 'papel' and eleccion_computadora == 'piedra') or \
         (tu_eleccion == 'tijeras' and eleccion_computadora == 'papel'):
        print('Ganaste, porque la computadora saco '+eleccion_computadora+' y tu sacaste '+tu_eleccion)
    else:
        print('Perdiste, porque la computadora saco '+eleccion_computadora+' y tu sacaste '+tu_eleccion)

piedraPapelTijeras()
