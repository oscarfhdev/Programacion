public class Main {
    public static void main(String[] args) {

        //Parte 1
        Fraccion f1 = new Fraccion(1,4);
        Fraccion f2 = new Fraccion(1,2);
        Fraccion f3 = new Fraccion();
        Fraccion f4 = new Fraccion(4);

        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);

        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " + " + f2 + " = " + cociente);



        FraccionSimplificada prueba = new FraccionSimplificada(6, 2);

        System.out.println("Muestro una fraccion: " + prueba + " y ahora la simplifico obteniendo: " + prueba.simplificar());



    }
}
