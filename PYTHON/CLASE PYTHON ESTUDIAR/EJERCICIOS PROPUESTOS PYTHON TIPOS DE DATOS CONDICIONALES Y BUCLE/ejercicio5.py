#    5. Una juguetería tiene mucho éxito en dos de sus productos: payasos y muñecas.
#    Suele hacer venta por correo y la empresa de logística les cobra por peso de cada 
#    paquete así que deben calcular el peso de los payasos y muñecas que saldrán en  
#    cada paquete a demanda. Cada payaso pesa 112 g y cada muñeca 75 g. Escribir un 
#    programa que lea el número de payasos y muñecas vendidos en el último pedido y calcule
#    el peso total del paquete que será enviado.


# Introducimos en la variable num_payasos y num_muñecas el numero de payasos y el numero de muñecas, esto lo hacemos con input

num_payasos = int(input("Ingresa el numero de payasos del ultimo pedido: "))
num_muñecas = int(input("Ingresa el numero de muñecas del ultimo pedido: "))

# Ahora en el print multiplicamos el numero de payasos y de muñecas por su paso, y lo sumamos, mostrando el resultado por pantalla
print("El peso en total del paquete en gramos son:",num_payasos*112 + num_muñecas*75 ,"gr")
