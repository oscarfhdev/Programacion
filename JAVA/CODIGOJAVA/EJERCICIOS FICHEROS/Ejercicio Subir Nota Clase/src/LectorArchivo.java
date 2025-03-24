import java.io.*;

/*Programa que recibe el nombre de un archivo como argumento y muestra su contenido en la consola*/
public class LectorArchivo {
    public static void main(String[] args) {
        soutToPrintWriter();
    }

    public static void ej1(String entrada) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(entrada));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void soutToPrintWriter() {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Hello World");
        pw.close();
    }
}
