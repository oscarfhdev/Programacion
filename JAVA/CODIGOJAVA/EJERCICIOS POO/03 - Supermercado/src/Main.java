import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Detergente
        Detergente det1 = new Detergente("Lavaplatos", 3.0);
        det1.setVolumen(50);
        det1.setDescuento(1.5);
        det1.setTipoEnvase("Botella de plástico grande");

        System.out.println(det1);

        // Crear un objeto Cereales
        Cereales cer1 = new Cereales("CornFlakes", 5, "trigo");
        cer1.setCaducidad(LocalDate.of(2023, 9, 15));
        System.out.println("Calorías: " + cer1.getCalorias());

        System.out.println(cer1);

        // Crear un objeto Vino
        Vino vin1 = new Vino("Carmenere", "tinto", 15, 12);
        vin1.setVolumen(500);
        vin1.setTipoEnvase("Botella de vidrio");
        vin1.setCaducidad(LocalDate.of(2024, 5, 10));
        vin1.setDescuento(3);

        System.out.println(vin1);

        // Crear una lista de alimentos
        ArrayList<EsAlimento> lista = new ArrayList<>();
        lista.add(vin1);
        lista.add(cer1);

        // Calcular las calorías totales de los alimentos
        int totalcalorias = 0;
        for (EsAlimento alimento : lista) {
            totalcalorias += alimento.getCalorias();
        }

        System.out.println("Total calorías: " + totalcalorias);
    }
}
