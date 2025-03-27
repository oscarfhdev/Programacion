package Ejercicio6;

import java.io.*;

// Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.
public class Ejercicio6 {
    public static void main(String[] args) {
        File archivoDatos = new File("Ejercicio1/datos.txt");
        File archivoDestino = new File("Ejercicio6/prueba.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoDatos));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))){ // Abierto una vez

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine(); // Añadir salto de línea correctamente
            }

            System.out.println("Copia completada con éxito.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
