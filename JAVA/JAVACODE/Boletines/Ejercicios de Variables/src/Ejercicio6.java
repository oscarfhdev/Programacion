/*
Ejercicio 6. Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        double baseImponible = 200.0;
        double IVA = 21.0;
        double totalFactura = (baseImponible * IVA / 100) + baseImponible;

        System.out.printf("El precio final es: %.2f", totalFactura);
    }
}

