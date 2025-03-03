/* 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el número que quieras saber cuantas cifras tiene: ");
            int numero = Integer.parseInt(br.readLine());
            if (numero < 0 || numero >= 10000) {
                System.out.println("Por favor, ingresa un número entre 0 y 9999.");
            }
            else {
                String numeroComoCadena = String.valueOf(numero);
                String numeroInvertido = new StringBuilder(numeroComoCadena).reverse().toString();
                System.out.println("El número con las cifras invertidas es: " + numeroInvertido);
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
