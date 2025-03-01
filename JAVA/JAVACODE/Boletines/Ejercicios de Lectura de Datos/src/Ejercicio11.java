/* Ejercicio 11. Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio11 {
    public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        System.out.print("Qué nota obtuviste en el primer examen?: ");
        double notaPrimerExamen = Double.parseDouble(br.readLine());
        System.out.print("Qué nota quieres sacar en el trimestre: ");
        double notaTrimestre = Double.parseDouble(br.readLine());
        double notaNecesaria = (notaTrimestre - (notaPrimerExamen * 0.4)) / 0.6;
        System.out.printf("Si en el primer examen sacaste un %.2f y quieres sacar un %.1f en el trimestre, debería sacar un %.2f en el siguiente examen",notaPrimerExamen,notaTrimestre,notaNecesaria );


    }

    catch (IOException e){
        System.out.println("Hubo un error " + e.getMessage());
    }
    catch (NumberFormatException e){
        System.out.println("Por favor, ingresa un número válido");
    }
    }
}
