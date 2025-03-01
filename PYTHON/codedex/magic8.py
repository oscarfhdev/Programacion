import random

pregunta = input('Escribe aqui tu pregunta:      ')

numero_aleatorio = random.randint(1, 9)

if numero_aleatorio == 1:
  print("Si, definitivamente")
elif numero_aleatorio == 2:
  print("Eso es dificil de contestar")
elif numero_aleatorio == 3:
  print("Sin duda")
elif numero_aleatorio == 4:
  print("Pregunta mas tarde que estoy cansado")
elif numero_aleatorio == 5:
  print("No quiero ni responderte")
elif numero_aleatorio == 6:
  print("El panorama no es bueno")
elif numero_aleatorio == 7:
  print("Ni lo se ni me importa")
elif numero_aleatorio == 8:
  print("Es muy dudoso no lo se")
elif numero_aleatorio == 9:
  print("Evidentemente no, hijo")
else:
  print("Error")
  
