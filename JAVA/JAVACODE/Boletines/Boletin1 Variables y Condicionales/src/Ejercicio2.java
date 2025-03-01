/* 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) {
        try(BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa el radio del círculo: ");
            double radio = Double.parseDouble(entrada.readLine());
            double area = Math.PI * Math.pow(radio, 2);
            System.out.printf("Un círculo con un radio de %.2f tiene un área de %.2f", radio, area);
        }
        catch (IOException e) {
            System.out.println("Hubo un eror" + e.getMessage());
        }

        catch (NumberFormatException e){
            System.out.println("Numero inválido, ingresa uno correcto");
        }
    }
}
