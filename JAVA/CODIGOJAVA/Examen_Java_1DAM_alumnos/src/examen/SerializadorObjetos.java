package src.examen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite serializar y deserializar una lista de objetos Persona.
 */
public class SerializadorObjetos {

    /** Serializa una lista de personas en un archivo binario.
     */
    public static void guardarPersonas(List<Persona> personas, String rutaArchivo) {
        // TODO: Implementar serialización con ObjectOutputStream
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))){
            oos.writeObject(personas);
        }
        catch(IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Deserializa una lista de personas desde un archivo binario.
     */
    public static List<Persona> cargarPersonas(String rutaArchivo) {
        // TODO: Implementar deserialización con ObjectInputStream
        List<Persona> listaRecuperada = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            listaRecuperada = (List<Persona>) ois.readObject();
            System.out.println(listaRecuperada);

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
        return listaRecuperada;
    }


    public static void main(String[] args) {
        String ruta = "resources/personas.dat";

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));

        guardarPersonas(personas, ruta);
        List<Persona> cargadas = cargarPersonas(ruta);

        for (Persona p : cargadas) {
            System.out.println(p);
        }
    }
}

