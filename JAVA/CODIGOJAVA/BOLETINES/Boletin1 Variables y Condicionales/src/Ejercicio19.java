/* 19. Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio19 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // Pedir primera fecha
            System.out.println("Ingrese la primera fecha:");
            System.out.print("Día: ");
            int dia1 = Integer.parseInt(br.readLine());
            System.out.print("Mes: ");
            int mes1 = Integer.parseInt(br.readLine());
            System.out.print("Año: ");
            int ano1 = Integer.parseInt(br.readLine());

            if (dia1 < 1 || dia1 > 30 || mes1 > 12 || mes1 < 1 || ano1 < 0) {
                System.out.println("La fecha introducida es incorrecta!");
            }
            else {
                System.out.println("La fecha introducida es correcta!");
            }

            // Pedir segunda fecha
            System.out.println("Ingrese la segunda fecha:");
            System.out.print("Día: ");
            int dia2 = Integer.parseInt(br.readLine());
            System.out.print("Mes: ");
            int mes2 = Integer.parseInt(br.readLine());
            System.out.print("Año: ");
            int ano2 = Integer.parseInt(br.readLine());

            if (dia2 < 1 || dia2 > 30 || mes2 > 12 || mes2 < 1 || ano2 < 0) {
                System.out.println("La fecha introducida es incorrecta!");
            }
            else {
                System.out.println("La fecha introducida es correcta!");
            }

            // Convertir ambas fechas a días totales
            int totalDias1 = (ano1 * 360) + (mes1 * 30) + dia1;
            int totalDias2 = (ano2 * 360) + (mes2 * 30) + dia2;

            int diferenciaDias = Math.abs(totalDias1 - totalDias2);

            System.out.println("Esta es la primera fecha introducida: " + dia1 + "/" + mes1 + "/" + ano1);
            System.out.println("Esta es la segunda fecha introducida: " + dia2 + "/" + mes2 + "/" + ano2);
            System.out.println("La diferencia de días entre ambas fechas es: " + diferenciaDias + " días.");

        } catch (IOException e) {
            System.out.println("Hubo un error de entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
    }
}