package Ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


// Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola.
public class Ejercicio5 {
    public static void main(String[] args) {
        File archivoDatos = new File("Ejercicio1/datos.txt");
        int contadorPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoDatos))) {
            String linea;

            while ((linea = br.readLine()) != null) { // Leer línea por línea
                String[] palabras = linea.trim().split("\\s+"); // Divide por espacios y saltos de línea
                contadorPalabras += palabras.length;
            }

            System.out.println("El número total de palabras es: " + contadorPalabras);

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
