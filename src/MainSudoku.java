import java.util.Scanner;
import clasesSudoku.NivelFacil;
import clasesSudoku.NivelMedio;
import clasesSudoku.NivelDificil;

public class MainSudoku {
  public static final Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Bienvenido al Sudoku");
    System.out.println(
        "Elige el nivel del sudoku, Dependiendo del nivel que escojas, va a tener mas numeros "
        +"añadidos o menos");
    System.out.println("1) Facil (8 numeros resueltos)");
    System.out.println("2) Medio (6 numeros resueltos)");
    System.out.println("3) Dificil (4 numeros resueltos)");
    System.out.println("4) Salir del programa");
    int opcion = entrada.nextInt();
    if (opcion != 4) {
      switch (opcion) {
        case 1:
          NivelFacil.NivelPrincipiante();
          break;
        case 2:
          NivelMedio.NivelIntermedio();
          break;
        case 3:
        NivelDificil.NivelComplicado();
          break;

        default:
          System.out.println("Opción no válida");
      }
    } else {
      System.out.println("has salido del programa");
    }
  }
}