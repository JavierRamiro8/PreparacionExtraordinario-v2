package clasesempleado;

public class EmpleadoPorHora extends Empleado {
    private int diasAlMes = 0;

    public EmpleadoPorHora(String nombre, int edad, double salarioDiario, int DiasAlMes) {
        super(nombre, edad, salarioDiario);
        this.diasAlMes = DiasAlMes;
    }

    public int getDiasAlMes() {
        return diasAlMes;
    }

    public double calcularSalario() {
        double resultado = 0;
        resultado = super.getSalarioDiario() * diasAlMes;
        return resultado;
    }

    public String toString() {
        return super.toString() + " " + getDiasAlMes() + " horas " + calcularSalario() + " euros mensuales";
    }

}
