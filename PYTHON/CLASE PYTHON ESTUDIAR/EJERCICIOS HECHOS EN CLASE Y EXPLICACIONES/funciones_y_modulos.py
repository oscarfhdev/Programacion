# FUNCIONES Y MODULARIDAD

# La sintaxis básica de una función

'''def nombre_function(parametros):
        #Cuerpo de la función
        return resultado

        
def: palabra clave para definir una función 
nombre_funcion: nombre descriptivo que la identifica
parámetros: variables que recibe la función
return: devuelve un valor (opcional)'''

# Ejemplo básico

def saludar(nombre):
    print(f"Hola, {nombre}")

# llamada o invocación a la función
saludar("Carlos")


# Parámetro posicionales. Deben ser proporcionados en el mismo orden en el que se definen en la función
# Parámetros nombrados (keyword arguments) que permiten especificar un valor de manera explícita, sin importar el orden

def mostrar_info(nombre, edad):
    print(f"Nombre: {nombre}, Edad: {edad}")

# Llamada con parámetros posicionales
mostrar_info("Lucía", 25)

# Llamada con parámetros nombrados
mostrar_info(edad = 30, nombre="Paco")

# Valores por defecto en parámetros
def saludar(nombre, mensaje="Hola"):
    print(f"{mensaje}, {nombre}")

saludar("Ana")
saludar("Ana", "Buenos días")


# Funciones que devuelven valores -> return
def sumar(a, b):
    return a + b
    

# Argumentos y parametros flexibles

# Parametros poscional indefinido: "arg"
def suma (*numeros):
    total = 0
    for num in numeros:
        total += num
    return total

# Llamada a la funcion
print(suma(1,2,3,4,))

# "arg permite recibir una tupla con todos los valores que se 

# Parametros nombrados idenfinido: **kwargs
# Permite recibir un numero indefinido de parametros con nombre en forma de un diccionario

def mostrar_datos(**datos):
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")

mostrar_datos(nombre="Ana", edad=25, ciudad="Madrid")

dicc1 = {
    "Nombre": "Sara",
    "Edad": 27,
    "DNI": 17491365
}
print(dicc1)

# funciones anidadas y ámbito de variables


# Funciones dentro de una función necesita lógica adicional que no se necesita fuera de su contexto:

def operacion(opcion):
    def suma(a, b):
        return a + b
    def resta(a,b):
        return a - b
    if opcion == "sumar":
        return suma
    elif opcion == "restar":
        return resta

func = operacion("sumar")
print(func(5, 3)) # Salida: 8

func = operacion("restar")
print(func(5, 3)) # Salida: 2



# Ambito de variables: las variables definidas dentro de ina funcion tienen un ámbito local, lo que significa que no son accesibles fuera de esa función

def saludo():
    mensaje = "Hola, DAM1"
    print(id(mensaje))

saludo() #Salida; Hola, DAM1
mensaje = 0
print(id(mensaje))


# funciones Lambda: funciones anónimas
# Son funciones pequeñas y rápidas definidas en una sola línea que son útiles cuando se necesita una función para un uso temporal

# Uso de Lambda: lambda para sumar 2 números
lambda a, b: a+b
suma = lambda a, b: a+b
print(suma(5, 3))

numeros = [1, 2, 3, 4, 5]
dobles = list(map(lambda x: x*2, numeros))
print(dobles)


# Funciones como objetos. Es decir, las funciones pueden ser asignadas a variables, pasarlas como argumentos y retornarlas desde otras funciones

def saludo():
    return "Hola"


def despedida():
    return "Adiós"


# Asigna una funcion a una variable
accion = saludo
print(accion())


# Pasar funciones como argumento
def ejecutar_funcion(func):
    print(func())


ejecutar_funcion(despedida())

# Decoradores, son funciones avanzadas que permiten decorar o modificar el comportamiento de una función sin cambiar su código. Son funciones que reciben otra función como argumento y devuelven una nueva función

def decorador(func):
    def nueva_funcion():
        print("Antes de la funcion original")
        func()
        print("Después de la función original")
        return nueva_funcion()

@decorador
def saludar():
    print("Hola")
saludar()

