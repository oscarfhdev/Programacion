package src.examen;

import java.io.File;

/**
 * Clase que lista todos los archivos y carpetas de un directorio dado.
 */
public class ListadorDirectorios {
    /**
     * Lista el contenido del directorio especificado.
     *
     * @param rutaDirectorio Ruta absoluta o relativa del directorio.
     * @return Array de cadenas con el nombre y tipo de cada elemento.
     */
    public static String[] listarContenido(String rutaDirectorio) {
        // TODO: Implementar el listado de archivos y carpetas

        File directorioAListar = new File(rutaDirectorio);
        String[] contenidoDirectorio = directorioAListar.list();

        return contenidoDirectorio;
    }

    public static void main(String[] args) {
        String ruta = "resources/";
        String[] resultado = listarContenido(ruta);
        for (String s : resultado) {
            System.out.println(s);
        }
    }
}
