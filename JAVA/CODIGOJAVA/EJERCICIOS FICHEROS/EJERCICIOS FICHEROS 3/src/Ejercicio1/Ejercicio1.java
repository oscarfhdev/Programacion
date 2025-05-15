package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    //Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo 'numeros.txt'.
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("EJERCICIOS FICHEROS 3/Documentos/numeros.txt"))){
            String linea;
            String[] lineaSeparada;
            Integer numeroMinimo = null;
            Integer numeroMaximo = null;
            while ((linea = br.readLine()) != null){
                lineaSeparada = linea.split("\\s+");
                for(String numero : lineaSeparada){
                    int n = Integer.parseInt(numero);
                    if (numeroMinimo == null || n < numeroMinimo){
                        numeroMinimo = n;
                    }
                    if (numeroMaximo == null || n > numeroMaximo){
                        numeroMaximo = n;
                    }
                }
            }
            System.out.println("Numero maximo: " + numeroMaximo);
            System.out.println("Numero minimo: " + numeroMinimo);
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
