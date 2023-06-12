import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import clasestiendaproductoselectronicos.Portatil;
import clasestiendaproductoselectronicos.Telefono;
import clasestiendaproductoselectronicos.Television;

//Hecho por Javier Ramiro
//para este ejercicio a parte de ver las ISSUES del ejercicio anterior, 
//he intentado cumplimentar en un mismo metodo tanto lectura como escritura 
//mas que nada por la cabecera.

public class MainTiendaProductosElectronicos {
  public static final Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    String respuesta = "";
    String rutaRegistroTelefono = "FicherosLectura/RegistroTelefono.txt";
    String rutaRegistroTelevision = "FicherosLectura/RegistroTelevision.txt";
    String rutaRegistroPortatil = "FicherosLectura/RegistroPortatil.txt";

    System.out.println("Tienda de productos Electronicos");
    do {
      System.out.println("Introduce un producto, selecciona la opcion indicada");
      System.out.println("1)Television");
      System.out.println("2)Portatil");
      System.out.println("3)Telefono");
      int opcion = entrada.nextInt();
      entrada.nextLine();
      switch (opcion) {
        case 1:
          System.out.println("Introduce los datos de la television");
          grabarTelevision(rutaRegistroTelevision);
          break;
        case 2:
          System.out.println("Introduce los datos de la Portatil");
          grabarPortatil(rutaRegistroPortatil);
          break;
        case 3:
          System.out.println("Introduce los datos de la Telefono");
          grabarTelefono(rutaRegistroTelefono);
          break;
        default:
          System.out.println("Error, opcion incorrecta");
          break;
      }
      System.out.println("Quieres seguir introduciendo datos?");
      respuesta = entrada.nextLine();
    } while (respuesta.equalsIgnoreCase("Si"));
  }

  private static void grabarTelevision(String rutaRegistroTelevision) {
    try (BufferedReader bufferLector = new BufferedReader(new FileReader(rutaRegistroTelevision))) {
      try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaRegistroTelevision, true))) {
        System.out.print("Introduce el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce una descripcion breve del producto: ");
        String descripcion = entrada.nextLine();
        System.out.print("Introduce el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Introduce el tamanio de la pantalla del producto: ");
        double tamanioPantalla = entrada.nextDouble();
        entrada.nextLine();
        if (nombre.isBlank() || descripcion.isBlank() || precio <= 0 || tamanioPantalla <= 0) {
          System.out.println("Valores introducidos Erroneos");
        } else {
          Television televisionIntroducido = new Television(nombre, descripcion, precio, tamanioPantalla);
          String lineaRegistroCero = bufferLector.readLine();
          boolean cabezaNoEscrita = false;
          if (lineaRegistroCero != null && lineaRegistroCero.equals("nombre descripcion precio Tamanio de Pantalla")) {
            cabezaNoEscrita = false;
          } else {
            cabezaNoEscrita = true;
          }
          if (cabezaNoEscrita == true) {
            bufferEscritor.write("nombre " + "descripcion " + "precio " + "Tamanio de Pantalla" + "\n");
          }
          bufferEscritor.write(televisionIntroducido.toString() + "\n");
          bufferEscritor.close();

          System.out.println("Quieres leer el registro? si/no");
          String respuesta = entrada.nextLine();
          if (respuesta.equalsIgnoreCase("si")) {
            String lineaRegistro = "";
            while ((lineaRegistro = bufferLector.readLine()) != null) {
              System.out.println(lineaRegistro);
            }
          } else {
            System.out.println("");
          }
        }
      } catch (FileNotFoundException f) {
        System.out.println("No se ha encontrado el fichero " + f.getMessage());
      }
    } catch (IOException i) {
      System.out.println("Ha ocurrido un error con el transcurso de la escritura" + i.getMessage());
    }
  }

  private static void grabarPortatil(String rutaRegistroPortatil) {
    try (BufferedReader bufferLector = new BufferedReader(new FileReader(rutaRegistroPortatil))) {
      try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaRegistroPortatil, true))) {
        System.out.print("Introduce el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce una descripcion breve del producto: ");
        String descripcion = entrada.nextLine();
        System.out.print("Introduce el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Introduce el tamanio del almacenamiento del producto: ");
        double tamanioAlmacenamiento = entrada.nextDouble();
        entrada.nextLine();
        if (nombre.isBlank() || descripcion.isBlank() || precio <= 0 || tamanioAlmacenamiento <= 0) {
          System.out.println("Valores introducidos Erroneos");
        } else {
          Portatil portatilIntroducido = new Portatil(nombre, descripcion, precio, tamanioAlmacenamiento);
          String lineaRegistroCero = bufferLector.readLine();
          boolean cabezaNoEscrita = false;
          if (lineaRegistroCero != null
              && lineaRegistroCero.equals("nombre descripcion precio Tamanio de Almacenamiento")) {
            cabezaNoEscrita = false;
          } else {
            cabezaNoEscrita = true;
          }
          if (cabezaNoEscrita == true) {
            bufferEscritor.write("nombre " + "descripcion " + "precio " + "Tamanio de Almacenamiento" + "\n");
          }
          bufferEscritor.write(portatilIntroducido.toString() + "\n");
          bufferEscritor.close();

          System.out.println("Quieres leer el registro? si/no");
          String respuesta = entrada.nextLine();
          if (respuesta.equalsIgnoreCase("si")) {
            String lineaRegistro = "";
            while ((lineaRegistro = bufferLector.readLine()) != null) {
              System.out.println(lineaRegistro);
            }
          } else {
            System.out.println("");
          }
        }
      } catch (FileNotFoundException f) {
        System.out.println("No se ha encontrado el fichero " + f.getMessage());
      }
    } catch (IOException i) {
      System.out.println("Ha ocurrido un error con el transcurso de la escritura" + i.getMessage());
    }
  }

  private static void grabarTelefono(String rutaRegistroTelefono) {
    try (BufferedReader bufferLector = new BufferedReader(new FileReader(rutaRegistroTelefono))) {
      try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaRegistroTelefono, true))) {
        System.out.print("Introduce el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce una descripcion breve del producto: ");
        String descripcion = entrada.nextLine();
        System.out.print("Introduce el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Introduce el tamanio del almacenamiento del producto: ");
        double tamanioAlmacenamiento = entrada.nextDouble();
        entrada.nextLine();
        if (nombre.isBlank() || descripcion.isBlank() || precio <= 0 || tamanioAlmacenamiento <= 0) {
          System.out.println("Valores introducidos Erroneos");
        } else {
          Telefono telefonoIntroducido = new Telefono(nombre, descripcion, precio, tamanioAlmacenamiento);
          String lineaRegistroCero = bufferLector.readLine();
          boolean cabezaNoEscrita = false;
          if (lineaRegistroCero != null
              && lineaRegistroCero.equals("nombre descripcion precio Tamanio de Almacenamiento")) {
            cabezaNoEscrita = false;
          } else {
            cabezaNoEscrita = true;
          }
          if (cabezaNoEscrita == true) {
            bufferEscritor.write("nombre " + "descripcion " + "precio " + "Tamanio de Almacenamiento" + "\n");
          }
          bufferEscritor.write(telefonoIntroducido.toString() + "\n");
          bufferEscritor.close();

          System.out.println("Quieres leer el registro? si/no");
          String respuesta = entrada.nextLine();
          if (respuesta.equalsIgnoreCase("si")) {
            String lineaRegistro = "";
            while ((lineaRegistro = bufferLector.readLine()) != null) {
              System.out.println(lineaRegistro);
            }
          } else {
            System.out.println("");
          }
        }
      } catch (FileNotFoundException f) {
        System.out.println("No se ha encontrado el fichero " + f.getMessage());
      }
    } catch (IOException i) {
      System.out.println("Ha ocurrido un error con el transcurso de la escritura" + i.getMessage());
    }
  }
}