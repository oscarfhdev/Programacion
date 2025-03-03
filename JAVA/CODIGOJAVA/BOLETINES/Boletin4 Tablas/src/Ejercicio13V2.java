import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tablaparesimpares = new int[10];
        int indicePar = 0; // Comienza desde el inicio
        int indiceImpar = tablaparesimpares.length - 1; // Comienza desde el final

        // Leer los números en la tabla original
        for (int i = 0; i < tabla1.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " de la lista: ");
            tabla1[i] = sc.nextInt();
        }

        // Clasificar pares e impares usando los índices
        for (int i = 0; i < tabla1.length; i++) {
            if (tabla1[i] % 2 == 0) { // Número par
                tablaparesimpares[indicePar] = tabla1[i];
                indicePar++;
            } else { // Número impar
                tablaparesimpares[indiceImpar] = tabla1[i];
                indiceImpar--;
            }
        }

        System.out.println("Tabla con pares seguidos de impares: " + Arrays.toString(tablaparesimpares));
    }
}
