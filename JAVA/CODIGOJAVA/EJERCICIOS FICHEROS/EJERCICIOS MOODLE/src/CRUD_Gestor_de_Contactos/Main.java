package CRUD_Gestor_de_Contactos;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.cargarContactos();

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n\nGESTOR DE CONTACTOS");



            System.out.println("\n\n1 - Registrar un nuevo contacto");

            System.out.println("2 - Eliminar un contacto");

            System.out.println("3 - Actualizar un contacto");

            System.out.println("4 - Buscar un contacto en mi agena");

            System.out.println("5 - Ver mis contactos");

            System.out.println("6 - Salir de la agenda");


            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    controller.crearContacto();
                    break;

                case 2:
                    controller.eliminarContacto();
                    break;

                case 3:
                    controller.actualizarContacto();
                    break;

                case 4:
                    controller.encontrarContacto();
                    break;

                case 5:
                    controller.listarContactos();
                    break;

                case 6:
                    controller.guardarContactos();
            }
        }while (opcion != 6);


    }
}
