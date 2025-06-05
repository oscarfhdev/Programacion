/* 8. Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás.*/


import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] int10array = new int[10];
        for (int i = 0; i <int10array.length -1 ; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            int10array[i] = sc.nextInt();
        }

        System.out.print("Ingresa un número a insertar: ");
        int numero = sc.nextInt();
        System.out.print("Ingresa la posición (0 a 9) donde deseas insertar el número: ");
        int posicion = sc.nextInt();

        if (posicion < 0 || posicion >= int10array.length) {
            System.out.println("La posición debe estar entre 0 y 9.");
        } else {
            for (int i = int10array.length - 1; i > posicion; i--) {
                int10array[i] = int10array[i - 1];
            }
            int10array[posicion] = numero;

            System.out.println("El arreglo después de insertar el número es:");
            System.out.println(Arrays.toString(int10array));
        }
    }
}
