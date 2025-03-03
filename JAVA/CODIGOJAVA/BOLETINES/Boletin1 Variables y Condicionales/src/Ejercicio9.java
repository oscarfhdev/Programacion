/* 9. Pedir dos números y mostrarlos ordenados de mayor a menor. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = Integer.parseInt(br.readLine());

            System.out.print("Ingresa el segundo número: ");
            int numero2 = Integer.parseInt(br.readLine());

            if (numero1 > numero2)
                System.out.printf("%d %d", numero1, numero2);

            else if (numero1 == numero2)
                System.out.printf("%d es igual que %d", numero1, numero2);

            else {
                System.out.printf("%d %d", numero2, numero1);
            }
        }
        catch (IOException e) {
            System.out.println("Hubo un error" + e.getMessage());
        }

        catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
