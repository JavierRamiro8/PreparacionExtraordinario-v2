package ClasesEjercicioLecturaSumarAmpliado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class introducirValoresArchivo extends introducirValores {
    public static String archivo = "entradaParaMainEjercicioLecturaSumarAmpliado.txt";

    public static void introducirValoresArchivoEscrito() {
        try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(archivo, true))) {
            for (int i = 0; i < listaArray.size(); i++) {
                bufferEscritor.write(listaArray.get(i) + "\n");
            }
            System.out.println("operación realizada");
        } catch (IOException e) {
            System.out.println("Error type IOException");
        }
    }
}
