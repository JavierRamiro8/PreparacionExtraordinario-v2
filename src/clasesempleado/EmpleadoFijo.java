package clasesempleado;

public class EmpleadoFijo extends Empleado {
    private int DiasTieneMes = 0;

    public EmpleadoFijo(String nombre, int edad, double salarioDiario, int DiasTieneMes) {
        super(nombre, edad, salarioDiario);
        this.DiasTieneMes = DiasTieneMes;
    }

    public int getDiasTieneMes() {
        return DiasTieneMes;
    }

    public double calcularSalario() {
        double resultado = 0;
        resultado = super.getSalarioDiario() * DiasTieneMes;
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getDiasTieneMes() + " horas "+ calcularSalario() + " euros ";
    }

}
