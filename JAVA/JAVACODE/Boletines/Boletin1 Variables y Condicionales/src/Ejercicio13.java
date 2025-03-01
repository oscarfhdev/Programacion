/* 13. Pedir un número entre 0 y 9.999, decir si es capicúa. */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entre 0 y 9999: ");
        int numero = sc.nextInt();
        if (numero < 0 || numero > 9999) {
            System.out.println("El número está fuera de rango");
        }



        String numeroComoCadena = Integer.toString(numero);
        String numeroComoCadenaAlReves = new StringBuilder(numeroComoCadena).reverse().toString();

        //Manera fácil

        /*  if (numeroComoCadena.equals(numeroComoCadenaAlReves)) {
            System.out.println("El número es capicúa"); */

        int numeroAlReves = Integer.parseInt(numeroComoCadenaAlReves);
        if (numero == numeroAlReves)
            System.out.println("El numero es capicúa");
        else {
            System.out.println("El número no es capicúa");
        }
        sc.close();
    }
}
