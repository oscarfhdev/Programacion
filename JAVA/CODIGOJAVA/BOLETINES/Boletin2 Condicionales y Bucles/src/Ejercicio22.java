/* 22. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio22 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int pedirCalificaciones = 5;
            int contador = 0;
            int calificacion;
            int cantSuspensos = 0;

            while (contador < pedirCalificaciones) {
                System.out.print("Introduce la calificacion del alumno: ");
                calificacion = Integer.parseInt(br.readLine());
                if (calificacion <0 || calificacion > 10){
                    System.out.println("La calificacion del alumno es invalida, debe estar entre 0 y 10");
                    continue;
                }
                if (calificacion < 5)
                    cantSuspensos++;
                contador++;
            }
            if (cantSuspensos > 0)
                System.out.println("Han suspendido un total de: " + cantSuspensos + " alumnos.");
            else {
                System.out.println("No se han introducido notas suspensas.");
            }

        }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
