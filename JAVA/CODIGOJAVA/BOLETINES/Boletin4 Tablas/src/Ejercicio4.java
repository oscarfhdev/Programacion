import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio4 {
    public static void main (String[]args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] numeros = new int[10];
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa el número " + (i + 1) + " :  ");
                numeros[i] = Integer.parseInt(br.readLine());
            }

            int i = 0;
            int j = numeros.length - 1;
            System.out.println(j);

            while (i <= j){
                System.out.println(numeros[i]);
                i++;
                if (i <= j ){
                    System.out.println(numeros[j]);
                    j--;
                }
            }
        }

        catch (IOException e) {
            System.out.println("Hubo un error en el sistema: " + e.getMessage());
        }

        catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }

    }
}
