import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    private double superficie;
    private double precioPintura;

    TrabajoPintura(String trabajador, LocalDate fechaDeInicio, String cliente, double superficie, double precioPintura){
        super(trabajador, fechaDeInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    double costeMaterial() {
        return (this.superficie / 7.8) * precioPintura;
    }

    @Override
    double costeManoObra() {
        return (superficie/10)*9.5;
    }


    @Override
    double costeTotal() {
        return costeMaterial()+costeManoObra()+costeadicional();
    }

    public double costeadicional(){
        if (superficie<50)
        return(costeManoObra()*0.15);
        else {
            return 0;
        }
    }

    @Override
    String detalleServicio() {
        return "TRABAJO DE PINTURA \n Cliente: " + getCliente() + "\n Fecha de inicio: " + getFechaDeInicio()+ "\n---------------------------------\nPintor: " + getTrabajador()+ "\nCoste Material.... "+ costeMaterial()+ "\nCoste Mano Obra.... " +costeManoObra() + "\nCosta Adicional......." + costeadicional()+ "\n TOTAL COSTE SERVICIO: " + costeTotal() + "\n----------------------";
    }
}
