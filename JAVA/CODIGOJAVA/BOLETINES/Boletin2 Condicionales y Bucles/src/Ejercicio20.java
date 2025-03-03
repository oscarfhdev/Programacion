/* 20. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio20 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Cuantos sueldos quieres introducir? : ");
            int numeroSueldos = Integer.parseInt(br.readLine());
            int contador = 0;
            double sueldo = 0;
            double sueldoMaximo = 0;
            while (contador < numeroSueldos) {
                System.out.print("Introduce tu sueldo: ");
                sueldo = Double.parseDouble(br.readLine());
                if (sueldo > sueldoMaximo)
                    sueldoMaximo = sueldo;
                contador++;

            }
            System.out.println("El sueldo máximo introducido es : " + sueldoMaximo + "€");


        }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
