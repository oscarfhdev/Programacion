public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;




    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public Dimension(){
        this(0, 0, 0);
    }

    public double getAlto(){
        return this.alto;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    public double getAncho(){
        return this.ancho;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public double getProfundidad(){
        return this.profundidad;
    }

    public void setProfundidad(double profundidad){
        this.profundidad = profundidad;
    }

    @Override
    public String toString(){
        return "Dimension con " + alto + " alto, " + ancho + " ancho, " + profundidad + " profundidad";
    }




}

