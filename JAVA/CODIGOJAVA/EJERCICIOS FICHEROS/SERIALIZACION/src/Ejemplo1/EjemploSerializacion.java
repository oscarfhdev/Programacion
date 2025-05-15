package Ejemplo1;

import java.io.*;

public class EjemploSerializacion {
    public static void main(String[] args) {
        Persona p1 = new Persona("Paco", 22);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SERIALIZACION/src/Ejemplo1/persona.dat"))){
            oos.writeObject(p1);
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream("SERIALIZACION/src/Ejemplo1/persona.dat"))){
            Persona personaLeida = (Persona) ois.readObject();
            System.out.println(personaLeida);
        }
        catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
