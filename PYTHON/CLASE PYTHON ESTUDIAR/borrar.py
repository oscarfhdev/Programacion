minuto_actual = 14
incrementos = 0
while minuto_actual != 0:
    minuto_actual = (minuto_actual + 7) % 60
    incrementos += 1

tiempo_total = incrementos*7
print(f"Ha hecho pasar al reloj {tiempo_total} minutos, que al ir de 7 en 7 solo han sido {incrementos} incrementos")