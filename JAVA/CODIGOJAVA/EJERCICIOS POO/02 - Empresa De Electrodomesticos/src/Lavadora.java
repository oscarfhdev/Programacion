
public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.precio = 0;
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente){
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }


    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return this.aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente){
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + " con un precio de =" + precio +
                " , y aguaCaliente=" + aguaCaliente +  '}';
    }


    @Override
    public double getConsumo(int horas){
        if (this.aguaCaliente)
            return getPotencia()*horas*0.20;
        else{
            return getPotencia()*horas;
        }
    }

    public double getCosteConsumo(int horas, double costeHora) {
        return super.getCosteConsumo(horas, costeHora);
    }
}
