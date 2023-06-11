import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import clasesaparcamiento.Camion;
import clasesaparcamiento.Coche;
import FicherosLectura.*;

public class MainAparcamiento {
  public static final Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    System.out.println("Bienvenido al aparcamiento: Introduzca los siguientes datos");
    System.out.println("Coche o camion");
    String tipoVehiculo = entrada.nextLine();
    if (tipoVehiculo.equalsIgnoreCase("Coche")) {
      registroCoche();
    } else if (tipoVehiculo.equalsIgnoreCase("Camion")) {
      registroCamion();
    } else {
      System.out.println("Elección incorrecta");
    }
  }

  public static void registroCoche() throws IOException {
    System.out.println("Tu vehiculo es un coche");
    String respuesta = "";
    String matricula = "";
    do {
      System.out.println("introduce la matricula del coche");
      matricula = entrada.nextLine();
      System.out.println("Su matricula es: " + matricula + " " + "Es correcto?");
      respuesta = entrada.nextLine();
    } while (respuesta.equalsIgnoreCase("no"));
    System.out.println("Introduce la marca de tu coche");
    String marca = entrada.nextLine();
    System.out.println("Introduce el modelo de la marca");
    String modelo = entrada.nextLine();
    System.out.println("Introduce el largo de tu coche");
    Double medidasVehiculo = entrada.nextDouble();
    if (marca.isBlank() || modelo.isBlank() || medidasVehiculo <= 0 || matricula.isBlank()) {
      System.out.println("Parametros Introducidos Incorrectos");
    } else {
      System.out.println("Datos registrados del vehiculo ");
      Coche cocheIntroducido = new Coche(matricula, marca, modelo, medidasVehiculo);
      final String rutaArchivoCoche = "CochesEntrada.txt";
      BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaArchivoCoche, true));
      bufferEscritor.write(cocheIntroducido.toString() + "\n");
      bufferEscritor.close();
    }
  }

  public static void registroCamion() throws IOException {
    System.out.println("Su vehiculo es un camion");
    System.out.println("Introduzca la matricula del camión");
    String matricula = entrada.nextLine();
    System.out.println("Introduzca el numero de ruedas del vehiculo");
    int numeroRuedas = entrada.nextInt();
    if (matricula.isBlank() || numeroRuedas <= 0) {
      System.out.println("Parametros inválidos");
    } else {
      Camion camionIntroducido = new Camion(matricula, numeroRuedas);
      System.out.println("Datos registrados del vehiculo ");
      final String rutaArchivoCamion = "CamionEntrada.txt";
      BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaArchivoCamion, true));
      bufferEscritor.write(camionIntroducido.toString() + "\n");
      bufferEscritor.close();
    }
  }
}
