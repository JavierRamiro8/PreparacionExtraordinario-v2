import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import clasesaparcamiento.Camion;
import clasesaparcamiento.Coche;

public class MainAparcamiento {
  public static final Scanner entrada = new Scanner(System.in);
  private static String respuesta = "";
  private static final String rutaArchivoCoche = "FicherosLectura/CochesEntrada.txt";
  private static final String rutaArchivoCamion = "FicherosLectura/CamionEntrada.txt";

  public static void main(String[] args) throws IOException {

    System.out.println("Bienvenido al aparcamiento: Introduzca los siguientes datos");
    do {
      System.out.println("Coche o camion");
      String tipoVehiculo = entrada.nextLine();
      if (tipoVehiculo.equalsIgnoreCase("Coche")) {
        registroCoche();
      } else if (tipoVehiculo.equalsIgnoreCase("Camion")) {
        registroCamion();
      } else {
        System.out.println("Elección incorrecta");
      }
      System.out.println("Se ha acabado el dia?");
      respuesta = entrada.nextLine();
    } while (respuesta.equalsIgnoreCase("no"));
    System.out.println("¿Quieres ver el registro  de vehiculos de hoy?");
    respuesta = entrada.nextLine();
    if (respuesta.equalsIgnoreCase("si")) {
      lecturaDeRegistros();
    } else {
      System.out.println("el dia está cerrado");
    }
  }

  public static void registroCoche() throws IOException {
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
    entrada.nextLine();
    if (marca.isBlank() || modelo.isBlank() || medidasVehiculo <= 0 || matricula.isBlank()) {
      System.out.println("Parametros Introducidos Incorrectos");
    } else {
      System.out.println("Datos registrados del vehiculo ");
      Coche cocheIntroducido = new Coche(matricula, marca, modelo, medidasVehiculo);
      BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaArchivoCoche, true));
      bufferEscritor.write(cocheIntroducido.toString() + "\n");
      bufferEscritor.close();
    }
  }

  public static void registroCamion() throws IOException {
    System.out.println("Introduzca la matricula del camión");
    String matricula = entrada.nextLine();
    System.out.println("Introduzca el numero de ruedas del vehiculo");
    int numeroRuedas = entrada.nextInt();
    if (matricula.isBlank() || numeroRuedas <= 0) {
      System.out.println("Parametros inválidos");
    } else {
      Camion camionIntroducido = new Camion(matricula, numeroRuedas);
      System.out.println("Datos registrados del vehiculo ");
      BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaArchivoCamion, true));
      bufferEscritor.write(camionIntroducido.toString() + "\n");
      bufferEscritor.close();
    }
  }

  public static void lecturaDeRegistros() throws IOException {
    do {
      System.out.println("Que registro quieres ver: Coche o Camion");
      String respuestaLecturaRegistro = entrada.nextLine();
      if (respuestaLecturaRegistro.equalsIgnoreCase("Coche")) {
        BufferedReader bufferLectorCoche = new BufferedReader(new FileReader(rutaArchivoCoche));
        bufferLectorCoche.readLine();
        bufferLectorCoche.close();
      } else {
        BufferedReader bufferLectorCamion = new BufferedReader(new FileReader(rutaArchivoCamion));
        bufferLectorCamion.readLine();
        bufferLectorCamion.close();
      }
    } while (respuesta.equalsIgnoreCase("si"));
  }
}
