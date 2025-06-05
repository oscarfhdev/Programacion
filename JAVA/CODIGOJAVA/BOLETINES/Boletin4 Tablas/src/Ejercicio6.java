/* 6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[12];
        int[] tabla2 = new int[12];
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

        for (int i = 0; i < tabla3.length; i+=6) {
            tabla3[i] = tabla1[j];
            tabla3[i+1] = tabla1[j+1];
            tabla3[i+2] = tabla1[j+2];


            tabla3[i+3] = tabla2[j];
            tabla3[i+4] = tabla2[j+1];
            tabla3[i+5] = tabla2[j+2];

            j+=3;
        }

        System.out.println("Tabla mezclada: " + Arrays.toString(tabla3));

    }
}
