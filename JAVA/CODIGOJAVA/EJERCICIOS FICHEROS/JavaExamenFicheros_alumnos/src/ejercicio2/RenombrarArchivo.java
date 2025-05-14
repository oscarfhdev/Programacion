package ejercicio2;

import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        // TODO: Renombrar el archivo "resources/info9.txt" a "resources/datos9.txt" si existe
        File archivoOrigen = new File("resources/info9.txt");
        File nombreNuevo = new File("resources/datos9.txt");

        if (archivoOrigen.exists()) {
            archivoOrigen.renameTo(nombreNuevo);
            System.out.println("Archivo renombrado correctamente");
        } else {
            System.out.println("Error");
        }
    }
}
