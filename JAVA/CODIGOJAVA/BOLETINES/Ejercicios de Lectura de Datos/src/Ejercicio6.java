/*Ejercicio 6. Escribe un programa que calcule el área de un triángulo. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio6 {
    public static void main(String[] args) {
       try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           System.out.print("Ingresa la base del triángulo: ");
           double b = Double.parseDouble(br.readLine());
           System.out.print("Ingresa la altura del triángulo: ");
           double h = Double.parseDouble(br.readLine());
           double area = (b*h)/2;
           System.out.printf("El área del triangulo es %.2f", area);
       }
       catch (IOException e){
           System.out.println("Hubo un error" + e.getMessage());
       }

       catch (NumberFormatException e){
           System.out.println("Por favor, ingresa un numero válido");
       }
    }
}
