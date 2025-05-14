# **Ficheros de texto y paso de parámetros por línea de comandos**

## 1 Introducción a los ficheros en Java

En Java, los ficheros son una herramienta esencial para almacenar y recuperar datos de manera persistente. A diferencia de las variables y estructuras de datos en memoria, la información contenida en un fichero no se pierde cuando el programa finaliza.

Los ficheros pueden utilizarse para:

* Almacenar configuraciones de un programa.  
* Guardar datos de usuarios y sesiones.  
* Registrar eventos mediante logs.  
* Mantener bases de datos simples sin la necesidad de un gestor de bases de datos.

Java proporciona varias clases para la gestión de archivos dentro del paquete java.io, como FileReader, FileWriter, BufferedReader y BufferedWriter, entre otras.

## 2 Lectura de un fichero de texto

La lectura de ficheros de texto en Java se puede realizar utilizando BufferedReader junto con FileReader. A continuación se muestra un ejemplo:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ejemplo.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}


```

Este programa abre el fichero ejemplo.txt y lee cada línea hasta alcanzar el final del archivo, mostrando el contenido en la consola.

## 3 Escritura sobre un fichero de texto

Para escribir en un fichero de texto en Java se usa BufferedWriter junto con FileWriter.

Ejemplo de escritura en un archivo:

import java.io.BufferedWriter;  
import java.io.FileWriter;  
import java.io.IOException;

````java
public class EscribirFichero {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ejemplo.txt"));
            bw.write("Hola, este es un archivo de texto.");
            bw.newLine();
            bw.write("Segunda línea de texto.");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}


````

Este programa crea el archivo ejemplo.txt y escribe dos líneas de texto en él.

## 4 Lectura y escritura combinadas

En algunos casos, es necesario leer un archivo, modificar su contenido y escribirlo de nuevo. Esto se puede hacer abriendo dos flujos de datos simultáneamente: uno para lectura y otro para escritura.

Ejemplo:

```java
import java.io.*;

public class LeerEscribirFichero {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea.toUpperCase()); // Convierte el texto a mayúsculas
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error en la lectura o escritura: " + e.getMessage());
        }
    }
}

```

Este programa lee el contenido de entrada.txt, lo transforma en mayúsculas y lo guarda en salida.txt.

## 5 Otras operaciones sobre ficheros

Java permite realizar diversas operaciones con ficheros utilizando la clase File:

### 5.1 Comprobar si un fichero existe

```java
import java.io.File;

public class ComprobarFichero {
    public static void main(String[] args) {
        File archivo = new File("ejemplo.txt");
        if (archivo.exists()) {
            System.out.println("El fichero existe.");
        } else {
            System.out.println("El fichero no existe.");
        }
    }
}

```

### 5.2 Obtener información de un fichero

```java
File archivo = new File("ejemplo.txt");
System.out.println("Nombre: " + archivo.getName());
System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
System.out.println("Tamaño: " + archivo.length() + " bytes");

```

### 5.3 Eliminar un fichero

```java
if (archivo.delete()) {
    System.out.println("El archivo fue eliminado correctamente.");
} else {
    System.out.println("No se pudo eliminar el archivo.");
}

```

## 6 Paso de argumentos por línea de comandos

Un programa en Java puede recibir argumentos desde la línea de comandos, lo que es útil para la manipulación de ficheros.

Ejemplo:

```java
public class Argumentos {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumento recibido: " + args[0]);
        } else {
            System.out.println("No se han pasado argumentos.");
        }
    }
}

```

Este programa imprime el primer argumento pasado al ejecutar el programa desde la terminal:

java Argumentos HolaMundo

## 7 Procesamiento de archivos de texto

El procesamiento de archivos de texto en Java permite realizar tareas como reemplazar palabras, eliminar caracteres o reordenar líneas.

Ejemplo de procesamiento:

```java
import java.io.*;

public class ReemplazarTexto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            linea = linea.replace("Java", "Python"); // Reemplaza "Java" por "Python"
            bw.write(linea);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

```

## 8 Ejercicios

1. Escribe un programa que lea un fichero de texto y muestre cuántas líneas tiene.  
2. Crea un programa que copie el contenido de un fichero en otro.  
3. Realiza un programa que reciba un fichero como argumento y muestre cuántas veces aparece una palabra dada.  
4. Implementa un programa que borre un fichero si el usuario confirma su eliminación.

---

Este capítulo proporciona las bases para el manejo de ficheros en Java, abarcando lectura, escritura, manipulación y procesamiento de archivos de texto.

