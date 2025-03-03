import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] int10array = new int[10];
        boolean ordenada = true;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            int10array[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            if (int10array[i] > int10array[i+1]) {
                System.out.println("La tabla no está ordenada");
                ordenada = false;
                break;
            }
        }
        System.out.println("Esta es tu tabla: " + Arrays.toString(int10array));

        if (ordenada) {
            for (int i = 5; i < int10array.length; i++) {
                System.out.print("Ingresa el número " + (i + 1) + " : ");
                int numeroIngresado = sc.nextInt();
                for (int j = 0; j < int10array.length; j++) {
                    if (numeroIngresado < int10array[j]) {
                        for (int k = int10array.length - 1; k > j; k--) {
                            int10array[k] = int10array[k - 1];
                        }
                        int10array[j] = numeroIngresado;
                        break;
                    }

                }

            }
        }
        System.out.println("Esta es tu nueva tabla: " + Arrays.toString(int10array));

    }
}
