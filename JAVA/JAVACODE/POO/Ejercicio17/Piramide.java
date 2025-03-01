package POO.Ejercicio17;

class Piramide {
    private double altura;
    private static int piramidesCreadas = 0;

    public Piramide(double altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        return "Piramide de altura " + altura;
    }
}