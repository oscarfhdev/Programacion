/* 14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€. */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cantSueldos = 10;
    double sueldo;
    double sumaSueldos = 0;
    int mayor = 0;
    for (int i = 0; i < cantSueldos; i++) {
        System.out.print("Ingrese el importe del sueldo sueldo: ");
        sueldo = sc.nextDouble();
        sumaSueldos += sueldo;
        if (sueldo > 1000)
            mayor++;
    }
    System.out.printf("La suma total de los %d sueldos es %.2f \n", cantSueldos, sumaSueldos);
        System.out.printf("Hay un total de %d sueldos mayores a 1000€", mayor);
    sc.close();
    }
}
