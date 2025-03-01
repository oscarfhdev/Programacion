def calcularCelsius():
    fahrenheit = int(input('Ingresa los grados Fahrenheit: '))
    celsius = (fahrenheit-32) / 1.8
    print (str(fahrenheit)+' Fahrenheit son '+str(celsius)+' grados celsius')

calcularCelsius()