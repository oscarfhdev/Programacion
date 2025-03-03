/* 15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos
los meses de 30 días */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Debes ingresar una fecha");
    System.out.print("Ingresa el día: ");
    int dia = entrada.nextInt();
    System.out.print("Ingresa el mes: ");
    int mes = entrada.nextInt();
    System.out.print("Ingresa el año: ");
    int ano = entrada.nextInt();

    if (dia < 1 || dia > 30 || mes > 12 || mes < 1 || ano < 0) {
        System.out.println("La fecha introducida es incorrecta!");
    }
    else {
        System.out.println("La fecha introducida es correcta!");
    }
    entrada.close();
    }
}
