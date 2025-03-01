''' Programa que lea una cantidad en segundo y muestre su equivalente en semanas, dias, horas, minutos, segundos. Según el formato de los siguientes ejemplos: 2178585 segundos equivalen a [ 3] semanas, 4 días, 05:09:45'''
# Declaro las siguientes variables
seg_min = 60
min_hora = 60
horas_dia = 24
dias_semana = 7

# Hago conversiones, pero siguen siendo constantes
seg_hora = seg_min * min_hora
seg_dia = seg_hora * horas_dia
seg_semana = seg_dia * dias_semana

seg_totales = int(input("Introduce la cantidad de segundos: "))

semanas = seg_totales // seg_semana
resto = seg_totales % seg_semana

dias = resto // seg_dia
resto = resto % seg_dia # Aquí podemos machacar el resto de arriba porque se sobrescribe, no necesitamos lo de arriba porque ya lo ha cogido días

horas = resto // seg_hora
resto = resto % seg_hora

minutos = resto // seg_min
segundos = resto % seg_min

print(f"{seg_totales} equivalen a [{semanas:2}] semanas, {dias} dias {horas:02}:{minutos:02}:{segundos:02}")