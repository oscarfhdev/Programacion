package POO;

public class Caballo {
    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    Caballo(String n, String c, int e, int cg) {
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.carrerasGanadas = cg;
    }
    public String getNombre() {
        return nombre;
    }

    public void cabalga(){
        System.out.println("Tocoto tocoto tocoto");
    }

    public void relincha(){
        System.out.println("TIEEEEEEEEEEE");
    }
}
