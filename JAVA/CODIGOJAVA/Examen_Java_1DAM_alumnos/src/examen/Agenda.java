package src.examen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que gestiona una lista de contactos.
 * Se deben implementar los métodos indicados y completar getters y setters de la clase Agenda
 */
public class Agenda {
    private List<Contacto> contactos;
    File archivoJSON = new File("resources/agendaJSON.json");
    ObjectMapper mapper = new ObjectMapper();
    Scanner sc = new Scanner(System.in);

    public List<Contacto> getContactos() {
        try {
            contactos = mapper.readValue(archivoJSON, new TypeReference<ArrayList<Contacto>>() {});
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return contactos;
    }

    // Metodo para guardar los contactos en el JSON
    public void guardarContactos() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(archivoJSON, contactos);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }


    public Agenda() {
        this.contactos = new ArrayList<>();
    }


    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
        guardarContactos();
    }


    /** Agrega un nuevo contacto a la agenda. */
    public void agregarContacto(Contacto contacto) {
        // TODO: Añadir el contacto a la lista
        contactos.add(contacto);
        guardarContactos();
    }

    /**
     * Elimina un contacto por nombre.
     * @return true si se eliminó correctamente, false si no se encontró
     */
    public boolean eliminarContacto(String nombre) {
        // TODO: Buscar y eliminar contacto por nombre (ignorar mayúsculas/minúsculas)
        for (Contacto contacto : contactos){
            if (nombre.equalsIgnoreCase(contacto.getNombre())){
                contactos.remove(contacto);
                guardarContactos();
                return true;
            }
        }
        return false;
    }


    /**
     * Busca todos los contactos que contengan el nombre dado.
     */
    public List<Contacto> buscarContacto(String nombre) {
        // TODO: Buscar contactos cuyo nombre contenga el texto indicado
        List<Contacto> coincidenciasEncontradas = new ArrayList<>();

        for (Contacto contacto : contactos){
            if (nombre.equalsIgnoreCase(contacto.getNombre())){
                coincidenciasEncontradas.add(contacto);
            }
        }
        return coincidenciasEncontradas;
    }

}
