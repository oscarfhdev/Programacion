/* Ejercicio 5. Escribe un programa que calcule el área de un rectángulo. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ingresa la base del rectangulo: ");
            double b = Double.parseDouble(br.readLine());
            System.out.print("Ingresa la altura del rectangulo: ");
            double h = Double.parseDouble(br.readLine());
            double area = b*h;
            System.out.printf("El area del rectangulo es: %.2f ", area);
        }
        catch (IOException e){
            System.out.println("Hubo un error"+ e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Ingresa un numero válido!");
        }
    }
}
