package clasesaparcamiento;

public class Coche extends Vehiculo {
  private String marca;
  private String modelo;
  private double largo;

  public Coche(String matricula, String marca, String modelo, Double largo) {
    super(matricula);
    this.marca = marca;
    this.largo = largo;
    this.modelo = modelo;
  }

  public int pasarRevision() {
    if (getMarca().equalsIgnoreCase("audi")) {
      int numeroAñosRevisionAudi = 5;
      return numeroAñosRevisionAudi;
    } else if (getMarca().equalsIgnoreCase("bmw")) {
      int numeroAñosRevisionBmw = 6;
      return numeroAñosRevisionBmw;
    } else if (getMarca().equalsIgnoreCase("mercedes")) {
      int numeroAñosRevisionMercedes = 5;
      return numeroAñosRevisionMercedes;
    } else {
      int numeroAñosRevisionOtrosCoches = 3;
      return numeroAñosRevisionOtrosCoches;
    }

  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public double getLargo() {
    return largo;
  }

  public String calcularImporte() {
    final int numeroCalculoCoche = 5;
    Double importeCoche = numeroCalculoCoche * getLargo();
    return "El precio por el coche es: " + importeCoche;
  }

  @Override
  public String toString() {
    return enumAparcamiento.COCHE + "--- " + super.toString() + " ----- " + " Marca y modelo: "
        + getMarca()+ getModelo()
        + " ---- Largo: " + getLargo() + "m " + calcularImporte() + " " 
        + "y el coche tiene que pasar la revision en: "
        + pasarRevision() + " anios";
  }
}
