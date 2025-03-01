/* 7. Pedir números hasta que se introduzca uno negativo, y calcular la media. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio7 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num;
            int contador = 0;
            int sum = 0;
            double media;
            while (true) {
                System.out.print("Ingrese un numero: ");
                num = Integer.parseInt(br.readLine());
                if (num < 0)
                    break;
                contador++;
                sum = num + sum;
            }
            media = (double) sum / contador;
            System.out.println("La media es: " + media);
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
