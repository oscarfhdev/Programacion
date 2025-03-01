import java.util.Scanner;

// Clase que representa una zona
class Zona {
    private String nombre;
    private int entradasDisponibles;

    // Constructor
    public Zona(String nombre, int entradasDisponibles) {
        this.nombre = nombre;
        this.entradasDisponibles = entradasDisponibles;
    }

    // Metodo para mostrar las entradas disponibles
    public void mostrarEntradas() {
        System.out.println(nombre + ": " + entradasDisponibles + " entradas disponibles.");
    }

    // Metodo para vender entradas
    public boolean venderEntradas(int cantidad) {
        if (cantidad <= entradasDisponibles) {
            entradasDisponibles -= cantidad;
            System.out.println("Has comprado " + cantidad + " entradas para la " + nombre + ".");
            return true;
        } else {
            System.out.println("No hay suficientes entradas disponibles en la " + nombre + ".");
            return false;
        }
    }
}

// Clase principal
public class Expocoches {
    public static void main(String[] args) {
        // Crear las zonas
        Zona salaPrincipal = new Zona("Sala Principal", 1000);
        Zona compraVenta = new Zona("Zona Compra-Venta", 200);
        Zona zonaVIP = new Zona("Zona VIP", 25);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n--- Menú Expocoches Campanillas ---");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar entradas disponibles de cada zona
                    System.out.println("\nEntradas disponibles:");
                    salaPrincipal.mostrarEntradas();
                    compraVenta.mostrarEntradas();
                    zonaVIP.mostrarEntradas();
                    break;

                case 2:
                    // Vender entradas
                    System.out.println("\n¿En qué zona quieres comprar entradas?");
                    System.out.println("1. Sala Principal");
                    System.out.println("2. Zona Compra-Venta");
                    System.out.println("3. Zona VIP");
                    System.out.print("Elige una zona: ");
                    int zona = scanner.nextInt();

                    System.out.print("¿Cuántas entradas deseas comprar? ");
                    int cantidad = scanner.nextInt();

                    // Seleccionar la zona y vender entradas
                    switch (zona) {
                        case 1:
                            salaPrincipal.venderEntradas(cantidad);
                            break;
                        case 2:
                            compraVenta.venderEntradas(cantidad);
                            break;
                        case 3:
                            zonaVIP.venderEntradas(cantidad);
                            break;
                        default:
                            System.out.println("Zona no válida.");
                            break;
                    }
                    break;

                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}