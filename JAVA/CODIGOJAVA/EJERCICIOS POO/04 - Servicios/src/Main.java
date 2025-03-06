import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creacion de trabajos de pintura y revisiones de alarma con datos diferentes
        TrabajoPintura tp1 = new TrabajoPintura("Carlos", LocalDate.of(2023, 5, 12), "Banco Central", 25, 5);
        TrabajoPintura tp2 = new TrabajoPintura("Lucía", LocalDate.of(2023, 6, 18), "Panadería La Espiga", 15, 3.5);
        TrabajoPintura tp3 = new TrabajoPintura("Miguel", LocalDate.of(2023, 11, 22), "Museo de Arte Moderno", 180, 4.2);

        RevisionAlarma ra1 = new RevisionAlarma(LocalDate.of(2023, 4, 5), "Universidad Politécnica", 40);
        RevisionAlarma ra2 = new RevisionAlarma(LocalDate.of(2023, 12, 2), "Centro Comercial Las Torres", 85);

        // Lista de trabajos realizados
        ArrayList<Servicio> trabajos = new ArrayList<>();
        trabajos.add(tp1);
        trabajos.add(tp2);
        trabajos.add(tp3);
        trabajos.add(ra1);
        trabajos.add(ra2);

        // Variables para calcular coste total y coste de mano de obra total
        double costeTotal = 0;
        double costeManoObraTotal = 0;

        // Iterar sobre la lista y sumar los costes
        for (Servicio trabajo : trabajos) {
            costeTotal += trabajo.costeTotal();
            if (trabajo instanceof TrabajoPintura) {
                costeManoObraTotal += (trabajo).costeManoObra();
            }
        }

        // Imprimir los detalles de los trabajos
        for (Servicio trabajo : trabajos) {
            System.out.println(trabajo.detalleServicio());
        }

        // Mostrar los costes totales
        System.out.println("\n🔹 Coste total de todos los trabajos: " + costeTotal + "€");
        System.out.println("🔹 Coste total de la mano de obra en pintura: " + costeManoObraTotal + "€");
    }
}
