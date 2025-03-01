altura = int(input("Introduce tu altura hen cm: "))
creditos = int(input("Cuantos creditos tienes?: "))

if altura >= 137 and creditos >= 10:
    print("Adelante, disfruta del viaje")
elif altura < 137 and creditos >= 10:
    print("No tienes la altura suficiente para montar.")
elif altura >= 137 and creditos < 10:
    print("No tienes suficientes créditos.")
else:
    print("No cumples con ninguno de los requisitos!")