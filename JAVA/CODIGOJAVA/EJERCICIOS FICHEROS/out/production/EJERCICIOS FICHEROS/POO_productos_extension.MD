# **MEJORAS y REPASO: Sistema de Gestión de Inventario de Productos**
### A continuación, se repsasarán las mejoras realizadas en el ejercicio de gestión de inventario de productos, así como la teoría de Programación Orientada a Objetos (POO) aplicada en el ejercicio.

## **Enunciado:**

Se te ha encargado crear un sistema para gestionar el inventario de productos de una tienda utilizando los principios de Programación Orientada a Objetos (POO). Este sistema debe incluir funcionalidades de entrada y salida de datos (E/S), así como el uso de variables, estructuras de control de flujo y arrays. A continuación, se detallan los requisitos del ejercicio:

---

## **Características de la POO presentes en el ejercicio**

1️⃣ Encapsulación (✔️ Correcto)  

  * Los atributos de Producto son privados y se acceden mediante métodos getter y setter.    
  * Se usan modificadores de acceso adecuados (private, public) para proteger los datos.
  * Se evita el acceso directo a los atributos desde otras clases.

2️⃣ Herencia (❌ No aplica)    

🚨 Falta herencia en el diseño del ejercicio.  

  * No hay una superclase genérica (Articulo o Item) de la cual Producto herede.  
  * Si se quiere expandir el sistema con productos físicos y digitales, habría que modificar Producto en lugar de crear clases especializadas.
  * No se aprovechan las ventajas de la herencia, como la reutilización de código y la organización de clases en una jerarquía.

📌 ¿Cómo agregarla?  

  *   Crear una clase base Articulo con nombre, precio, cantidadStock y hacer que Producto herede de ella.  

3️⃣ Polimorfismo (❌ No aplica)  

  🚨 No hay uso de polimorfismo en el código.

  * No hay métodos sobrecargados ni sobreescritos (@Override solo en toString podría ser útil).  
  * No se usa una interfaz (InterfazProducto) para permitir diferentes implementaciones de productos.  

📌 ¿Cómo mejorarlo?

  * Se podría agregar sobrecarga de métodos en Inventario, permitiendo buscar un producto por nombre o por código.  
  * Implementar una interfaz InterfazProducto para permitir productos de diferentes tipos en el futuro.  
Ejemplo de sobrecarga en buscarProducto:

```java

public Producto buscarProducto(String nombre) {
for (Producto producto : productos) {
if (producto.getNombre().equalsIgnoreCase(nombre)) {
return producto;
}
}
return null;
}
```

4️⃣ Abstracción (✔️ Correcto)

  * **Producto** representa un producto individual.  
  * **Inventario** gestiona una colección de productos.  
  * **GestionInventario** maneja la interacción con el usuario.  

📌 ¿Cómo mejorarlo?

La abstracción podría mejorar ocultando más detalles internos, por ejemplo, usando métodos private dentro de Inventario para evitar que GestionInventario manipule la estructura interna directamente.

5️⃣ Composición️ (✔️ Correcto)

  * Inventario contiene una lista de productos.    
  * GestionInventario utiliza un objeto Inventario para gestionar los productos.  

La composición es una relación donde un objeto contiene otro objeto como atributo en su estructura. Se usa para modelar relaciones más realistas en los sistemas.  

📌 Mejorando la Composición:

* Se podría mejorar la composición permitiendo que GestionInventario tenga un Inventario como atributo, en lugar de crear un nuevo Inventario cada vez que se inicia el programa. Esto permitiría mantener la información entre ejecuciones.  

* Podemos mejorar la composición añadiendo clases que representen otros elementos del inventario. Por ejemplo, una clase Venta que contenga información sobre las ventas realizadas, o una clase Reporte que genere informes sobre el inventario.  

* Otro caso común de composición es cuando un producto pertenece a una categoría (Electrónica, Ropa, Alimentos, etc.). Se podría crear una clase Categoría que contenga una lista de productos y métodos para gestionarlos.



## **Persistencia en un archivo CSV.**

### **¿Qué es un CSV?**  

Un CSV (Comma-Separated Values) es un archivo de texto plano donde los datos están separados por comas o por otro delimitador (como ; o |). Se usa comúnmente para almacenar datos tabulares (como hojas de cálculo o bases de datos).

```csv
codigo,nombre,precio,stock,proveedor
1,Camiseta,15.99,50,Nike`
2,Pantalón,29.99,30,Adidas`
3,Zapatos,39.99,20,Puma`
``` 
📌 Ventajas de CSV:  

  ✔ Ligero y fácil de leer con cualquier editor de texto.  
  ✔ Compatible con Excel y bases de datos.  
  ✔ Se puede procesar fácilmente con BufferedReader en Java.  

📌 Desventajas de CSV:  

  ❌ No soporta estructuras complejas (listas dentro de listas, relaciones anidadas).  
  ❌ No tiene tipos de datos explícitos (todo es texto).  
  ❌ Problemas con comas dentro de los valores (si un nombre lleva una coma, hay que encerrarlo entre comillas).  

📌 ¿Qué vamos a hacer?  

  ✅ Guardar los productos en un archivo inventario.csv cada vez que se agregue un producto.  
  ✅ Cargar los productos desde el archivo inventario.csv al iniciar el programa.  
  ✅ Usar BufferedWriter y BufferedReader para manejar el archivo de manera eficiente.  

## **Persistencia con JSON**

### **¿Qué es un JSON?**

Un JSON (JavaScript Object Notation) es un formato ligero de intercambio de datos que se utiliza para almacenar y transmitir información estructurada. Es fácil de leer y escribir para los humanos, y fácil de parsear y generar para las máquinas.

```json
[
  {
    "codigo": 1,
    "nombre": "Camiseta",
    "precio": 20.99,
    "cantidadStock": 50,
    "proveedor": {
      "nombre": "Nike",
      "telefono": "123456789"
    }
  },
  {
    "codigo": 2,
    "nombre": "Zapatos",
    "precio": 49.99,
    "cantidadStock": 20,
    "proveedor": {
      "nombre": "Adidas",
      "telefono": "987654321"
    }
  }
]

````
📌 Ventajas de JSON: ✔ Estructura más flexible (permite anidación de objetos). 

  ✔ Más fácil de leer para humanos y máquinas.  
  ✔ Compatible con muchas tecnologías (APIs, bases de datos NoSQL como MongoDB).  
  ✔ Java tiene bibliotecas como Gson o Jackson para manejar JSON de manera sencilla.  

📌 Desventajas de JSON:  

  ❌ Un poco más pesado que CSV, pero la diferencia es mínima en pequeños archivos.   
  ❌ No es directamente compatible con Excel, pero se puede convertir fácilmente.  

📢 Resumen de la mejora con JSON:  
  
  ✅ Ahora los productos se guardan en inventario.json, lo que permite una mejor organización de los datos.   
  ✅ El inventario se carga automáticamente al iniciar, sin perder la información.  
  ✅ Cada vez que se vende un producto o se añade uno nuevo, el archivo se actualiza.  
  ✅ Usamos Gson para convertir automáticamente objetos Java en JSON y viceversa.  


---

## **Objetivo del Sistema de Reportes**

✅ Generar un reporte en formato .txt o .csv con la información del inventario.   
✅ Incluir productos con stock bajo (por ejemplo, menos de 5 unidades).    
✅ Permitir que el usuario genere el reporte desde el menú.    
