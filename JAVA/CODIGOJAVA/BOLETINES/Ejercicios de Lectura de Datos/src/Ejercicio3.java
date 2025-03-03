/* Ejercicio 3. Realiza un conversor de pesetas a euros. La cantidad de euros que se quiere convertir debe ser introducida por teclado. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ingresa la cantidad de pesetas:  ");
            double pesetas = Double.parseDouble(reader.readLine());
            double euros = pesetas / 166.38;

            System.out.printf("%.2f pesetas dan un total de %.2f euros",pesetas, euros);
        }
        catch (IOException a){
            System.out.println("Ocurrió un error al leer la entrada: " + a.getMessage());
        }
        catch (NumberFormatException a){
            System.out.println("Ingresa números válidos");

        }
    }
}
