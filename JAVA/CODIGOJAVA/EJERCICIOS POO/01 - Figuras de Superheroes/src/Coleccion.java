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

    public ArrayList<Figura> getListafiguras(){
        return this.listafiguras;
    }

    public void setListafiguras(ArrayList<Figura> listafiguras){
        this.listafiguras = listafiguras;
    }

    public void anadirFigura(Figura fig){
        getListafiguras().add(fig);
    }

    public void subirPrecio(double cantidad, String id){
        for (int i = 0; i < listafiguras.size(); i++) {
            Figura figura = listafiguras.get(i);
            if (figura.getCodigo().equals(id))
                figura.subirPrecio(cantidad);
        }
    }
}
