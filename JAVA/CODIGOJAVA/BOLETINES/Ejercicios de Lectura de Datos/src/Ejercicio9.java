/* Ejercicio 9. Realiza un conversor de Mb a Kb. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio9 {
    public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.print("Ingresa la cantidad de MB que quieres pasar a KB: ");
        double MB = Double.parseDouble(br.readLine());
        double KB = MB * 1024;
        System.out.printf("%.2fMB dan un total de %.2fKB",MB, KB);
    }
    catch (IOException e){
        System.out.println("Hubo un error"+e.getMessage());
    }
    catch (NumberFormatException e){
        System.out.println("Por favor, ingrese un número válido");
    }
    }
}
