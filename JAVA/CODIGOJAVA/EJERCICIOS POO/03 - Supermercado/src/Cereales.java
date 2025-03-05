import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoDeCereal;
    private int calorias;
    private LocalDate caducidad;

    public Cereales(String marca, double precio, String tipoDeCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoDeCereal = tipoDeCereal;
    }

    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoDeCereal() {
        return tipoDeCereal;
    }

    public void setTipoDeCereal(String tipoDeCereal) {
        this.tipoDeCereal = tipoDeCereal;
    }


    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return this.calorias = switch (this.tipoDeCereal){
            case "espelta" -> 5;
            case "maiz" -> 8;
            case "trigo" -> 12;
            default -> 15;
        };
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca +
                ", precio=" + precio +
                ", tipoDeCereal='" + tipoDeCereal  +
                ", calorias=" + calorias +
                ", caducidad=" + caducidad +
                '}';
    }
}

