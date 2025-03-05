public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;


    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public Dimension getDimension(){
        return this.dimension;
    }

    public void setDimension(Dimension dimension){
        this.dimension = dimension;
    }

    public Superheroe getSuperheroe(){
        return this.superheroe;
    }

    public void setSuperheroe(Superheroe superheroe){
        this.superheroe= superheroe;
    }


    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superheroe=" + superheroe +
                ", dimension=" + dimension +
                '}';
    }

    public void subirPrecio(double incremento){
        this.precio += incremento;
    }
}
