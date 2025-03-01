import javax.swing.*;

public class PruebaJavaX {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero " + (i + 1) + ":"));
        }
        for (int numero:numeros){
            System.out.println(numero);
        }
        String [] letras = new String[3];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = JOptionPane.showInputDialog("Introduce un numero " + (i + 1) + ":");
        }
        for (String letra:letras){
            System.out.println(letra);
        }
    }
}
