/* 1. Pedir los coeficientes de una ecuación se 2o grado, y muestre sus soluciones reales. Si no existen,debe indicarlo. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el valor de a: ");
            double a = Double.parseDouble(br.readLine());
            System.out.print("Ingresa el valor de b: ");
            double b = Double.parseDouble(br.readLine());
            System.out.print("Ingresa el valor de c: ");
            double c = Double.parseDouble(br.readLine());

            double resultadoPositivo = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double resultadoNegativo = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            if (Double.isNaN(resultadoPositivo) || Double.isNaN(resultadoNegativo)) { //Con verificar uno solo valdría también
                System.out.println("No existen soluciones reales para la ecuación.");
            } else if (resultadoPositivo == resultadoNegativo) {
                System.out.printf("Hay una única solución: %.2f%n", resultadoPositivo);
            } else {
                System.out.printf("Las soluciones son: %.2f y %.2f%n", resultadoPositivo, resultadoNegativo);
            }
        }


        catch (IOException e){
            System.out.println("Hubo un eror: " + e.getMessage());}
        catch (NumberFormatException e){
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
