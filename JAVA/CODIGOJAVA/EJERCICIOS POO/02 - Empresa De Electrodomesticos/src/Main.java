public class Main {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico("Horno", "CalorMax", 1.2);

        e1.setPotencia(1.5);
        e1.setMarca("HeatWave");

        System.out.println(e1);

        int horas = 8;
        double consum = e1.getConsumo(horas);
        double preciokwh = 0.75;
        double coste = e1.getCosteConsumo(horas, preciokwh);
        System.out.println("Ha consumido: " + consum + " kW en " + horas + " horas");
        System.out.println("Debe pagar: " + coste + " €");

        Lavadora lava1 = new Lavadora("AquaWash", 550, 0.8, true);

        System.out.println(lava1);
        lava1.setAguaCaliente(false);
        System.out.println("Consumo de la lavadora en 5 horas: " + lava1.getConsumo(5));
        System.out.println("Coste del consumo en 5 horas: " + lava1.getCosteConsumo(5, 1.5));
    }
}
