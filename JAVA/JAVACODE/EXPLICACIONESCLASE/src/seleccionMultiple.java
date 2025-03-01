/* Se pide al usuario el numero de mes en un programa y se debe de dar el número que corresponde a ese mes
*/
import java.util.Scanner;
public class seleccionMultiple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        String NombreDelMes;
        System.out.print("Ingrese el numero de mes: ");
        op = entrada.nextInt();

        switch (op){
            case 1:
                NombreDelMes = "Enero";
                break;
            case 2:
                NombreDelMes = "Febrero";
                break;
            case 3:
                NombreDelMes = "Marzo";
                break;
            case 4:
                NombreDelMes = "Abril";
                break;
            case 5:
                NombreDelMes = "Mayo";
                break;
            case 6:
                NombreDelMes = "Junio";
                break;
            case 7:
                NombreDelMes = "Julio";
                break;
            case 8:
                NombreDelMes = "Agosto";
                break;
            case 9:
                NombreDelMes = "Septiembre";
                break;
            case 10:
                NombreDelMes = "Octubre";
                break;
            case 11:
                NombreDelMes = "Noviembre";
                break;
            case 12:
                NombreDelMes = "Diciembre";
                break;
            default:
                NombreDelMes = "No existe este mes";
                break;

            /* NombreDelMes = switch (op) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "No existe este mes"; */
        }
        System.out.println(NombreDelMes);
    }
}