/* 14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien... */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la calificación, de 0 - 10: ");
        int calificacion = entrada.nextInt();
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación fuera de rango");
        }
        else {
            String resultado;
            switch (calificacion) {
                case 0, 1, 2, 3 -> resultado = "Insuficiente";
                case 4, 5 -> resultado = "Suficiente";
                case 6 -> resultado = "Bien";
                case 7, 8 -> resultado = "Notable";
                case 9, 10 -> resultado = "Sobresaliente";
                default -> resultado = "Calificación fuera de rango";
            }
            System.out.println("Resultado: " + resultado);
        }
        entrada.close();
    }
}
