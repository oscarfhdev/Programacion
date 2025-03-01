package PackagesobreENTRADADEDATOSenJAVA;

/* En Java, para recibir entrada de datos por teclado, utilizamos la clase Scanner.
Scanner es una clase del paquete java.util que permite leer datos desde varias fuentes, como el teclado (entrada estándar). */

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crea un obj Scanner para leer desde el teclado

        // Leemos un número entero con INT
        System.out.print("Ingrese un numero entero: ");
        int num_entero = sc.nextInt();

        // Leemos un número decimal con DOUBLE
        System.out.print("Ingrese un número decimal, (separados por ','): ");
        double num_decimal = sc.nextDouble();

        // Leemos una cadena con STRING
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.next();

        // Mostramos los valores capturados por el teclado
        System.out.println("Numero entero: " + num_entero);
        System.out.println("Numero decimal: " + num_decimal);
        System.out.println("Texto: " + texto);

        /* Puntos a destacar:
         sc.nextInt() para leer enteros.
         sc.nextDouble() para leer decimales.
         sc.next() para leer una palabra (cadena). */
    }
}
