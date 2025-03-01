package PackagesobreENTRADADEDATOSenJAVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntradaDatosBufferedReader {
    public static void main(String[] args) {
        // Se crea un objeto BufferedReader para leer
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        //Creo las variables que voy a recoger
        String nombre;
        int edad;

        try {
            // Leemos una cadena de texto por teclado
            System.out.println("Introduce tu nombnre:");
            nombre = lector.readLine();

            System.out.println("Introduce tu edad:");
            edad = Integer.parseInt(lector.readLine());

            // Mostramos los datos capturados en el buffer

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
