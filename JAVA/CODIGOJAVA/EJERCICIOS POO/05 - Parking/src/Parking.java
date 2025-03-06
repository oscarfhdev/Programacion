import java.util.ArrayList;
import java.util.Collections;

public class Parking {
    private ArrayList<String> matriculas;
    private String nombre;


    public Parking(int numeroPlazasParking, String nombre) {
        this.matriculas = new ArrayList<>(Collections.nCopies(numeroPlazasParking, null));
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void entrada(String matricula, int plaza) {
        if (matricula == null || matricula.length() < 4) {
            throw new MatriculaInvalida("La matrícula que quieres registrar no es correcta");
        }

        // Comprobamos si la plaza está ocupada
        if (this.matriculas.get(plaza) != null) {
            throw new PlazaOcupada("La plaza en la que quieres introducir el coche está ocupada");
        }

        // Comprobamos si la matrícula ya está registrada en otra plaza
        for (int i = 0; i < this.matriculas.size(); i++) {
            if (this.matriculas.get(i) != null && this.matriculas.get(i).equals(matricula)) {
                throw new CocheEnOtraPlaza("Este coche ya está en otra plaza registrado");
            }
        }

        // Si todo es correcto, anadimos la matricula en la plaza indicada
        this.matriculas.set(plaza, matricula); // Usamos set para reemplazar el valor en la plaza
    }


    public int salida(String matricula) {
        for (int i = 0; i < this.matriculas.size(); i++) {
            if (this.matriculas.get(i) != null && this.matriculas.get(i).equals(matricula)){
                this.matriculas.set(i, null);
                return i;
            }
        }
        throw new MatriculaNoExistente("El coche con la matrícula que has introducido no existe");
    }

    public int getPlazasTotales() {
        return this.matriculas.size();
    }

    public int getPlazasOcupadas() {
        int contador = 0;

        for (String ocupado : this.matriculas)
            if (ocupado == null)
                contador++;

        return contador;
    }

    public int getPlazasLibres() {
        return getPlazasTotales()-getPlazasOcupadas();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nParking" + this.nombre + "\n--------------------------");

        for (int i = 0; i < this.matriculas.size(); i++){
            stringBuilder.append("\nPlaza "+i+": ");
            if (this.matriculas.get(i)!= null)
                stringBuilder.append(this.matriculas.get(i));
            else {
                stringBuilder.append("(vacía)");
            }
        }

        return stringBuilder.toString();

    }
}
