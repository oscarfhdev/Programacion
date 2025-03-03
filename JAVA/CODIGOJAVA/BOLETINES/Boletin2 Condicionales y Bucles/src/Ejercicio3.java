/* 3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = 1;

            while (n != 0) {
                System.out.print("Ingrese un número, 0 para acabar: ");
                n = Integer.parseInt(br.readLine());

                if (n == 0) {
                    break;
                } else if (n % 2 == 0) {
                    System.out.println("El número introducido es par");
                } else {
                    System.out.println("El número introducido es impar");
                }
            }

            System.out.println("Finalizando...");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
