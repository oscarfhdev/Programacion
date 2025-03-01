package PackagesobreENTRADADEDATOSenJAVA;

import java.util.Scanner;

public class EntradaAvanzada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leer una cadena completa (con espacios)
        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine(); // leerá toda la línea

        // Leer un carácter
        System.out.println("Introduce una carácter:");
        char caracter = entrada.next().charAt(0); // lee sólo el primer carácter

        // Mostramos los datos capturados:
        System.out.println("Frase completa: " + frase);
        System.out.println("Caracter: " + caracter);

        /* Puntos a destacar:
            nextLine() lee toda la línea de texto, a diferencia de next() que solo captura hasta el primer espacio.
            Para capturar un carácter individual, usamos charAt(0) después de next(). */
    }
}
