# 5. Ejercicio: Crear una lista de ingredientes para hacer una pizza Escribe un programa que permita al usuario seleccionar ingredientes de una lista de ingredientes predefinidos para hacer una pizza. El usuario puede elegir hasta 5 ingredientes, y al final el programa debe mostrar los ingredientes seleccionados.

ingredientes_disp = ["Tomate", "Queso", "Nata", "Cebolla", "Pollo", "Champis", "Bacon"]
ingredientes_sel = []


print(f"Ingredientes disponibles: \n {ingredientes_disp}")

while len(ingredientes_sel) < 5:
    try:
        sel = int(input("Seleccione un ingrediente (0-6), ingresa '999' para acabar: "))
        if sel == 999:
            break
        if sel < 0 or sel > 6:
            print("Ingrediente invalido, selecciona entre 0 y 5")
        elif ingredientes_disp[sel] in ingredientes_sel:
            print(f"Ya lo has seleccionado {ingredientes_disp[sel]} , elige otro")

        else:
            ingredientes_sel.append(ingredientes_disp[sel])
            print(f"Has seleccionado: {ingredientes_disp[sel]}")

    except ValueError:
        print("Entrada invalida, debes ingresar un numero")

print(f"\nLos ingrediente seleccionados para tu pizza son: {ingredientes_sel}")

