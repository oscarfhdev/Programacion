/* Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = 1;

            while (n != 0) {
                System.out.print("Ingrese un número, 0 para acabar: ");
                n = Integer.parseInt(br.readLine());
                if (n < 0)
                    System.out.println("El número introducido es negativo");
                else if (n > 0) {
                    System.out.println("El número introducido es positivo");
                }
            }


            System.out.println("Finalizando...");

        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error" + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }

}
