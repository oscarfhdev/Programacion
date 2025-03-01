/* 16. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio16 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa un número entre 0 - 10 del que quieras conocer su tabla de multiplicar: ");
            int num = Integer.parseInt(br.readLine());
            for (int i = 0; i <= 10; i++) {
                System.out.println(num+ "x" + i +"=" +num*i);
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
