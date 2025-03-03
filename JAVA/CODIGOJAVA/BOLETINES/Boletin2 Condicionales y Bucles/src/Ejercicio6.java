/* 6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos. */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while (true){
            System.out.print("Ingrese un número, 0 para terminar: ");
            num = sc.nextInt();
            if (num == 0)
                break;
            sum = num + sum;
        }
        System.out.println("La suma de todos los números anteriores es: " + sum);
        sc.close();
    }
}
