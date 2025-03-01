import java.util.Random;
import java.util.Scanner;
public class bandera_aleatoria {
    public static void main(String[] args) {
        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
        Random rand = new Random();
        System.out.println("-----------------------------");
        for(int i = 0; i<3; i++ ){
            System.out.println(color[rand.nextInt(color.length)]);
            System.out.println("-----------------------------");


        }

    }
}
