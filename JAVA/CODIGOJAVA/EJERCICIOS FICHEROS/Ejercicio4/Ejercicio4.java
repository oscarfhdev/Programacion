package Ejercicio4;

import java.io.*;

// Ejercicio 4: Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.
public class Ejercicio4 {
    public static void main(String[] args) {
        String linea;
        File archivoDatos = new File("Ejercicio1/datos.txt");
        // 🔹 Escribir en el archivo (append = true)
        try (FileWriter fw = new FileWriter(archivoDatos, true)) {
            fw.write("\nIntento apendar esto al final, quiero comprobar si funciona");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoDatos))) {
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println();
        }
    }
}
