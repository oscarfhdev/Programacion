package Ejercicio10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


// Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.
public class Ejercicio10 {
    public static void main(String[] args) {
        File archivoAEliminar = new File("informacion.txt");

        if (archivoAEliminar.delete()){
            System.out.println("Archivo eliminado correctamente");
        }
        else{
            System.err.println("Error al eliminar el archivo");
        }

        try(FileWriter fw = new FileWriter("Ejercicio10/informacion.txt")) {
            System.out.println("Creado correctamente");
        }
        catch (IOException e){
            System.err.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
