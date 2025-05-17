package src.examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que busca un patrón en un archivo de texto usando expresiones regulares.
 */
public class BuscadorPatrones {

    /**
     * Cuenta cuántas veces aparece un patrón en el archivo indicado.
     *
     * @param rutaArchivo Ruta del archivo de texto.
     * @param palabra Palabra regular a buscar.
     * @return Número de coincidencias encontradas.
     */
    public static int contarCoincidencias(String rutaArchivo, String palabra) {
        int contador = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            String[] lineaSeparada;
            while ((linea = br.readLine()) != null){
                lineaSeparada = linea.split("\\s+");
                for (String palabraseparada : lineaSeparada){
                    if(palabraseparada.equalsIgnoreCase(palabra)){
                        contador++;
                    }
                }
            }
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        return contador;
    }

    public static void main(String[] args) {
        String ruta = "resources/datos.txt";
        String patron = "examen"; // buscar la palabra exacta "examen"
        int resultado = contarCoincidencias(ruta, patron);
        System.out.println("Coincidencias encontradas: " + resultado);
    }
}
