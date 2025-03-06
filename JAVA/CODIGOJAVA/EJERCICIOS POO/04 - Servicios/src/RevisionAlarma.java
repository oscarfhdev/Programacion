import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
    private int numeroAlarmamasARevisar;

    RevisionAlarma(LocalDate fechaDeRevision, String cliente, int numeroAlarmamasARevisar) {
        super("Revisor Especialista Contraincendios", fechaDeRevision, cliente);
        this.numeroAlarmamasARevisar = numeroAlarmamasARevisar;
    }

    public int getNumeroAlarmamasARevisar() {
        return numeroAlarmamasARevisar;
    }

    public void setNumeroAlarmamasARevisar(int numeroAlarmamasARevisar) {
        this.numeroAlarmamasARevisar = numeroAlarmamasARevisar;
    }


    @Override
    double costeMaterial() {
        return 0;
    }

    @Override
    double costeManoObra() {
        return ((double) numeroAlarmamasARevisar / 3) * 40;
    }

    @Override
    double costeTotal() {
        return costeManoObra();
    }

    @Override
    String detalleServicio() {
        return "REVISIÓN PERIÓDICA DE ALARMAS CONTRAINCENDIOS \n Cliente: " + getCliente() + "\n Fecha revision: " + getFechaDeInicio()+ "\n---------------------------------\nTOTAL COSTE SERVICIO: " + costeTotal() + "\n----------------------";
    }
}


