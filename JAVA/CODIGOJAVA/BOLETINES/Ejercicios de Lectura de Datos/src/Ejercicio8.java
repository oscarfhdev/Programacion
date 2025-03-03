/*Ejercicio 8. Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio8 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa las horas que trabajas cada día: ");
            double horas = Double.parseDouble(br.readLine());
            double salarioHora = 12;
            double salarioSemanal = (horas * salarioHora)*5;
            System.out.printf("Si trabajas %.2f horas al día, los cinco días de la semana con un salario de %.2f€ la hora, tendrás un salario semanal de %.2f€",horas, salarioHora, salarioSemanal);
        }
        catch (IOException e){
            System.out.println("Hubo un error" + e.getMessage());
        }
    }
}
