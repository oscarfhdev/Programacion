package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// El archivo 'alumnos_notas.txt' contiene una lista de 10 alumnos y las notas que han obtenido en cada asignatura. El número de asignaturas de cada alumno es variable. Implementa un programa que muestre por pantalla la nota media de cada alumno junto a su nombre y apellido, ordenado por nota media de mayor a menor.
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String filename = "EJERCICIOS FICHEROS 3/Documentos/alumnos_notas.txt";

        List<Alumno> alumnos = calcularNotasMedias(filename);

        // Ordenar alumnos por nota media de MAYOR a menor (orden descendente)
        alumnos.sort(Comparator.comparing((Alumno a) -> a.notaMedia).reversed());

        /*alumnos.sort(Comparator.comparing(Alumno::getNotaMedia).reversed());

        Collections.sort(alumnos, Comparator.comparing(Alumno::getNotaMedia).reversed());
        alumnos.sort((a1, a2) -> Double.compare(a2.notaMedia, a1.notaMedia));

        alumnos.sort(new Comparator<Alumno>() {
            public int compare(Alumno a1, Alumno a2) {
                return Double.compare(a1.notaMedia, a2.notaMedia);
            }
        });
        */
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public static List<Alumno> calcularNotasMedias(String filename) throws IOException {

        List<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partes = linea.trim().split(" ");

                if (partes.length >= 3) {
                    String nombre = partes[0];
                    String apellido = partes[1];
                    // Calcular nota media
                    double sumaNotas = 0;
                    for (int i = 2; i < partes.length; i++) {
                        sumaNotas += Double.parseDouble(partes[i]);
                    }
                    double notaMedia = sumaNotas / (partes.length - 2);
                    alumnos.add(new Alumno(nombre, apellido, notaMedia));
                }
            }
        }
        return alumnos;
    }
}
