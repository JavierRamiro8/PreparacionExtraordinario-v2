package clasestiendaproductoselectronicos;

public class Portatil extends Producto {
  private double tamanioAlmacenamiento = 0;

  public Portatil(String nombre, String descripcion, double precio, double tamanioAlmacenamiento) {
    super(nombre, descripcion, precio);
    this.tamanioAlmacenamiento = tamanioAlmacenamiento;
  }

  public double getTamanioAlmacenamiento() {
    return tamanioAlmacenamiento;
  }

  @Override
  public String toString() {
    return super.toString() + " " + tamanioAlmacenamiento + " pulgadas";
  }
}
