/* Ejercicio 2. Realiza un conversor de euros a pesetas. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio2 {
    public static void main(String[] args) {
        try (BufferedReader readerchulo = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ingresa la cantidad en euros que quieres convertir a pesetas: ");
            double euros = Double.parseDouble(readerchulo.readLine());
            double pesetas = euros * 166.38;
            System.out.printf("%.2f euros equivalen a un total de %.2f pesetas",euros, pesetas);
        }
        catch (IOException e) {
            System.out.println("Ocurrió un error" + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Ingresa un numero valido");
        }
    }
}

