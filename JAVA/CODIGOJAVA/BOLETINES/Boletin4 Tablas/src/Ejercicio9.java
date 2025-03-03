import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] int10array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <int10array.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            int10array[i] = sc.nextInt();
        }

        int lastElement = int10array[int10array.length-1];

        for (int i = int10array.length - 1; i > 0; i--) {
            int10array[i] = int10array[i - 1];
        }

        int10array[0] = lastElement;

        System.out.println("-------------------------");
        System.out.println("Tabla Desplazada:");
        System.out.println(Arrays.toString(int10array));
    }
}
