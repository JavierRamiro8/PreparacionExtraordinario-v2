package clasesempleado;

public abstract class Empleado {
    private String nombre = "";
    private int edad = 0;
    private double salario = 0;

    public Empleado(String nombre, int edad, double salarioDiario) {
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salarioDiario;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalarioDiario() {
        return salario;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getEdad() + " anios " + getSalarioDiario()+ " euros diarios y";
    }
}
