guess = 0
tries = 0
while guess != 6 and tries <3:
  guess = int(input("Adivina el numero:  "))
  tries += 1

if guess == 6:
  print("Has acertado!")
else:
  print("Has alcanzado el numero maximo de intentos!")
