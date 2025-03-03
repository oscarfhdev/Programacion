/* 3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros. */

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        int sumaPositivos = 0, sumaNegativos = 0, contadorPositivos = 0, contadorNegativos = 0, numCeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " : ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                numCeros++;
            }
        }

        double mediaPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;
        double mediaNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;

        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Número de ceros: " + numCeros);

        sc.close();
    }
}
