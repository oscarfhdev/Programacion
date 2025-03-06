import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(10, "Parking Centro");
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n\nSelecciona una opción:\n------------------------------------");
            System.out.println("1 Entrada de coche");
            System.out.println("2 Salida de coche");
            System.out.println("3 Mostrar parking");
            System.out.println("4 Salir del programa");


            System.out.print("Ingrese un número: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1: {
                    System.out.println("El parking tiene " + parking.getPlazasTotales() + " plazas totales");
                    System.out.println("Elige una plaza e introduce la matrícula de tu coche");
                    System.out.print("Matrícula del coche: ");
                    String matricula = sc.nextLine();
                    System.out.print("Plaza donde aparcar el coche: ");
                    int plaza = Integer.parseInt(sc.nextLine());
                    try {
                        parking.entrada(matricula, plaza);
                        System.out.println("Entrada correcta.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                }
                case 2: {
                    System.out.print("Introduce la matrícula del coche a sacar: ");
                    String matricula = sc.nextLine();

                    try {
                        int plaza = parking.salida(matricula);
                        System.out.println("Se ha liberado tu coche de la plaza " +plaza);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3:{
                    System.out.println(parking);
                    break;
                }
                case 4:{
                    break;
                }
                }
            }
            while (opcion != 4);

        }
    }