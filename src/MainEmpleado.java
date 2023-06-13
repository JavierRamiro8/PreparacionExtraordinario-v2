import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import clasesempleado.EmpleadoFijo;
import clasesempleado.EmpleadoPorHora;

public class MainEmpleado {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Elija el empleado que es usted: ");
        System.out.println("1) Empleado por horas");
        System.out.println("2) Empleado Fijo");
        System.out.println("3) Cierre");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        switch (opcion) {
            case 1:
                AñadirEmpleadoPorHora();
                break;
            case 2:
                AñadirEmpleadoFijo();
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion Erronea");
                break;
        }
    }

    public static void AñadirEmpleadoFijo() {
        System.out.println("Introduzca el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        System.out.println("Introduce tu salario diario");
        double salarioDiario = entrada.nextDouble();
        System.out.println("introduce los dias del mes trabajados");
        int diasAlMes = entrada.nextInt();
        if (nombre.isBlank() || edad <= 0 || salarioDiario <= 0 || diasAlMes <= 0) {
            System.out.println("Datos Inválidos");
        } else {
            EmpleadoFijo empleadoFijo = new EmpleadoFijo(nombre, edad, salarioDiario, diasAlMes);
            String rutaArchivo = "FicherosLectura/empleadoFijo.txt";
            try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                bufferEscritor.write(empleadoFijo.toString());
            } catch (IOException I) {
                System.out.println("Ha ocurrido un error en la entrada/salida de datos" + I.getMessage());
            }
            try (BufferedReader bufferLector = new BufferedReader(new FileReader(rutaArchivo))) {
                String lecturaLineas;
                while ((lecturaLineas = bufferLector.readLine()) != null) {
                    System.out.println(lecturaLineas + "\n");
                }
            } catch (IOException I) {
                System.out.println("Ha ocurrido un error en la entrada/salida de datos" + I.getMessage());
            }
        }
    }

    public static void AñadirEmpleadoPorHora() {
        System.out.println("Introduzca el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        System.out.println("Introduce tu salario diario");
        double salarioDiario = entrada.nextDouble();
        System.out.println("introduce los dias del mes trabajados");
        int diasAlMes = entrada.nextInt();
        if (nombre.isBlank() || edad <= 0 || salarioDiario <= 0 || diasAlMes <= 0) {
            System.out.println("Datos Inválidos");
        } else {
            EmpleadoPorHora empleadoHora = new EmpleadoPorHora(nombre, edad, salarioDiario, diasAlMes);
            String rutaArchivo = "FicherosLectura/entradaDeEmpleados.txt";
            try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                bufferEscritor.write(empleadoHora.toString());
            } catch (IOException I) {
                System.out.println("Ha ocurrido un error en la entrada/salida de datos" + I.getMessage());
            }
            try (BufferedReader bufferLector = new BufferedReader(new FileReader(rutaArchivo))) {
                String recorridoLineas;
                while ((recorridoLineas = bufferLector.readLine()) != null) {
                    System.out.println(recorridoLineas);
                }
            } catch (IOException I) {
                System.out.println("Ha ocurrido un error en la entrada/salida de datos" + I.getMessage());
            }
        }
    }
}
