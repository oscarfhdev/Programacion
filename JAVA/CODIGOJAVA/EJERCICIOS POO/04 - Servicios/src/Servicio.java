import java.time.LocalDate;

public abstract class Servicio {
    private String trabajador;
    private LocalDate fechaDeInicio;
    private String cliente;

    public Servicio(String trabajador, LocalDate fechaDeInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaDeInicio = fechaDeInicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    abstract double costeMaterial();
    abstract double costeManoObra();
    abstract double costeTotal();
    abstract String detalleServicio();

}
