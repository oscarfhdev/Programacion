/*
Ejercicio 1. Escribe un programa en el que se declaren las variables enteras x e y. Asignales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        int division = x / y;

        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("La suma de 'x' e 'y' es: " + suma);
        System.out.println("La resta de 'x' e 'y' es: " + resta);
        System.out.println("La multiplicacion de 'x' e 'y' es: " + multiplicacion);
        System.out.println("La division de 'x' e 'y' es: " + division);

    }
}