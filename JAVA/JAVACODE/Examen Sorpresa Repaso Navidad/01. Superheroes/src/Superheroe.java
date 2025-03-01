public class Superheroe{
    private String nombre;
    private String descripcion;
    private boolean capa;


    public Superheroe(String nombre){
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public boolean getCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }
}