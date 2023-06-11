package ClasesEjercicioLecturaSumarAmpliado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lecturaFicheros extends introducirValoresArchivo {
    public static void lecturaFicheroValoresAñadido() {

        try (BufferedReader bufferedLector = new BufferedReader(new FileReader(archivo))) {
            System.out.println("Estos son los datos que se han introducido en la escritura de datos: "
                    + bufferedLector.read() + "\n");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error type IOException");
        }
    }
}
