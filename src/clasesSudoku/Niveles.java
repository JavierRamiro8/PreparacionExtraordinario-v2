package clasesSudoku;

public abstract class Niveles {
    private static int[][] ArrayBiNumeros=new int[9][9];
    public void NivelGeneral(int[][] ArrayBiNumeros){
        for(int columna=0; columna<ArrayBiNumeros.length;columna++){
            for(int fila=0;fila<ArrayBiNumeros.length;fila++){
                int numeroCero=0;
                ArrayBiNumeros[columna][fila]=numeroCero;
            }
        }
    }
    public static int[][] getArrayBiNumeros() {
        return ArrayBiNumeros;
    }
    @Override
    public String toString() {
        return "Tenemos una plantilla de sudoku de 9x9:";
    }
}
