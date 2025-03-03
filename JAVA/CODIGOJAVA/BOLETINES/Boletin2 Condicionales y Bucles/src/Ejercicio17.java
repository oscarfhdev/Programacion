/* 17. Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio17 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numeroFacturasIntroducidas = 5;
            int contador = 0;
            int codigoArticulo = 0;
            int cantidadLitros = 0;
            int precioLitro;
            int cantidadArticulo1 = 0;
            double facturacionTotal = 0;
            int facturas600 = 0;
            while (contador < numeroFacturasIntroducidas) {
                System.out.print("Introduce el código del articulo: ");
                codigoArticulo = Integer.parseInt(br.readLine());
                System.out.print("Introduce la cantidad de litros vendida: ");
                cantidadLitros = Integer.parseInt(br.readLine());
                System.out.print("Introduce el precio/litro del articulo: ");
                precioLitro = Integer.parseInt(br.readLine());
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
