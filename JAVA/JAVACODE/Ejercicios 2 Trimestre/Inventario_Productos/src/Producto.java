public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;


    public Producto (int codigo, String nombre, double precio, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }


    public String mostrarInformacion() {
        return "producto: " + nombre + " codigo: " + codigo + " precio: " + precio + " cantidadStock: " + cantidadStock;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
        } else {
            System.out.println("No hay tanto Stock en" + nombre);
        }
    }

    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
        } else if (cantidad == 0) {
            System.out.println("El Stock es igual a como estaba antes");
        } else {
            System.out.println("No puede incrementar una cantidad negativa");
        }
    }
}