/* 22. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis. */
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int unidades, decenas;

        System.out.print("Introduzca un número (0 a 99): ");
        num = sc.nextInt();

        unidades = num % 10;
        decenas = num / 10;

        // Caso especial para los numeros entre 11 y 15

        if (num >= 11 && num <= 15) {
            switch (num) {
                case 11:
                    System.out.println("once");
                    break;
                case 12:
                    System.out.println("doce");
                    break;
                case 13:
                    System.out.println("trece");
                    break;
                case 14:
                    System.out.println("catorce");
                    break;
                case 15:
                    System.out.println("quince");
                    break;
            }
        } else {
            switch (decenas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    if (unidades == 0) {
                        System.out.print("diez");
                    } else {
                        System.out.print("dieci");
                    }
                    break;
                case 2:
                    if (unidades == 0) {
                        System.out.print("veinte");
                    } else {
                        System.out.print("veinti");
                    }
                    break;
                case 3:
                    System.out.print("treinta");
                    break;
                case 4:
                    System.out.print("cuarenta");
                    break;
                case 5:
                    System.out.print("cincuenta");
                    break;
                case 6:
                    System.out.print("sesenta");
                    break;
                case 7:
                    System.out.print("setenta");
                    break;
                case 8:
                    System.out.print("ochenta");
                    break;
                case 9:
                    System.out.print("noventa");
                    break;
            }

            if (decenas > 2 && unidades != 0)
                System.out.print(" y ");
            if (decenas != 1 && decenas != 2) {
                switch(unidades){
                    case 0:
                        System.out.println("");
                        break;
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                }
            } else {
                if (decenas == 1 || decenas == 2) {
                    switch(unidades){
                        case 0:
                            System.out.println("");
                            break;
                        case 1:
                            System.out.println("uno");
                            break;
                        case 2:
                            System.out.println("dos");
                            break;
                        case 3:
                            System.out.println("tres");
                            break;
                        case 4:
                            System.out.println("cuatro");
                            break;
                        case 5:
                            System.out.println("cinco");
                            break;
                        case 6:
                            System.out.println("seis");
                            break;
                        case 7:
                            System.out.println("siete");
                            break;
                        case 8:
                            System.out.println("ocho");
                            break;
                        case 9:
                            System.out.println("nueve");
                            break;
                    }
                }
            }
        }
    }
}
