/* 5. Pedir un número e indicar si es positivo o negativo. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa un número: ");
            int numero = Integer.parseInt(br.readLine());
            if (numero < 0)
                System.out.println("El numero no es negativo");
            else {
                System.out.println("El numero es positivo");
            }
        }
        catch (IOException e) {
            System.out.println("Hubo un error"+ e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
