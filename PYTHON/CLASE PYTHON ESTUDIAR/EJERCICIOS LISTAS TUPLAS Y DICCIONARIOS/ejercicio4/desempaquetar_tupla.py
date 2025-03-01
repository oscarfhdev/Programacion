prueba_tupla = (20, 10, 30)

def desempaquetar_tupla(tupla):
    a, b, c = tupla
    return a, b, c

a, b, c = desempaquetar_tupla(prueba_tupla)

print(a, b, c)
