import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) + " :  ");
            numeros[i] = sc.nextInt();
        }

        for (int j = 0; j < numeros.length ; j++) {
            System.out.println("Número " + (j+1) + " :  "+ numeros[j]);
        }


        sc.close();

    }
}