package Ejercicio9;

import java.io.*;

//Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.
public class Ejercicio9 {
    public static void main(String[] args) {
        File ruta = new File("Ejercicio1/datos.txt");
        File nuevoNombre  = new File("Ejercicio1/informacion.txt");

        if(ruta.exists()){
            ruta.renameTo(nuevoNombre);
        }

        else{
            System.err.println("El archivo no se ha encontrado");
        }



    }
}
