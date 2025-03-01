package ExamenSorpresa;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamenSorpresa2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa la altura de la tableta: ");
            int alturaTableta = Integer.parseInt(br.readLine());
            System.out.print("Ingresa la anchura de la tableta: ");
            int anchuraTableta = Integer.parseInt(br.readLine());

            char onza = '#';

            char[][] tableta = new char[alturaTableta][anchuraTableta];

            for (int i = 0; i < alturaTableta; i++) {
                for (int j = 0; j < anchuraTableta; j++) {
                    tableta[i][j] = onza;
                }
            }

            System.out.println("¿Cuántos bocados le quieres dar a la tableta? ");
            int numBocados = Integer.parseInt(br.readLine());

            Random rand = new Random();

            for (int contador = 0; contador < numBocados; contador++) {
                int ladoBocado = rand.nextInt(4); // 0=arriba, 1=abajo, 2=izquierda, 3=derecha
                int filaBocado = 0;
                int colBocado = 0;
                int tamanioBocado = 3;

                if (ladoBocado == 0) { // Lado superior
                    filaBocado = 0;
                    colBocado = rand.nextInt(anchuraTableta - tamanioBocado);
                } else if (ladoBocado == 1) { // Lado inferior
                    filaBocado = alturaTableta - 1;
                    colBocado = rand.nextInt(anchuraTableta - tamanioBocado);
                } else if (ladoBocado == 2) { // Lado izquierdo
                    filaBocado = rand.nextInt(alturaTableta - tamanioBocado);
                    colBocado = 0;
                } else if (ladoBocado == 3) { // Lado derecho
                    filaBocado = rand.nextInt(alturaTableta - tamanioBocado);
                    colBocado = anchuraTableta - 1;
                }

                for (int i = filaBocado; i < filaBocado + tamanioBocado; i++) {
                    for (int j = colBocado; j < colBocado + tamanioBocado; j++) {
                        if (i < alturaTableta && j < anchuraTableta) {
                            tableta[i][j] = ' '; //
                        }
                    }
                }
            }

            System.out.println("Tableta de turrón con los bocados:");
            for (int i = 0; i < alturaTableta; i++) {
                for (int j = 0; j < anchuraTableta; j++) {
                    System.out.print(tableta[i][j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Hubo un error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }
    }
}
