package clasestiendaproductoselectronicos;

public class Television extends Producto {
    private double tamanioPantalla = 0;

    public Television(String nombre, String descripcion, double precio, double tamanioPantalla) {
        super(nombre, descripcion, precio);
        this.tamanioPantalla = tamanioPantalla;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tamanioPantalla + " pulgadas";
    }
}
