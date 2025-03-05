import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listafiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listafiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return this.nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListafiguras() {
        return this.listafiguras;
    }

    public void setListafiguras(ArrayList<Figura> listafiguras) {
        this.listafiguras = listafiguras;
    }

    public void anadirFigura(Figura fig) {
        getListafiguras().add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura figura : listafiguras) {
            if (figura.getCodigo().equals(id))
                figura.subirPrecio(cantidad);
        }
    }

    @Override
    public String toString() {
        return "Nombre de la coleccion: " + nombreColeccion + " , figuras en la coleccion: " + listafiguras;
    }


    public ArrayList<Figura> conCapa() {
        ArrayList<Figura> figurasconCapa = new ArrayList<>();
        for (Figura figura : listafiguras) {
            if (figura.getSuperheroe().isCapa())
                figurasconCapa.add(figura);
        }
        return figurasconCapa;
    }

    public Figura masValioso() {
        if (listafiguras.isEmpty()) {
            return null;
        } else {
            Figura figuraMasValiosa = listafiguras.getFirst();
            for (Figura figura : listafiguras)
                if (figura.getPrecio() > figuraMasValiosa.getPrecio())
                    figuraMasValiosa = figura;
            return figuraMasValiosa;
        }
    }

    public double getValorColeccion() {
        if (listafiguras.isEmpty())
            return 0;

        double valorColeccion = 0;
        for (Figura figura : this.listafiguras) {
            valorColeccion += figura.getPrecio();
        }
        return valorColeccion;

    }

    public double getVolumenColeccion() {
        if (listafiguras.isEmpty())
            return 0;

        double volumenColeccion = 0;
        for (Figura figura : this.listafiguras){
            volumenColeccion += figura.getDimension().getVolumen();
        }
        return (volumenColeccion+200);
    }


}
