/* Ejercicio 7. Escribe un programa que calcule el total de una factura a partir de la base imponible. */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.print("Ingresa la cantidad de la base imponible: ");
        Scanner sc = new Scanner(System.in);
        double BaseImponible = sc.nextDouble();
        double IVA = 21;
        double TotalAPagar = (BaseImponible * IVA)/100 + BaseImponible;
        System.out.printf("Con una base imponible de %.2f tendrías que finalmente pagar un total de %.2f", BaseImponible, TotalAPagar);
        sc.close();
    }
}
