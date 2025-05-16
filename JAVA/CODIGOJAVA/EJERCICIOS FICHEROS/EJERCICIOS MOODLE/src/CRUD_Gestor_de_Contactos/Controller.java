package CRUD_Gestor_de_Contactos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    ObjectMapper mapper = new ObjectMapper();
    File archivoJSON = new File("EJERCICIOS MOODLE/src/CRUD_Gestor_de_Contactos/contactos.json");
    private List<Contacto> listaContactos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Metodo para cargar el JSON
    public void cargarContactos() {
        try {
            listaContactos = mapper.readValue(archivoJSON, new TypeReference<ArrayList<Contacto>>() {});
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    // Metodo para guardar los contactos en el JSON
    public void guardarContactos() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(archivoJSON, listaContactos);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }


    }

    // Método para crear contactos
    public void crearContacto(){
        System.out.println("Ingresa el nombre del contacto: ");
        String nombreContacto = sc.nextLine();

        System.out.println("Ingresa el teléfono del contacto: ");
        String telefonoContacto = sc.nextLine();

        System.out.println("Ingresa el email del contacto: ");
        String emailContacto = sc.nextLine();

        listaContactos.add(new Contacto(nombreContacto, telefonoContacto, emailContacto));
        guardarContactos();
        System.out.println("Contacto creado correctamente");
    }

    // Método para ver los contactos que tenemos
    public void listarContactos(){
        System.out.println("Contactos almacenados: ");
        for (Contacto contacto : listaContactos){
            System.out.println(contacto);
        }
    }


    // Metodo para eliminar un contacto
    public void eliminarContacto(){
        System.out.println("Ingresa el nombre de la persona que quieres eliminar");
        String nombreContacto = sc.nextLine();

        for (Contacto contacto : listaContactos){
            if (contacto.getNombre().equalsIgnoreCase(nombreContacto)){
                listaContactos.remove(contacto);
                guardarContactos();
                System.out.println("Contacto eliminado correctamente");
                return;
            }
        }
        System.out.println("El contacto no se ha encontrado");
    }


    // Metodo para actualizar un contacto
    public void actualizarContacto(){
        System.out.println("Ingresa el nombre del contacto que quieres editar");
        String nombreContacto = sc.nextLine();

        for (Contacto contacto : listaContactos){
            if (contacto.getNombre().equalsIgnoreCase(nombreContacto)){
                System.out.println("Ingresa el nuevo nombre del contacto");
                String nombreNuevo = sc.nextLine();
                contacto.setNombre(nombreNuevo);

                System.out.println("Ingresa el nuevo telefono del contacto");
                String telefonoNuevo = sc.nextLine();
                contacto.setTelefono(telefonoNuevo);

                System.out.println("Ingresa el nuevo email del contacto");
                String emailNuevo = sc.nextLine();
                contacto.setEmail(emailNuevo);

                guardarContactos();
                System.out.println("Contacto actualizado correctamente");
                return;
            }
            System.out.println("El contacto no se ha encontrado");
        }
    }


    //Metodo para encontrar a contacto()
    public void encontrarContacto(){
        System.out.println("Ingresa el nombre del contacto que buscas");
        String nombreContacto = sc.nextLine();


        for (Contacto contacto : listaContactos){
            if (contacto.getNombre().equalsIgnoreCase(nombreContacto)){
                System.out.println("Coincidencia encontrada:");
                System.out.println(contacto);
                return;
            }
        }
        System.out.println("El contacto no se ha encontrado");
    }
}
