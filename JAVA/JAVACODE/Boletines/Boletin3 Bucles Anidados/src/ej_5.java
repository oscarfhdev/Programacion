/* Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad de que cada vez que aparezca un 3, se sustituya por una E. */
public class ej_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <10; k++) {
                    for (int l = 0; l <10; l++) {
                        for (int m = 0; m <10; m++) {
                            System.out.print(i + "-" + j + "-" + k + "-" + l + "-" + m);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
