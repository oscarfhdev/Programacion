/* 15. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio15 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numeroAlumnos = 5;
            int edad;
            int cantEdad = 0;
            double altura;
            double cantAltura = 0;
            int contador = 0;
            int alumMayorEdad = 0;
            int alumAlto = 0;
            double mediaEdad, mediaAltura;

            while (contador < numeroAlumnos) {
                System.out.print("Ingrese la edad del alumno: ");
                edad = Integer.parseInt(br.readLine());
                System.out.print("Ingrese el altura del alumno en cm: ");
                altura = Double.parseDouble(br.readLine());
                cantEdad += edad;
                cantAltura += altura;
                if (edad > 18)
                    alumMayorEdad++;
                if (altura > 175)
                    alumAlto++;
                contador++;
            }
            mediaEdad = (double) cantEdad / numeroAlumnos;
            mediaAltura = cantAltura / numeroAlumnos;

            System.out.printf("La edad media es de %.2f años\n", mediaEdad);
            System.out.printf("La estatura media es de %.2f cm \n", mediaAltura);
            System.out.printf("Hay un total de %d alumnos que son mayor de edad \n", alumMayorEdad);
            System.out.printf("Hay un total de %d alumnos que miden más de 175cm \n", alumAlto);

        }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
