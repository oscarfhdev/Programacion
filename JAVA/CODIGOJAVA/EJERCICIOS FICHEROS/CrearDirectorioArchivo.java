import java.io.File;
import java.io.IOException;

public class CrearDirectorioArchivo{
    public static void main(String[] args) {
        // Nombre del directorio a crear
        String nombreDirectorio = "miDirectorio";

        // Crear el objeto File para el directorio
        File directorio = new File(nombreDirectorio);

        // Crear el directorio
        if (directorio.mkdir()) {
            System.out.println("Directorio creado: " + directorio.getAbsolutePath());
        } else {
            System.out.println("No se pudo crear el directorio o ya existe.");
        }

        // Nombre del archivo dentro del directorio
        String nombreArchivo = "archivo.txt";

        // Crear el objeto File para el archivo dentro del directorio
        File archivo = new File(directorio, nombreArchivo);

        try {
            // Crear el archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear el archivo o ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
}