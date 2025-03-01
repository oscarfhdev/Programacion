import java.util.Arrays;
import java.util.Scanner;

/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 *  - Mostrar la tabla completa de ventas.
 *  - Calcular y mostrar el total de ventas por producto.
 *  - Determinar qué producto tuvo el mayor total de ventas
 */

public class Ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ventas = new int[2][3];

        System.out.println("Introduce las ventas para cada producto en 2 días:");

        for (int dia = 0; dia < 2; dia++) {
            for (int producto = 0; producto < 3; producto++) {
                System.out.print("Ventas del producto " + (producto + 1) + " del dia " + (dia +1) + ": ");
                ventas[dia][producto] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(ventas));
    }
}


