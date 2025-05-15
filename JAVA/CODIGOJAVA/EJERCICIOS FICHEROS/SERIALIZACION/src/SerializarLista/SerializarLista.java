package SerializarLista;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarLista {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("JOse", 50));
        listaPersonas.add(new Persona("oscar", 21));
        listaPersonas.add(new Persona("rosi", 25));
        listaPersonas.add(new Persona("alejandro", 25));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SERIALIZACION/src/SerializarLista/listaSerializada.dat"))) {
            oos.writeObject(listaPersonas);

        }catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SERIALIZACION/src/SerializarLista/listaSerializada.dat"))) {
            List<Persona> listaRecuperada = (List<Persona>) ois.readObject();
            System.out.println(listaRecuperada);

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }




    }
}