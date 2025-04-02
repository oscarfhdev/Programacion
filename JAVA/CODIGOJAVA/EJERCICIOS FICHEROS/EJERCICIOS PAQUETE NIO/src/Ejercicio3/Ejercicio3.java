package Ejercicio3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        Path path = Paths.get("EJERCICIOS PAQUETE NIO/src/Ejercicio1/prueba.txt"); //le decimos la ruta del archivo
        try {
            List<String> lineas = Files.readAllLines(path, StandardCharsets.UTF_8);

             // Imprime cada línea del archivo por consola
            for (String linea : lineas){
                System.out.println(linea);
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
