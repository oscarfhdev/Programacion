/* 6. Pedir dos números y decir si uno es múltiplo del otro. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio6 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = Integer.parseInt(br.readLine());

            System.out.print("Ingresa el segundo número: ");
            int numero2 = Integer.parseInt(br.readLine());

            if (numero1 % numero2 == 0)
                System.out.println("Son multiplos");
            else {
                System.out.println("No son multiplos");
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
