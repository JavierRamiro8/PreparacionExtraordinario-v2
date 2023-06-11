package clasesSudoku;

import java.util.Random;

public class NivelDificil extends Niveles{
    public static void NivelComplicado(){
        Random random=new Random();
        int[][]arrayBiNumeros=getArrayBiNumeros();
        final int numeroPreAñadido=4;
        int fila=0;
        int columna=0;
        
        try{fila=random.nextInt(9);
        columna=random.nextInt(9);
        }catch(IllegalArgumentException i){
            System.out.println("Error, el numero debe de ser positivo");
        }
        for(int i=0;i<numeroPreAñadido;i++){
            arrayBiNumeros[fila][columna]=random.nextInt(9);
            fila=random.nextInt(9);
            columna=random.nextInt(9);
        }
        for(int c=0;c<arrayBiNumeros.length;c++){
            for(int f=0;f<arrayBiNumeros.length;f++){
                if(arrayBiNumeros[c][f]!=0){
                    System.out.println("en la columna: "+c +" fila: "+f+ " esta el numero: "+ arrayBiNumeros[c][f]);
                }
            }
        }
        
    }
}
