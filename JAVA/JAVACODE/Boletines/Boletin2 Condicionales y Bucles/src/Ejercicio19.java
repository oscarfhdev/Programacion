/* 19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
suspensos. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio19 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numeroNotas = 6;
            int contador = 0;
            int numAprobados = 0;
            int numCondicionados = 0;
            int numSuspensos = 0;
            while (contador < numeroNotas) {
                System.out.print("Introduce la nota del alumno: ");
                int nota = Integer.parseInt(br.readLine());
                if (nota <0 || nota > 10) {
                    System.out.println("La nota debe ser mayor que 0 y menor a 10");
                    continue;
                }
                if (nota >= 5){
                    numAprobados++;
                } else if (nota == 4) {
                    numCondicionados++;
                }
                else {
                    numSuspensos++;
                }
                contador++;
            }
            System.out.println("Numero de alumnos aprobados: " + numAprobados);
            System.out.println("Numero de alumnos condicionados : " + numCondicionados);
            System.out.println("Numero de suspensos : " + numSuspensos);

        }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
