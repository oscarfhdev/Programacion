/* 3. Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r. */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = entrada.nextDouble();
        double longitud = 2* Math.PI * radio;
        System.out.printf("Una circunferencia con un radio de %.2f tiene una longitud de %.2f", radio, longitud);
        entrada.close();
    }
}
