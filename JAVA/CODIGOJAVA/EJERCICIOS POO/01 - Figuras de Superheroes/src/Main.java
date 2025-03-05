public class Main {
    public static void main(String[] args) {
        Superheroe sup1 = new Superheroe("Superman");
        sup1.setNombre("Hombre de Acero");
        sup1.setDescripcion("Vuela, tiene super fuerza y visión de rayos láser.");

        System.out.println(sup1.getNombre());
        System.out.println(sup1.getDescripcion());
        System.out.println(sup1.toString());

        Superheroe sup2 = new Superheroe("Thor");
        sup2.setDescripcion("Dios del trueno con un martillo poderoso.");
        sup2.setCapa(true);

        System.out.println(sup2.toString());

        Dimension dimPeq = new Dimension();  // alto = 0, ancho = 0, prof = 0
        Dimension dimGra = new Dimension(100, 50, 40);

        dimPeq.setAlto(30);
        dimPeq.setAncho(10);
        dimPeq.setProfundidad(8);
        // ahora dimPeq es: alto = 30, ancho = 10, prof = 8

        System.out.println(dimPeq);
        System.out.println(dimGra);
        System.out.println("Volumen de la dimensión pequeña: " + dimPeq.getVolumen());

        Figura figSup = new Figura("sup-01", 60, sup1, dimPeq);

        System.out.println(figSup.toString());
        figSup.subirPrecio(15);
        System.out.println(figSup.toString());

        Coleccion col = new Coleccion("Héroes Legendarios");

        col.anadirFigura(figSup);

        Figura figThor = new Figura("thor-02", 80, sup2, dimGra);
        col.anadirFigura(figThor);

        Superheroe sup3 = new Superheroe("Capitán América");
        sup3.setDescripcion("Héroe con escudo de vibranium y gran liderazgo.");
        Figura figCap = new Figura("cap-03", 40, sup3, new Dimension(10, 5, 3));
        col.anadirFigura(figCap);

        System.out.println(col);

        System.out.println(col.conCapa());

        Figura fMasValiosa = col.masValioso();
        System.out.println("Figura de más valor: " + fMasValiosa);

        System.out.println("Valor de la colección: " + col.getValorColeccion());

        System.out.println("Volumen de la colección: " + col.getVolumenColeccion());
    }
}