package clasesCuadradoMagico;

public class ComprobacionesCuadradoMagico {
  public boolean EsCuadradadoMagico(int[][] arrayBiNumeros) {
    // He creado las variables de valorCero/Uno/Dos para que en el codigo no halla
    // numeros magicos
    final int valorCero = 0;
    final int valorUno = 1;
    final int valorDos = 2;
    int fila = arrayBiNumeros.length;
    int columna = arrayBiNumeros.length;
    int sumaFila = 0;
    int sumaColumna = 0;
    int diagonalIzqDer = 0;
    int diagonalDerIzq = 0;
    // Comprobar si realmente es un cuadrado
    if (fila != columna) {
      return false;
    } else {
      // sumar la primera horizonal

      for (int f = 0; f < arrayBiNumeros.length; f++) {
        sumaFila += arrayBiNumeros[valorCero][f];
      }
      // sumar la primera vertical
      for (int c = 0; c < arrayBiNumeros.length; c++) {
        sumaColumna += arrayBiNumeros[c][valorCero];
      }
      if (sumaFila != sumaColumna) {
        return false;
      } else {
        // sumar la segunda horizonal
        sumaFila = 0;
        sumaColumna = 0;
        for (int f = 0; f < arrayBiNumeros.length; f++) {
          sumaFila += arrayBiNumeros[valorUno][f];
        }
        // sumar la segunda vertical
        for (int c = 0; c < arrayBiNumeros.length; c++) {
          sumaColumna += arrayBiNumeros[c][valorUno];
        }
        if (sumaFila != sumaColumna) {
          return false;
        } else {
          sumaFila = 0;
          sumaColumna = 0;
          // sumar la tercera horizonal
          for (int f = 0; f < arrayBiNumeros.length; f++) {
            sumaFila += arrayBiNumeros[valorDos][f];
          }
          // sumar la tercera vertical
          for (int c = 0; c < arrayBiNumeros.length; c++) {
            sumaColumna += arrayBiNumeros[c][valorDos];
          }
          if (sumaFila != sumaColumna) {
            return false;
          } else {
            // Sumas de Diagonales
            for (int i = 0; i < arrayBiNumeros.length; i++) {
              diagonalIzqDer += arrayBiNumeros[i][i];
            }
            for (int d = arrayBiNumeros.length - 1; d >= valorCero; d--) {
              diagonalDerIzq += arrayBiNumeros[d][d];
            }
            if (diagonalIzqDer != diagonalDerIzq) {
              return false;
            } else {
              return true;
            }
          }
        }
      }
    }
  }
}