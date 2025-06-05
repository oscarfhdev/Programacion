/* 5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.*/

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla3 = new int[tabla1.length+tabla2.length];
        int j = 0;

        for (int i = 0; i < tabla1.length ; i++) {
            System.out.print("Ingrese el número " + (i+1) + " de la lista 1: ");
            tabla1[i] = sc.nextInt();
        }

        System.out.println("------------------------------");
        System.out.println("------------------------------");


        for (int i = 0; i < tabla1.length ; i++) {
            System.out.print("Ingrese el número " + (i+1) + " de la lista 2: ");
            tabla2[i] = sc.nextInt();
        }

        for (int i = 0; i < tabla3.length; i+=2) {
            tabla3[i] = tabla1[j];
            tabla3[i+1] = tabla2[j];
            j++;
        }

        System.out.println(Arrays.toString(tabla3));


    }
}
