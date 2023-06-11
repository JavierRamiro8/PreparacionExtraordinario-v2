import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class mainEjercicioLecturaSumar {
    public static void main(String[] args) {
        String ficheroLectura = "numeros.txt";
        int numeros;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        try (BufferedReader bufferLector = new BufferedReader(new FileReader(ficheroLectura))) {
            String linea;
            while ((linea = bufferLector.readLine()) != null) {
                numeros = Integer.parseInt(linea);
                listaNumeros.add(numeros);
            }
            int resultado = 0;
            for (int i = 0; i < listaNumeros.size(); i++) {
                resultado += listaNumeros.get(i);
            }
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Ha habido un error");
        }
    }
}