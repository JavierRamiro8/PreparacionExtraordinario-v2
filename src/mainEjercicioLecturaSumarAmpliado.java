import java.util.Scanner;

import ClasesEjercicioLecturaSumarAmpliado.introducirValores;
import ClasesEjercicioLecturaSumarAmpliado.introducirValoresArchivo;
import ClasesEjercicioLecturaSumarAmpliado.lecturaFicheros;

public class mainEjercicioLecturaSumarAmpliado {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String respuesta = "si";
        do {
            System.out.println("Elige una opción");
            System.out.println("1)añadir valores");
            System.out.println("2)Cargar Valores en disco");
            System.out.println("3)Leer valores en disco");
            System.out.println("4)salir del programa");
            int opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    introducirValores.introducirValoresArray();
                    System.out.println("Quieres Seguir");
                    respuesta = in.nextLine();
                    break;
                case 2:
                    introducirValoresArchivo.introducirValoresArchivoEscrito();
                    System.out.println("Quieres Seguir");
                    respuesta = in.nextLine();
                    break;
                case 3:
                    lecturaFicheros.lecturaFicheroValoresAñadido();
                    System.out.println("Quieres Seguir");
                    respuesta = in.nextLine();
                    break;
                case 4:
                    respuesta = "no";
                    break;
                default:
                    System.out.println("opción seleccionada incorrecta");
            }
        } while (respuesta.equalsIgnoreCase("si"));
    }
}
