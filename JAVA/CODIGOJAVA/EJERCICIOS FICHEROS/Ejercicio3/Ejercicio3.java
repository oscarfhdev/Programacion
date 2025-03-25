package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.
public class Ejercicio3 {
    public static void main(String[] args) {
        File archivoDatos = new File("Ejercicio1/datos.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoDatos))) {
            String linea;
            System.out.println("Contenido del archivo" + archivoDatos + " : ");
            while ((linea = br.readLine()) != null){ // Lee línea por línea hasta el final del archivo
                System.out.print(linea);
            }
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al leer el archivo");
            e.printStackTrace();
        }
    }
}
