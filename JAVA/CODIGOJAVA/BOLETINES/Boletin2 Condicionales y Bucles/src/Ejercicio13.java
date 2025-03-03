/* 13. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio13 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numero;
            int numPositivos = 0;
            int cantPositivos = 0;
            int numNegativos = 0;
            int cantNegativos = 0;
            int numCeros = 0;
            int contador = 0;
            int mediaPositivos = 0;
            int mediaNegativos = 0;
            while (contador < 10) {
                System.out.print("Ingrese un numero: ");
                numero = Integer.parseInt(br.readLine());
                if (numero > 0) {
                    numPositivos++;
                    cantPositivos += numero;
                }
                else if (numero < 0) {
                    numNegativos++;
                    cantNegativos += numero;
                }
                else{
                    numCeros++;
                }
                contador++;
            }
            if (numPositivos == 0)
                System.out.println("Has introducido 0 números positivos");
            else {
                mediaPositivos = cantPositivos / numPositivos;
            }
            if (numNegativos == 0)
                System.out.println("Has introducido 0 números negativos");
            else {
                mediaNegativos = cantNegativos / numNegativos;
            }
            System.out.printf("Se han introducido un total de %d numeros positivos\n", numPositivos);
            System.out.printf("Se han introducido un total de %d numeros negativos\n", numNegativos);
            System.out.printf("La media de los %d números positivos es %d\n",numPositivos, mediaPositivos);
            System.out.printf("La media de los %d números negativos es %d\n",numNegativos, mediaNegativos);
            System.out.printf("La cantidad de ceros ingresados han sido: %d",numCeros);
        }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
