def calcularBMI():
    pesokg = int(input('Ingresa tu peso en Kg: '))
    alturam = float(input('Ingresa tu altura en m: '))
    bmi = pesokg / (alturam ** 2)
    print('Tu BMI es: '+str(bmi))
calcularBMI()