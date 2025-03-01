/* 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el número que quieras saber cuantas cifras tiene: ");
            int numero = Integer.parseInt(br.readLine());
            if (numero < 0)
                System.out.println("No se permiten números negativos");
            else if (numero < 10)
                System.out.println("El número tiene una cifra");
            else if (numero < 100)
                System.out.println("El número tiene dos cifras");
            else if (numero < 1000)
                System.out.println("El numero tiene tres cifras");
            else if (numero < 10000)
                System.out.println("El número tiene cuatro cifras");
            else{
                System.out.println("No se aceptan números superiores a 9999");

            // Otra forma más facil
            /*
            if (numero < 0 || numero >= 10000) {
                System.out.println("Por favor, ingresa un número entre 0 y 9999.");
            }
            else {
                // Convertimos el número a cadena para contar las cifras
                String numeroComoCadena = String.valueOf((int) numero); // Convierte el número a entero (sin decimales)
                int cantidadCifras = numeroComoCadena.length(); // Obtiene la cantidad de dígitos
                System.out.printf("El número tiene %d cifras.%n", cantidadCifras);
            }

            */
            }

        }
        catch (IOException e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
