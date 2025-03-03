/* 11. Diseñar un programa que muestre el producto de los 10 primeros números impares. */
public class Ejercicio11 {
    public static void main(String[] args) {
    int contador = 1;
    int producto = 1;
    int impares = 1;
    while (contador <= 10) {
            producto = producto * impares;
            impares += 2;
        contador++;
    }
        System.out.println("El producto es: " + producto);
    }
}
