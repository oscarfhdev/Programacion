import java.time.LocalDate;

public class Vino implements ConDescuento, EsLiquido, EsAlimento{
    private String marca;
    private String tipoDeVino;
    private int gradosAlcohol;
    private double precio;
    private double descuento;
    private LocalDate caducidad;
    private double volumen;
    private String tipoDeEnvase;

    Vino(String marca, String tipoDeVino, int gradosAlcohol, double precio) {
        this.marca = marca;
        this.tipoDeVino = tipoDeVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeVino() {
        return tipoDeVino;
    }

    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipoDeVino='" + tipoDeVino + '\'' +
                ", gradosAlcohol=" + gradosAlcohol +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio - (this.precio*(this.descuento/100));
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
        this.tipoDeEnvase= env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoDeEnvase;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad= fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return (int) gradosAlcohol*10;
    }
}
