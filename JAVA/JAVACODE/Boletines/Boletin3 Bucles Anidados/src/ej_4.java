import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej_4 {
    public static void main(String[] args) {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ingresa el tamaño del cuadrado:  ");
            int lado = Integer.parseInt(buffer.readLine());
            for (int i = 0; i < lado ; i++) {
                for (int j = 0; j < lado ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        catch (IOException e){
            System.out.println("Hubo un eror en el sistema" + e.getMessage());
        }

        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
