/* 4. Pedir dos números y decir si son iguales o no. */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        if (num1 == num2) {
            System.out.println("Los números son iguales !");
        }
        else {
            System.out.println("Los números no coinciden!");
        }
    }
}
