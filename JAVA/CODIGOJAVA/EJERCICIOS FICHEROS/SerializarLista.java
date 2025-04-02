import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarLista {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("JOse", 50));
        listaPersonas.add(new Persona("oscar", 21));
        listaPersonas.add(new Persona("rosi", 25));
        listaPersonas.add(new Persona("alejandro", 25));


        System.out.println(listaPersonas.toString());


    }
}
