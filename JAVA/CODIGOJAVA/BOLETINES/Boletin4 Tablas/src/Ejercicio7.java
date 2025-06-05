/* 7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int[] num10Int = new int[10];
            boolean creciente = true;
            boolean decreciente = true;
            for (int i = 0; i <num10Int.length ; i++) {
                System.out.print("Ingresa el número " + (i + 1) + " : ");
                num10Int[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < num10Int.length; i++) {
                if (num10Int[i] < num10Int[i+1]){
                    creciente = false;
                }
                if (num10Int[i] > num10Int[i+1]){
                    decreciente = false;
                }

            }

            if (creciente) {
                System.out.println("Los números están ordenados de forma creciente.");
                System.out.println(Arrays.toString(num10Int));

            }
            else if (decreciente) {
                System.out.println("Los números están ordenados de forma decreciente.");
                System.out.println(Arrays.toString(num10Int));

            }
            else {
                System.out.println("Los números están desordenados.");
                System.out.println(Arrays.toString(num10Int));
            }

            }

        catch (IOException e){
            System.out.println("Hubo un error en el sistema: " + e.getMessage());
        }

        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
