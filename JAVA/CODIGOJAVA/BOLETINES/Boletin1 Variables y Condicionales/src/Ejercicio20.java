/* 20. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente. */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Debes ingresar la hora en formato h/m/s");
        System.out.print("Ingrese la hora: ");
        int hora = entrada.nextInt();
        System.out.print("Ingrese los minutos: ");
        int minutos = entrada.nextInt();
        System.out.print("Ingrese los segundos: ");
        int segundos = entrada.nextInt();


        if (segundos < 0 || segundos > 60 || minutos < 0 || minutos > 60 || hora < 0 || hora > 24) {
            System.out.println("El formato de hora no es correcto");
        }
        else {
            System.out.println("El formato de hora es correcto");
            System.out.println("Esta es la hora introducida: " + hora + ":" + minutos + ":" + segundos);
            if (segundos < 59)
                segundos++;
            else {
                segundos = 0;
                if (minutos < 59)
                    minutos++;
                else {
                    minutos = 0;
                    if (hora < 23)
                        hora++;
                    else {
                        hora = 0;
                    }
                }

            }

            System.out.println("Esta es la hora con un segundo más: " + hora + ":" + minutos + ":" + segundos);
        }

    }
}
