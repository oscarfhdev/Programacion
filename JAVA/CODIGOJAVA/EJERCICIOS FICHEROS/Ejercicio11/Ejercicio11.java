package Ejercicio11;

import java.io.File;

// Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
public class Ejercicio11 {
    public static void main(String[] args) {
        String directorioActual = "./";
        File miDirectorio = new File(directorioActual);

        String[] contenido = miDirectorio.list();

        for (int i = 0; i < contenido.length ; i++) {
            if (new File(contenido[i]).isDirectory()){
                System.out.println(contenido[i] + ": Es un directorio");
            }
            else{
                System.out.println(contenido[i] + ": Es un archivo");
            }
        }

//        File[] contenidoDirectorio = miDirectorio.listFiles();
//        for (File c : contenidoDirectorio){
//            if (c.isDirectory()){
//                System.out.println(c + ": Es un directorio");
//            } else if (c.isFile()) {
//                System.out.println(c + ": Es un archivo");
//
//            }
//        }
    }
}
