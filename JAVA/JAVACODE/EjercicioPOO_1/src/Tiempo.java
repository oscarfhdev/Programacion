public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        normalizarTiempo();
    }
    

    public Tiempo sumar(Tiempo otro) {
        int nuevasHoras = this.horas + otro.horas;
        int nuevosMinutos = this.minutos + otro.minutos;
        int nuevosSegundos = this.segundos + otro.segundos;

        return new Tiempo(nuevasHoras, nuevosMinutos, nuevosSegundos); // Devuelve un nuevo objeto Ej6v2_Tiempo
    }

    public Tiempo restar(Tiempo otro) {
        int nuevasHoras = this.horas - otro.horas;
        int nuevosMinutos = this.minutos - otro.minutos;
        int nuevosSegundos = this.segundos - otro.segundos;

        // Aseguramos que no haya valores negativos
        if (nuevosSegundos < 0) {
            nuevosMinutos -= 1;
            nuevosSegundos += 60;
        }
        if (nuevosMinutos < 0) {
            nuevasHoras -= 1;
            nuevosMinutos += 60;
        }
        if (nuevasHoras < 0) {
            nuevasHoras = 0;
            nuevosMinutos = 0;
            nuevosSegundos = 0;
        }

        return new Tiempo(nuevasHoras, nuevosMinutos, nuevosSegundos); // Devuelve un nuevo objeto Ej6v2_Tiempo
    }

    private void normalizarTiempo() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos = segundos % 60;
        }
        if (minutos >= 60) {
            horas += minutos / 60;
            minutos = minutos % 60;
        }
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);

        System.out.println(t1 + " + " + t2 + " = " + t1.sumar(t2));
        System.out.println(t2 + " - " + t3 + " = " + t2.restar(t3));

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");

        Tiempo tiempo1 = new Tiempo(0, 30, 40);
        Tiempo tiempo2 = new Tiempo(0, 35, 20);

        System.out.println("Tiempo 1: " + tiempo1); // Salida: 0h 30m 40s
        System.out.println("Tiempo 2: " + tiempo2); // Salida: 0h 35m 20s

        tiempo1.sumar(tiempo2);
        System.out.println("Después de sumar Tiempo 2 a ETiempo 1: " + tiempo1); // Salida: 1h 6m 0s

        Tiempo tiempo3 = new Tiempo(0, 20, 50);
        tiempo1.restar(tiempo3);
        System.out.println("Después de restar Tiempo 3 de Tiempo 1: " + tiempo1); // Salida: 0h 45m 10s

        Tiempo tiempo4 = new Tiempo(0, 120, 125);
        System.out.println("Tiempo 4 normalizado: " + tiempo4); // Salida: 2h 1m 5s
    }
}
