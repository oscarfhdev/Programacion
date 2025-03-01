public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void come(int particula) {
        if (particula <= 0) {
            System.out.println("La partícula debe tener un peso positivo.");
        }
        this.peso += particula - 1;
    }


    public String toString() {
        return "Ameba{" +
                "peso=" + peso +
                '}';
    }

    public void come(Ameba ameba) {
        this.peso += ameba.peso-1;
        ameba.setPeso(0);
    }

    public static void main(String[] args) {
        Ameba ameba = new Ameba();
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
    }
}
