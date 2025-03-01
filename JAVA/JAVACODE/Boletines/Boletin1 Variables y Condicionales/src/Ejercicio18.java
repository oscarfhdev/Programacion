/* 18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días). */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class Ejercicio18 {
     public static void main(String[] args) {
         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
             System.out.println("Debes ingresar una fecha");
             System.out.print("Ingresa el día: ");
             int dia = Integer.parseInt(br.readLine());
             System.out.print("Ingresa el mes: ");
             int mes = Integer.parseInt(br.readLine());
             System.out.print("Ingresa el año: ");
             int ano = Integer.parseInt(br.readLine());

             if (mes < 1 || mes > 12) {
                 System.out.println("El mes es incorrecto.");
             } else {
                 boolean fechaCorrecta = false;

                 if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                     if (dia >= 1 && dia <= 31) {
                         fechaCorrecta = true;
                     }
                 } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                     if (dia >= 1 && dia <= 30) {
                         fechaCorrecta = true;
                     }
                 } else if (mes == 2) {
                     if (dia >= 1 && dia <= 28) {
                         fechaCorrecta = true;
                     }
                 }

                 if (fechaCorrecta) {
                     System.out.println("La fecha introducida es correcta, esta es tu fecha actual: " + dia + "/" + mes + "/" + ano);
                     if (mes == 2) {
                         if (dia < 28) {
                             dia++;
                         } else {
                             dia = 1;
                             mes++;
                         }

                     } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                         if (dia < 30)
                             dia++;
                         else {
                             dia = 1;
                             mes++;
                         }
                     } else {
                         if (dia < 31)
                             dia++;
                         else {
                             dia = 1;
                             if (mes == 12) {
                                 mes = 1;
                                 ano++;
                             } else {
                                 mes++;
                             }
                         }
                     }

                     System.out.println("Esta es tu fecha con un día más: " + dia + "/" + mes + "/" + ano);

                 } else {
                     System.out.println("La fecha introducida es incorrecta.");

                 }
             }
         } catch (IOException e) {
             System.out.println("Hubo un error: " + e.getMessage());
         } catch (NumberFormatException e) {
             System.out.println("Por favor, ingrese un número válido");
         }
     }
 }
