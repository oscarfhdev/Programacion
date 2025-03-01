/* Ejercicio 4. Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado. */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        System.out.printf(" La suma de los numeros %d y %d es: %d%n ", num1, num2, suma);
        System.out.printf("La resta de los numeros %d y %d es: %d%n ", num1, num2, resta);
        System.out.printf("La multiplicación de los numeros %d y %d es: %d%n ", num1, num2, multiplicacion);
        System.out.printf("La division de los numeros %d y %d es: %d%n ", num1, num2, division);

        sc.close();
    }
}
