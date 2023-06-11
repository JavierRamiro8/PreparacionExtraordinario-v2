package ClasesEjercicioLecturaSumarAmpliado;

import java.util.ArrayList;
import java.util.Scanner;

public class introducirValores {
    public static final Scanner in = new Scanner(System.in);
    public static ArrayList<Integer> listaArray = new ArrayList<>();

    public static void introducirValoresArray() {

        String respuesta = "si";
        try (Scanner in = new Scanner(System.in)) {

            do {
                respuesta = "si";
                while (respuesta.equalsIgnoreCase("si")) {
                    int numero = 0;
                    System.out.println("Elige un numero: ");
                    numero = in.nextInt();
                    listaArray.add(numero);
                    System.out.println("Quieres Seguir?");
                    in.nextLine();
                    respuesta = in.nextLine();
                }
                System.out.println("estos son los datos que has introducido");
                for (int i = 0; i < listaArray.size(); i++) {
                    System.out.println("numero " + i + " es " + listaArray.get(i));
                }
                System.out.println("¿es correcto?");
                respuesta = in.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    listaArray.clear();
                } else {
                    System.out.println("Datos Guardados");
                }
            } while (respuesta.equals("no"));
        } catch (Exception e) {
            System.out.println("ha ocurrido un error en el momento de la ejecución");
        }
    }
}
