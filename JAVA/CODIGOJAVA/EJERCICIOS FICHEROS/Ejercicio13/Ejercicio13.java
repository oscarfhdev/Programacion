package Ejercicio13;

import java.io.*;

// Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.
public class Ejercicio13{
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("Ejercicio13/java.png");
            FileOutputStream fos = new FileOutputStream("Ejercicio13/javaCopiado.png"))
        {
            byte[] buffer = new byte[1024];
            int byteLeidos;

            while ((byteLeidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, byteLeidos);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
