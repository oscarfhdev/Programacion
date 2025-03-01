# MODULARIDAD

# Un módulo en Python es un archivo que contiene definiciones y declaraciones de variables, funciones y clases. Los mósulos permiten organizar el código en partes reutilizables y separar funcionalidades dentro de un proyecto

# Para usar el contenido de un módulo en otro archivo -> import

import this
import modulo_mates
from modulo_mates import sumar as s
resultado_resta = modulo_mates.restar(5, 3)
resultado_suma = modulo_mates.sumar(5, 3)

print("Resta: ", resultado_resta)
print("Suma: ", resultado_suma)

resultado_suma = s(6, 6)
print("Suma con alias s: ", resultado_suma)
