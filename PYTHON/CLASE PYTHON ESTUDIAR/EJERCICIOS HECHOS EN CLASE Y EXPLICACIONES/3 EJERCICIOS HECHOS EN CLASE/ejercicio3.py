# Ej 3 Escribe una función que utilice "args" y "kwargs" para aceptar múltiples parámetros y los imprima como formato

def imprimir_datos(*args, **kwargs):
    print("Argumentos posicionales", args)
    print("Argumentos nombrados:", kwargs)

# Ejemplo de uso de la función Ej3
imprimir_datos(1,2,3,4,5, nombre = "Juan", edad = 30)
