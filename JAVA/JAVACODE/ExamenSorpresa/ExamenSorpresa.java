package ExamenSorpresa;/* Realiza un programa que pinte una tableta de turron con un bocado realizado de forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se da alrededo del turron, obviamente no se puede dar un bocado en el mendio de la tableta */
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExamenSorpresa {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Ingresa la altura de la tableta: ");
            int alturaTableta = Integer.parseInt(br.readLine());
            System.out.print("Ingresa la anchura de la tableta: ");
            int anchuraTableta = Integer.parseInt(br.readLine());
            char onza = '-';
            for (int i = 1; i <= alturaTableta; i++) {
                for (int j = 1; j <= anchuraTableta; j++) {
                    System.out.print(onza + " ");
                }
                System.out.println(" ");
            }

            System.out.println("Cuantos bocados le quieres dar a la tableta: ");
            int numBocados = Integer.parseInt(br.readLine());

            int contador = 0;
            int mitadTabletaAltura = alturaTableta / 2;
            int mitadTabletaAnchura = anchuraTableta / 2;
            Random rand = new Random();

            while (contador < numBocados) {
                int nuevaAlturaRandom = mitadTabletaAltura + rand.nextInt(alturaTableta - mitadTabletaAltura);
                int nuevaAnchuraRandom = mitadTabletaAnchura + rand.nextInt(anchuraTableta - mitadTabletaAnchura);
                contador ++;
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= nuevaAnchuraRandom; j++) {
                        System.out.print(onza + " ");
                    }
                    System.out.println(" ");
                }
            }

        }
        catch (IOException e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido");
        }


    }
}