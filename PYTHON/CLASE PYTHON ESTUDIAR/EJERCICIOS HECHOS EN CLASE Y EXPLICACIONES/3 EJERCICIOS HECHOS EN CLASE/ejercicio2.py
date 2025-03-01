# Ej 2 Crea una función que reciba una cadena de texto y cuente cuantas palabras tiene

def contar_palabras(cadena):
    palabras = cadena.split()
    return len(palabras)

# Ejemplo de uso

texto = "wifn30wfm2pxm2pfm34f09i34ngonef"
print(contar_palabras(texto))
texto2 = input("Introduce un texto: ")
print(f"El texto : {texto2} , tiene: {contar_palabras(texto2)}, palabras")