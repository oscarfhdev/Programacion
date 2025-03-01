/* 10. Pedir 15 números y escribir la suma total. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio10 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int cantidadNumeros = 15;
            int num;
            int sum = 0;
            while (cantidadNumeros > 0) {
                System.out.print("Ingrese un numero: ");
                num = Integer.parseInt(br.readLine());
                sum += num;
                cantidadNumeros--;
            }
            System.out.println("La suma de los " + cantidadNumeros + " numeros son: " + sum);
        }
        catch (IOException e){
            System.out.println("Hubo un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
