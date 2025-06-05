/* 2. Leer 5 números y mostrarlos en orden inverso al introducido.*/

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.print("Ingrese el número " + (i+1) + " : ");
            numeros[i] = sc.nextInt();
        }

        for (int i = numeros.length -1; i >= 0 ; i--) {
            System.out.println("Número " + (i+1) + " :  "+ numeros[i]);
        }
    }
}
