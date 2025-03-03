/* 5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta. */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int adivino;
        while (true){
            System.out.print("Intenta adivinar el número: ");
            adivino = sc.nextInt();
            if (adivino < n)
                System.out.println("Tu número debe de ser más grande");
            else if (adivino > n) {
                System.out.println("Tu número debe de ser más pequeño");
            }
            else{
                System.out.println("Has acertado!");
                break;
            }
        }
        sc.close();
    }
}
