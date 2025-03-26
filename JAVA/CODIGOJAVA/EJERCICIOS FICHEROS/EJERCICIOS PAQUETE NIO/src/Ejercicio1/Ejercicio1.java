package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        Path path = Paths.get("EJERCICIOS PAQUETE NIO/src/Ejercicio1/prueba.txt"); //le decimos la ruta del archivo
        List<String> contenido = List.of("Trabajando con el paquete .nio");
        try {
            Files.write(path, contenido);
            System.out.println("Datos ingresados en el archivo " + path);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}