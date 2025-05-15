package Ejercicio8;

import java.io.*;


//Crea una clase llamada ExploradorArchivos que realice las siguientes operaciones:
//
//Listar todos los archivos y carpetas contenidos en la ruta "/resources/explorador/"
//Hacer 10 copias de un archivo, por ejemplo copiar.txt (debes crearlo) y que las copias se encuentren en la carpeta
//Crear una estructura de subdirectorios dentro de "/resources/explorador/" que tenga la siguiente forma:
//  "/resources/explorador/volcan/descenso/aprobar/programacion/ y dentro de ella debe contener un archivo llamado "centroTierra.txt"
public class ExploradorArchivos {
    public static void main(String[] args) throws FileNotFoundException {
        String rutaBase = "EJERCICIOS FICHEROS 3/Documentos";

        listarDirectorio(rutaBase);
        crearArchivoBase(rutaBase, "copiar.txt");
        hacerCopias(rutaBase, "copiar.txt", 10);
        crearSubcarpetasYArchivo(rutaBase + "/volcan/descenso/aprobar/programacion/", "centroTierra.txt");
    }

    private static void listarDirectorio(String ruta){
        File rutaDirectorio = new File(ruta);
        File[] directorioAListar = rutaDirectorio.listFiles();

        if (directorioAListar != null){
            for (File elemento : directorioAListar){
                if (elemento.isFile())
                    System.out.println("ARCHIVO: " + elemento.getName());
                else{
                    System.out.println("DIRECTORIO: " + elemento.getName());

                }
            }
        }
        else{
            System.err.println("El directorio no existe o está vacío");
        }
    }

    private static void hacerCopias(String rutabase, String nombreOriginal, int cantidad) throws FileNotFoundException {
        File original = new File(rutabase, nombreOriginal);
        if(!original.exists()) {
            System.out.println("No se pueden hacer copias porque el archivo original no existe");
        }
        for(int i = 1; i < cantidad; i++) {
            File destino = new File(rutabase, nombreOriginal + "_" + i + ".txt");

            FileInputStream in = new FileInputStream(original);
            FileOutputStream out = new FileOutputStream(destino);
        }

    }

    private static void crearArchivoBase(String ruta, String nombreArchivo) {
        File archivo = new File(ruta, nombreArchivo);
        try(FileWriter fw = new FileWriter(archivo)) {
            fw.write("Metemos algo de contenido");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + nombreArchivo);
        }
    }

    private static void crearSubcarpetasYArchivo(String ruta, String nombreArchivo){
        File carpetas = new File(ruta);
        File archivoACrear = new File(ruta, nombreArchivo);

           if (carpetas.mkdirs() || carpetas.exists()){
               try (FileWriter fw = new FileWriter(archivoACrear)){
                   fw.write("El examen va a ser un desastre");
                   System.out.println("Archivo creado correctamente: " + archivoACrear.getName());
               }
               catch (IOException e){
                   System.out.println("Ha ocurrido un error: " + e);
                   e.printStackTrace();
               }
        }
    }
}
