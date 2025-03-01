package PackagesobreENTRADADEDATOSenJAVA;

public class HolaTeclado {
    public static void main(String[] args) {
        String nombre;
        int edad;

        System.out.println("Dime tu nombre: ");
        nombre = Teclado.LeeCadena();

        System.out.println("Dime tu edad: ");
        edad = Teclado.LeeEntero();

        System.out.println("Hola " + nombre + " ,tienes  " + edad + " años");
        System.out.println("Además eres " + nombre + ", te lo digo yo.");
    }
}
