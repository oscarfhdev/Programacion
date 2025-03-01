import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla3 = new int[tabla1.length + tabla2.length];
        boolean correct = true;

        Scanner sc = new Scanner(System.in);

        try {
            // Leer la primera serie de números
            System.out.println("Introduce la primera serie de enteros ordenados crecientemente: ");
            for (int i = 0; i < tabla1.length; i++) {
                System.out.print("Introduce el valor número " + (i + 1) + " : ");
                tabla1[i] = sc.nextInt();
            }

            // Validar si está ordenada
            for (int i = 0; i < tabla1.length - 1; i++) {
                if (tabla1[i] > tabla1[i + 1]) {
                    System.out.println("La primera serie no está ordenada crecientemente.");
                    correct = false;
                    break;
                }
            }

            // Si la primera tabla es válida, leer la segunda
            if (correct) {
                System.out.println("\nIntroduce la segunda serie de enteros ordenados crecientemente: ");
                for (int i = 0; i < tabla2.length; i++) {
                    System.out.print("Introduce el valor número " + (i + 1) + " : ");
                    tabla2[i] = sc.nextInt();
                }

                // Validar si está ordenada
                for (int i = 0; i < tabla2.length - 1; i++) {
                    if (tabla2[i] > tabla2[i + 1]) {
                        System.out.println("La segunda serie no está ordenada crecientemente.");
                        correct = false;
                        break;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingrese un número válido.");
            correct = false;
        }

        // Si las tablas son válidas
        if (correct) {
            System.out.println("Estas son las series de números introducidas:");
            System.out.println(Arrays.toString(tabla1));
            System.out.println(Arrays.toString(tabla2));

            // Fusionar las dos tablas
            int i = 0, j = 0, k = 0;

            while (i < tabla1.length && j < tabla2.length) {
                if (tabla1[i] <= tabla2[j]) {
                    tabla3[k++] = tabla1[i++];
                } else {
                    tabla3[k++] = tabla2[j++];
                }
            }

            // Agregar elementos restantes de tabla1 (si los hay)
            while (i < tabla1.length) {
                tabla3[k++] = tabla1[i++];
            }

            // Agregar elementos restantes de tabla2 (si los hay)
            while (j < tabla2.length) {
                tabla3[k++] = tabla2[j++];
            }

            // Mostrar la tabla fusionada y ordenada
            System.out.println("\nEsta es la tabla fusionada y ordenada:");
            System.out.println(Arrays.toString(tabla3));
        }

        // Si no son válidas, salir del programa
        if (!correct) {
            System.out.println("Saliendo del programa...");
        }
    }
}
