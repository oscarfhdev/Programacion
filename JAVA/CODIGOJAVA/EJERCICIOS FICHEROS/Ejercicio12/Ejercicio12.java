package Ejercicio12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

// Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.
public class Ejercicio12 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("Ejercicio12/datos.csv"))) {
            String linea;

            while ((linea = br.readLine()) != null){
                String[] lineaSeparada = linea.split(",");
                // System.out.println(Arrays.toString(lineaSeparada));
                System.out.printf("%-10s %-5s %-10s%n", lineaSeparada[0], lineaSeparada[1], lineaSeparada[2]);
            }

        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
