#    11. Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos
#    los años que ha cumplido (desde 1 hasta su edad)

# Introducimos en la variable edad la edad, esto lo hacemos con input

edad = int(input("Introduce tu edad: "))


# Usamos un bucle for para mostrar los años cumplidos, imprimiendo al final el contador,
# en el rango le decimos que empiece en 1 y que acabe en edad+1, porque si no le sumamos
# uno, el bucle finalizará una pasada antes

for contador in range(1, edad+1):
    print(contador)