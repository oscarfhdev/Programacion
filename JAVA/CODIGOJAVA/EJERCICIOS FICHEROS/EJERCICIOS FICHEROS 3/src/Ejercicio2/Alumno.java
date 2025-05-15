package Ejercicio2;

public class Alumno {
    String nombre;
    String apellido;
    double notaMedia;

    public Alumno(String nombre, String apellido, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notaMedia=" + notaMedia +
                '}';
    }

    public double getNotaMedia() {
        return notaMedia;
    }
}
