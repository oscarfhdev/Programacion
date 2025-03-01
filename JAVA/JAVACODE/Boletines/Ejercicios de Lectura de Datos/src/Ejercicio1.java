import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Versión con Scanner
        Scanner scannerDePrueba = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scannerDePrueba.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scannerDePrueba.nextInt();
        int multiplicacion = num1 * num2;
        System.out.println("El resultado con Scanner es: " + multiplicacion);
        //scannerDePrueba.close();

        // Llamada a la versión con BufferedReader
        Ejercicio1ConBuffer.ejecutar();
    }

    // Clase anidada estática para realizar la misma operación usando BufferedReader
    static class Ejercicio1ConBuffer {
        public static void ejecutar() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Ingrese el primer numero (BufferedReader): ");
                int num1 = Integer.parseInt(reader.readLine());

                System.out.print("Ingrese el segundo numero (BufferedReader): ");
                int num2 = Integer.parseInt(reader.readLine());

                int multiplicacion = num1 * num2;
                System.out.println("El resultado con BufferedReader es: " + multiplicacion);
            } catch (IOException e) {
                System.out.println("Ocurrió un error al leer la entrada: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese números válidos.");
            }
        }
    }
}
