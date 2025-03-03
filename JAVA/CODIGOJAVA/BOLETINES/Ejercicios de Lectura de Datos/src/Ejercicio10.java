/* Ejercicio 10. Realiza un conversor de Kb a Mb. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Por favor, ingresa la cantidad en KB que quieres pasar a MB: ");
            double KB = Double.parseDouble(br.readLine());
            double MB = KB / 1024;
            System.out.printf("%.2fKB equivalen a %.2fMB", KB, MB);

        }
        catch (IOException e) {
            System.out.println("Hubo un error" + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
