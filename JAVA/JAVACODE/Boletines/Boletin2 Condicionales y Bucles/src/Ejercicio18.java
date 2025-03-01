
/* 18. Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres productos con precios: 1: 0,6 €/litro, 2: 3 €/litro y 3: 1,25 €/litro. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio18 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numeroFacturasIntroducidas = 5;
            int contador = 0;
            int codigoArticulo = 0;
            int cantidadLitros = 0;
            double precioLitro = 0.0;
            int cantidadArticulo1 = 0;
            double facturacionTotal = 0;
            int facturas600 = 0;
            while (contador < numeroFacturasIntroducidas) {
                System.out.print("Introduce el código del articulo (1-3): ");
                codigoArticulo = Integer.parseInt(br.readLine());
                if (codigoArticulo != 1 && codigoArticulo != 2 && codigoArticulo != 3){
                    System.out.println("El número introducido no pertenece a ningún artículo (1, 2, 3)");
                    continue;
                }

                System.out.print("Introduce la cantidad de litros vendida: ");
                cantidadLitros = Integer.parseInt(br.readLine());

                if (codigoArticulo == 1)
                    precioLitro = 0.6;
                else if (codigoArticulo == 2)
                    precioLitro = 3;
                else if (codigoArticulo == 3)
                    precioLitro = 1.25;

                facturacionTotal += cantidadLitros * precioLitro;
                if (codigoArticulo==1)
                    cantidadArticulo1 += cantidadLitros;
                if (cantidadLitros*precioLitro > 600)
                    facturas600++;
                contador++;
            }
            System.out.println("La facturación total ha sido de: " + facturacionTotal);
            System.out.println("Se han vendido un total de " + cantidadArticulo1 + " litros del Artículo 1");
            System.out.println("Hay un total de " + facturas600 + " facturas que superan los 600€");
        }

        catch (IOException e){
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }
}
