package Ejercicio8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


 //Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.
public class Ejercicio8 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("Ejercicio1/datos.txt"))){
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null){
                contador++;
            }

            System.out.println("Líneas totales del archivo: " + contador);

        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
