import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] int10array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <int10array.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            int10array[i] = sc.nextInt();
        }


        System.out.print("Cuantas veces quieres desplazar la tabla?: ");
        int numDesplazamientos = sc.nextInt();

        numDesplazamientos = numDesplazamientos % int10array.length;

        for (int i = 0; i < numDesplazamientos; i++) {
            int lastElement = int10array[int10array.length - 1];

            for (int j = int10array.length - 1; j > 0; j--) {
                int10array[j] = int10array[j - 1];
            }

            int10array[0] = lastElement;
        }

        System.out.println("-------------------------");
        System.out.println("Tabla Desplazada:");
        System.out.println(Arrays.toString(int10array));
    }
}
