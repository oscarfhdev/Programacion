Gryffindor = 0
Ravenclaw = 0
Hufflepuff = 0
Slytherin = 0


p1 = int(input("P1) ¿Te gusta el Amanecer o el Atardecer?\n\n1) Amanecer\n2) Atardecer\n\nIntroduce el número de tu respuesta: "))

if p1 == 1:
    Gryffindor, Ravenclaw= Gryffindor+1, Ravenclaw+1
    print("El valor de Gryffindor se ha incrementado en 1, ahora es:",Gryffindor, ",y el valor de Ravenclaw también se ha incrementado en 1, ahora es:",Ravenclaw)

elif p1 == 2:
    Hufflepuff, Slytherin= Hufflepuff+1, Slytherin+1
    print("El valor de Hufflepuff se ha incrementado en 1, ahora es:",Hufflepuff, ",y el valor de Slytherin también se ha incrementado en 1, ahora es:",Slytherin)

else:
    print("Entrada incorrecta.")



p2 = int(input("\n\nP2) Cuando esté muerto, quiero que la gente me recuerde como: \n \n1) El bueno \n2) El grandioso \n3) El sabio \n4) El valiente \n\nIntroduce el número de tu respuesta: "))

if p2 == 1:
    Hufflepuff += 2
    print("El valor de Hufflepuff se ha incrementado en 2, ahora es:",Hufflepuff)

elif p2 == 2:
    Slytherin += 2
    print("El valor de Slytherin se ha incrementado en 2, ahora es:",Slytherin)

elif p2 == 3:
    Ravenclaw += 2
    print("El valor de Ravenclaw se ha incrementado en 2, ahora es:",Ravenclaw)

elif p2 == 4:
    Gryffindor += 2
    print("El valor de Gryffindor se ha incrementado en 2, ahora es:",Gryffindor)

else:
    print("Entrada incorrecta.")


p3 = int(input("\n\nP3) ¿Qué instrumento te agrada más escuchar?: \n \n1) El violin \n2) La trompeta \n3) El piano \n4) El tambor \n\nIntroduce el número de tu respuesta: "))

if p3 == 1:
    Slytherin += 4
    print("El valor de Slytherin se ha incrementado en 4, ahora es:",Slytherin)

elif p3 == 2:
    Hufflepuff += 4
    print("El valor de Hufflepuff se ha incrementado en 4, ahora es:",Hufflepuff)

elif p3 == 3:
    Ravenclaw += 4
    print("El valor de Ravenclaw se ha incrementado en 4, ahora es:",Ravenclaw)

elif p3 == 4:
    Gryffindor += 4
    print("El valor de Gryffindor se ha incrementado en 4, ahora es:",Gryffindor)

else:
    print("Entrada incorrecta.")



ganador = max(Gryffindor,Ravenclaw,Hufflepuff,Slytherin)

if Gryffindor == ganador:
    print(f"\n\n¡Gryffindor ha ganado con {Gryffindor} puntos!")
elif Ravenclaw == ganador:
    print(f"\n\nRavenclaw ha ganado con {Ravenclaw} puntos!")
elif Hufflepuff == ganador:
    print(f"\n\nHufflepuff ha ganado con {Hufflepuff} puntos!")
elif Slytherin == ganador:
    print(f"\n\nSlytherin ha ganado con {Slytherin} puntos!")

