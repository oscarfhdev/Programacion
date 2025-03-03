import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] int10array = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < int10array.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int10array[i] = sc.nextInt();
        }

        System.out.println("Esta es tu tabla: " + Arrays.toString(int10array));

        int posicion;
        do {
            System.out.print("Ingresa la posición a eliminar (entre 0 y 9): ");
            posicion = sc.nextInt();
        } while (posicion < 0 || posicion > 9);

        for (int i = posicion; i < int10array.length - 1; i++) {
            int10array[i] = int10array[i + 1];
        }

        // Asignar un valor nulo al último elemento
        int10array[int10array.length - 1] = 0;

        System.out.println("Tabla después de eliminar el elemento en la posición " + posicion + ":");
        System.out.println(Arrays.toString(int10array));
    }
}
