package clasesaparcamiento;

public abstract class Vehiculo {
    private String matricula;

    public void Vehiculos(String matricula, enumAparcamiento tipo) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula) {
        super();
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract String calcularImporte();

    @Override
    public String toString() {
        return "matricula: " + matricula;
    }
}
