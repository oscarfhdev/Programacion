# **Ejercicio: Sistema de Gestión de Inventario de Productos**

## **Enunciado:**

Se te ha encargado crear un sistema para gestionar el inventario de productos de una tienda utilizando los principios de Programación Orientada a Objetos (POO). Este sistema debe incluir funcionalidades de entrada y salida de datos (E/S), así como el uso de variables, estructuras de control de flujo y arrays. A continuación, se detallan los requisitos del ejercicio:

---

## **Clases del sistema:**

### **1. Clase `Producto`**
- **Atributos**:
    - `codigo` (int): Código único del producto.
    - `nombre` (String): Nombre del producto.
    - `precio` (double): Precio del producto.
    - `cantidadStock` (int): Cantidad disponible en el inventario.

- **Métodos**:
    - `Producto(int codigo, String nombre, double precio, int cantidadStock)`: Constructor que inicializa los atributos.
    - `mostrarInformacion()`: Muestra la información del producto.
    - `reducirStock(int cantidad)`: Reduce el stock en la cantidad especificada, validando que no se supere el stock disponible.
    - `incrementarStock(int cantidad)`: Aumenta el stock en la cantidad especificada.

---

### **2. Clase `Inventario`**
- **Atributos**:
    - `productos` (Array de objetos `Producto`): Lista de productos en el inventario.

- **Métodos**:
    - `agregarProducto(Producto producto)`: Agrega un nuevo producto al inventario.
    - `buscarProducto(int codigo)`: Busca un producto en el inventario por su código y devuelve el objeto `Producto` correspondiente.
    - `mostrarInventario()`: Muestra toda la lista de productos en el inventario.
    - `venderProducto(int codigo, int cantidad)`: Disminuye el stock de un producto al realizar una venta. Muestra un mensaje si no hay suficiente stock disponible.

---

### **3. Clase `GestionInventario` (Programa Principal)**
- Presenta un menú que permita al usuario realizar las siguientes operaciones:
  ```
  1. Agregar un nuevo producto
  2. Mostrar inventario
  3. Vender un producto
  4. Salir
  ```
- Implementa un bucle para mostrar el menú hasta que el usuario elija la opción "Salir".
- Utiliza estructuras de control de flujo (`if-else`, `switch`, bucles) para manejar las opciones del menú.

---

## **Requisitos adicionales:**
1. Manejar correctamente entradas y salidas de datos (por teclado y consola).
2. Validar las entradas del usuario, por ejemplo, asegurando que los números ingresados para cantidad o precios sean válidos.
3. Gestionar los errores, como intentar vender un producto que no existe o con stock insuficiente.

---

## **Ejemplo de ejecución esperada:**

```--- Menú de Gestión de Inventario ---

Agregar un nuevo producto
Mostrar inventario
Vender un producto
Salir Elige una opción (1-4): 1
Introduce el código del producto: 101 Introduce el nombre del producto: Ordenador portátil Introduce el precio del producto: 750.99 Introduce la cantidad en stock: 15 Producto agregado correctamente.

--- Menú de Gestión de Inventario --- Elige una opción (1-4): 2

Productos en inventario: Código: 101, Nombre: Ordenador portátil, Precio: 750.99, Stock: 15

--- Menú de Gestión de Inventario --- Elige una opción (1-4): 3

Introduce el código del producto: 101 Introduce la cantidad a vender: 5 Venta realizada correctamente. Stock restante: 10.

--- Menú de Gestión de Inventario --- Elige una opción (1-4): 4

Saliendo del sistema...
````