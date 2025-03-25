package Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

// Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.
public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = "Este es un ejemplo de uso de FileWriter en JAVA";
        String fichero = "./Ejercicio1/datos.txt";
        try {
            // creamos un objeto FileWriter
            FileWriter fileWriter = new FileWriter(fichero);
            // escribimos una String en el archivo
            fileWriter.write(texto);
            // cerramos el FileWriter
            fileWriter.close();
            System.out.println("Se ha escrito en el fichero correctamente");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el fichero");
            e.printStackTrace();
        }
    }
}
