public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private String tipoEnvase;
    private double volumen;
    private double descuento;


    public Detergente(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio= precio;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio - (this.precio * (this.descuento / 100));
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", volumen=" + volumen +
                ", descuento=" + descuento +
                '}';
    }


}
