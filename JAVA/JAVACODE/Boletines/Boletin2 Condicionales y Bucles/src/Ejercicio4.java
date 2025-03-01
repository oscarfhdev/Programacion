/* 4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido. */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 0;
        while (true){
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            if (num < 0)
                break;
            contador++;
        }
        System.out.println("Se han introducido un total de " + contador + " numeros");
        sc.close();
    }
}
