/* 10. Pedir tres números y mostrarlos ordenados de mayor a menor. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = Integer.parseInt(br.readLine());

            System.out.print("Ingresa el segundo número: ");
            int numero2 = Integer.parseInt(br.readLine());

            System.out.print("Ingresa el tercer número: ");
            int numero3 = Integer.parseInt(br.readLine());

            int mayor, medio, menor;
            if (numero1 >= numero2 && numero1 >= numero3) {
                mayor = numero1;
                if (numero2 >= numero3) {
                    medio = numero2;
                    menor = numero3;
                }
                else {
                    medio = numero3;
                    menor = numero2;
                }
            }
            else if (numero2 >= numero1 && numero2 >= numero3) {
                mayor = numero2;
                if (numero1 >= numero3) {
                    medio = numero1;
                    menor = numero3;
                }
                else {
                    medio = numero3;
                    menor = numero1;
                }
            }
            else {
                mayor = numero3;
                if (numero1 >= numero2) {
                    medio = numero1;
                    menor = numero2;
                }
                else {
                    medio = numero2;
                    menor = numero1;
                }
            }
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d, %d", mayor, medio, menor);

        }
        catch (IOException e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
