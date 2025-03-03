/*
Ejercicio 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double pesetas = 24242343;
        double euros = pesetas / 166.87;
        System.out.printf("%.0f pesetas, equivalen a %.2f euros", pesetas, euros);
    }
}
