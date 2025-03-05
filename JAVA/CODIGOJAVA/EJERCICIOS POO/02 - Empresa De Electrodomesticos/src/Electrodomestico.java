public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomestico(String tipo, String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca= marca;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    @Override
    public String toString(){
        return "Electrodoméstico de tipo: " + tipo + " , de la marca: " + marca + " , con " + potencia + " de potencia";
    }

    public double getConsumo(int horas){
        return potencia*horas;
    }

    public double getCosteConsumo(int horas, double costeHora){
        return getConsumo(horas)*costeHora;
    }
}

