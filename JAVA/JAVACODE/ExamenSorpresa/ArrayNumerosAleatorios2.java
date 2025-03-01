package ExamenSorpresa;/* Escribe un programa que genere 20 números aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario */
import java.util.Arrays;
import java.util.Random;
public class ArrayNumerosAleatorios2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[20];

        int[] pares = new int[20];
        int[] impares = new int[20];

        int indicePares = 0;
        int indiceImpares = 0;

        for (int i = 0; i < 20; i++) {
            numeros[i] = rand.nextInt(101);

            if (numeros[i] % 2 == 0) {
                pares[indicePares++] = numeros[i];
            } else {
                impares[indiceImpares++] = numeros[i];
            }
        }

        Arrays.sort(pares, 0, indicePares);
        Arrays.sort(impares, 0, indiceImpares);

        System.out.println("Números aleatorios generados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        int indice = 0;

        for (int i = 0; i < indicePares; i++) {
            numeros[indice++] = pares[i];
        }

        for (int i = 0; i < indiceImpares; i++) {
            numeros[indice++] = impares[i];
        }

        System.out.println("Nuevo array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
