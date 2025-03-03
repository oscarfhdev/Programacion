/* Realizar un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que son primos.  */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ej_6 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ingresa un número: ");
            int contadorPrimos = 0;
            int numero = Integer.parseInt(br.readLine());

            if (numero <= 0 || numero == 1) {
                System.out.println("No hay números primos entre " + numero + " y 1");
            }
            else{
                for (int i = 2; i <= numero; i++) {
                    boolean esPrimo = true;

                    for (int j = 2; j * j <= i; j++) {
                        System.out.println(i);
                        if (i % j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }

                    if (esPrimo) {
                        contadorPrimos++;
                    }
                }
                System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + numero);
            }
        }


        catch (IOException e){
            System.out.println("Hubo un error" + e.getMessage());
        }

        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }

}
