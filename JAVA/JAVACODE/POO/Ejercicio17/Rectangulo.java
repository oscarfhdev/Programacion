package POO.Ejercicio17;

class Rectangulo {
     private double altura;
     private double base;
     private static int piramidesCreadas = 0;

    public Rectangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
        piramidesCreadas++;
    }

    public double getAltura() {
        return altura;
    }

    public double setAltura(double base){
        this.base = base;
        return base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
