import java.util.ArrayList;

public class TeoriaArrayListV2 {
    public static void main(String[] args) {
        // Realizar operaciones de
        // Iteración y manipulación de elementos

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Cereza");
        frutas.add("Aceituna");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruts" + frutas.get(i));
        }


        //Imprimir con for-each-loop
        for (String item: frutas){
            System.out.println("Frutas: " + item);
        }

        //Eliminar un elemento:
        frutas.remove("Cereza");
        frutas.remove(2);
        System.out.println("Frutas actualizada: " + frutas);

        //ArrayList de enteros donde se emplea lo siguiente:
        // Buscar un elemento
        // Clonar o copiar el ArrayList
        // Vaciar o Limpiar los elementos del ArrayList


        //Buscar un número si existe
    }
}
