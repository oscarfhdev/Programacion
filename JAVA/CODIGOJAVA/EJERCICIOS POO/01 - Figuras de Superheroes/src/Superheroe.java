public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

     public Superheroe(String nombre){
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public String getNombre(){
         return this.nombre;
    }

    public void setNombre(String nombre){
         this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public String tieneCapa(){
        String tieneCapa;
        if (this.capa) {
            tieneCapa = " y tiene capa";
        }else {
            tieneCapa = " y no tiene capa";
        }
        return tieneCapa;
    }

    @Override
    public String toString(){
        return "Figura con nombre " + nombre + " descripcion: " + descripcion + tieneCapa();
    }

}
