package EjemploTransient;

import java.io.*;

public class EjemploTransient {
    public static void main(String[] args) {
        Usuario user = new Usuario("Pedrooo", "elsanche");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SERIALIZACION/src/EjemploTransient/usuarioSerializado.dat"))){
            oos.writeObject(user);
        }
        catch(IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SERIALIZACION/src/EjemploTransient/usuarioSerializado.dat"))){
            Usuario usuarioRecuperado = (Usuario) ois.readObject();
            System.out.println(usuarioRecuperado);
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

    }

}
