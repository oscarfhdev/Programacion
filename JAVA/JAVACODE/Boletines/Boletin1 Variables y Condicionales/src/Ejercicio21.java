/* 21. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres... */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio21 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingrese una nota del 0-10: ");
            int nota = Integer.parseInt(br.readLine());
            String notaTexto = switch (nota) {
                case 0 -> "Cero";
                case 1 -> "Uno";
                case 2 -> "Dos";
                case 3 -> "Tres";
                case 4 -> "Cuatro";
                case 5 -> "Cinco";
                case 6 -> "Seis";
                case 7 -> "Siete";
                case 8 -> "Ocho";
                case 9 -> "Nueve";
                case 10 -> "Diez";
                default -> "Numero no válido";
            };
            System.out.println("Este es el resultado de tu examen: " + notaTexto);
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
