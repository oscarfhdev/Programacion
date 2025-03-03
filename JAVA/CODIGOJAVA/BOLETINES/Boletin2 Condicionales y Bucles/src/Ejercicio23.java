/* 23. Pedir 5 números e indicar si alguno es múltiplo de 3. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio23 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int pedirNumeros = 5;
            int contador = 0;
            int numero;
            boolean multiploTres = false;

            while (contador < pedirNumeros) {
                System.out.print("Introduce un numero: ");
                numero = Integer.parseInt(br.readLine());
                if (numero % 3 == 0) {
                    multiploTres = true;
                    break;
                }
                contador++;

            }
            if (multiploTres)
                System.out.println("Entre los números que has introducido hay multiplos tres");
            else {
                System.out.println("No se han introducido numero/s multiplos de tres");
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
