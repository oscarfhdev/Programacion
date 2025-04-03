package Ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.
public class Ejercicio7 {
    public static void main(String[] args) {
        File archivoDatos = new File("Ejercicio1/datos.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(archivoDatos))){
        String palabraBuscada = "final";
        String linea;
        int apariciones = 0;

        while ((linea = br.readLine()) != null){
            String[] palabras = linea.trim().split("\\s+");
            for (String palabra : palabras){
                if(devolverSinSignos(palabra).equals(palabraBuscada)) {
                    apariciones++;
                }
            }
        }

            System.out.println("La palabra buscada: " + palabraBuscada + " aparece " + apariciones + " veces");
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un erro: " + e.getMessage());
        }
    }

    // Método para limpiar signos de puntuación
    private static String devolverSinSignos(String palabra) {
        return palabra.replaceAll("[^a-zA-Z0-9]", ""); // Quita signos de puntuación
    }
}
