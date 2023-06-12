package clasestiendaproductoselectronicos;

public class Producto {
  private String nombre = "";
  private String descripcion = "";
  private double precio = 0;

  public Producto(String nombre, String descripcion, double precio) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  @Override
  public String toString() {
    return nombre + " " + descripcion + " " + precio + " euros ";
  }

}
