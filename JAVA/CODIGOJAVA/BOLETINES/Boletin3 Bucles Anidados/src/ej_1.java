public class ej_1 {
    public static void main(String[] args) {
        int suma;

        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 3; j >= 0 ; j--) {
                suma = i*10 + j;
                System.out.println(suma);
            }
        }
    }
}