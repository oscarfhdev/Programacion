import java.util.ArrayList;
import java.util.Arrays;

public class TeoriaArrayList {
    public static void main(String[] args) {
        // Un array list es lo que conocíamos en .py como LISTA
        // Un ArrayList es una estructura de datoa en Jacva que permite almacenar elementos de forma dinámica


        // Ventaja sobre Array: No necesito definir su tamaño de antemano
        ArrayList<String> nombres = new ArrayList<>();
        String[] n = {"Pepe", "Juan", "María"};

        // Agregar elementos al ArrayList
        nombres.add("Ester");
        nombres.add("Ana");
        nombres.add("Ricardo");
        nombres.add("Samuel");
        nombres.add("Ester");

        System.out.println("Lista de nombres: " + nombres);
        System.out.println(n);
        System.out.println(Arrays.toString(n));

        // Acceder a un elemento específico:
        System.out.println("Primer nombre: " + nombres.get(0));
        System.out.println("Segundo nombre: " + nombres.get(1));

        // Cambiar un elemento:
        nombres.set(1, "Carmen");
        System.out.println("Lista actualizada: " + nombres);

        /*
         add(): Metodo para agregar items
         get(): Permite acceder a un elemento por su índice
         set(): Cambia un elemento en una posición específica
         */

    }

}
