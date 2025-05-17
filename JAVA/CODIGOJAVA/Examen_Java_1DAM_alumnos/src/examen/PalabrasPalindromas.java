package src.examen;

import java.io.*;

public class PalabrasPalindromas {

    /**
     * Analiza un archivo de entrada (texto_palindromos.txt) y escribe en un archivo de salida (palindromos_encontrados.txt)
     * todas las palabras únicas que son palíndromas, una por línea, ordenadas.
     * Al final debe añadirse el total de palíndromos encontrados.
     *
     * @param entrada Ruta al archivo de texto de entrada.
     * @param salida Ruta al archivo de texto de salida.
     *
     * Ejemplo de salida:
     * acaso
     * anita
     * reconocer
     * Total: 3 palíndromos encontrados
     */

    public static void generarPalindromos(String entrada, String salida) {
        // TODO: Implementar según el enunciado
        try(BufferedReader br = new BufferedReader(new FileReader(entrada))) {
            String linea;
            String[] lineaSeparada;
            while ((linea = br.readLine()) != null){
                lineaSeparada = linea.split("\\s+");
                for (String palabraseparada : lineaSeparada){
                   StringBuilder sb = new StringBuilder();
                    // NO ME DA TIEMPO, COOMPRUEBO SI ES IGUAL AL COMPARAR CON EL MÉTODO .reverse
                    // LO GUARDO EN UNA LISTA SI ES IGUAL Y LUEGO LO ESCRIBO CON EL BUFFER WRITTER
                    }
                }
            }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }




        try (BufferedWriter br = new BufferedWriter(new FileWriter(salida))){

        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }



    public static void main(String[] args) {
        // Puedes probar aquí tu metodo
    }
}
