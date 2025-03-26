package Ejercicio6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ejercicio6 {
    public static void main(String[] args) {
        Path origen = Paths.get("EJERCICIOS PAQUETE NIO/src/Ejercicio1/prueba.txt");
        Path destino = Paths.get("EJERCICIOS PAQUETE NIO/src/Ejercicio6/prueba.txt");

        try {
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado correctamente");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
