/* 12. Pedir un número y calcular su factorial. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio12 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el número del que quieras conocer su factorial: ");
            int num = Integer.parseInt(br.readLine());
            int factorial = 1;
            for (int i = num; i >= 1; i--) {
                factorial*= i;
            }
            System.out.printf("El factorial de %d es %d%n" ,num ,factorial);
            }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
