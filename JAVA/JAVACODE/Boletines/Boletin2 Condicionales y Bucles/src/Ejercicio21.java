/* 21. Pedir 10 números, y mostrar al final si se ha introducido alguno negativo. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio21 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int pedirNumeros= 10;
            int contador = 0;
            int numero = 0;
            int cantNumNegativos = 0;

            while (contador < pedirNumeros) {
                System.out.print("Introduce un número: ");
                numero = Integer.parseInt(br.readLine());
                if (numero < 0)
                    cantNumNegativos++;
                contador++;
            }
            if (cantNumNegativos > 0)
                System.out.println("Se han introducido un total de: " + cantNumNegativos + " numeros negativos.");
            else {
                System.out.println("No se han introducido números negativos.");
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
