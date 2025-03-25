package Ejercicio2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.
public class Ejercicio2 {
    public static void main(String[] args) {
        File archivoDatos = new File("Ejercicio1/datos.txt");

        try (FileReader fr = new FileReader(archivoDatos)) {
            int caracter;
            System.out.println("Contenido del archivo" + archivoDatos + " : ");
            while ((caracter = fr.read()) != -1){
                System.out.print((char) caracter);
            }
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al leer el archivo");
            e.printStackTrace();
        }
    }
}
