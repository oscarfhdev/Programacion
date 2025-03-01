/* 13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.
Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices. */

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio13V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tablaparesimpares = new int[10];
        int a = 0;
        int b = 0;


        for (int i = 0; i < tabla1.length ; i++) {
            System.out.print("Ingrese el número " + (i+1) + " de la lista 1: ");
            tabla1[i] = sc.nextInt();
        }

        System.out.println("Esta es la tabla introducida: " + Arrays.toString(tabla1));

        for (int i = 0; i < tabla1.length; i++) {
            if(tabla1[i] % 2 == 0){
                tablaparesimpares[a] = tabla1[i];
                a++;
            }

        }

        for (int i  = 0; i <tablaparesimpares.length ; i++) {
            if (tablaparesimpares[i] == 0)
                b++;

        }

        for (int i = 0; i < tabla1.length; i++) {
            if(tabla1[i] % 2 != 0){
                tablaparesimpares[b] = tabla1[i];
                b++;
            }

        }

        System.out.println(Arrays.toString(tablaparesimpares));
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tablaparesimpares = new int[10];
        int indicePar = 0; // Para almacenar los pares
        int indiceImpar = 0; // Para almacenar los impares

        // Leer los números en la primera tabla
        for (int i = 0; i < tabla1.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " de la lista 1: ");
            tabla1[i] = sc.nextInt();
        }

        System.out.println("Esta es la tabla introducida: " + Arrays.toString(tabla1));

        // Copiar los pares en la tabla final
        for (int i = 0; i < tabla1.length; i++) {
            if (tabla1[i] % 2 == 0) { // Incluye el 0 porque 0 % 2 == 0
                tablaparesimpares[indicePar] = tabla1[i];
                indicePar++;
            }
        }

        // Copiar los impares después de los pares
        indiceImpar = indicePar; // Los impares empiezan justo después del último par
        for (int i = 0; i < tabla1.length; i++) {
            if (tabla1[i] % 2 != 0) { // Números impares
                tablaparesimpares[indiceImpar] = tabla1[i];
                indiceImpar++;
            }
        }

        System.out.println("Tabla con pares seguidos de impares: " + Arrays.toString(tablaparesimpares));
    }
}


 */
