import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero != -1) {
            System.out.print("Ingresa un número para obtener su cuadrado, -1 para finalizar: ");
            numero = sc.nextInt();

            if (numero != -1) {
                int cuadrado = numero * numero;
                System.out.printf("El cuadrado del número %d es %d%n", numero, cuadrado);
            }
            else {
                System.out.println("Finalizando...");
                sc.close();
            }
        }
    }
}
