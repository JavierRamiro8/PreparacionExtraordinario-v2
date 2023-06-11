import clasesCuadradoMagico.ComprobacionesCuadradoMagico;
public class MainCuadradoMagico {
    public static void main(String[] args) {
        //Esto es el Cuadrado magico que funciona
        int[][] arrayBiNumeros={
            {3,3,3},
            {3,3,3},
            {3,3,3}
    };
    //Esto es un cuadrado magico que no funciona
    int[][]arrayNuevosValores={
        {10,11,12},
        {1,2,3},
        {9,5,6}
};
    //Esto ni es un cuadrado magico
    int[][]arrayNoCuadradoMagico={
        {10,11,12,13},
        {1,2,3},
        {9,5,6},
        {1,2}
};
        ComprobacionesCuadradoMagico comprobacionEsMagico=new ComprobacionesCuadradoMagico();
        boolean esMagico=comprobacionEsMagico.EsCuadradadoMagico(arrayBiNumeros);
        System.out.println("El cuadrado es magico: "+ esMagico);
        arrayBiNumeros=arrayNuevosValores;
        esMagico=comprobacionEsMagico.EsCuadradadoMagico(arrayBiNumeros);
        System.out.println("El cuadrado es mágico: "+ esMagico);
        arrayBiNumeros=arrayNoCuadradoMagico;
        esMagico=comprobacionEsMagico.EsCuadradadoMagico(arrayBiNumeros);
        System.out.println("El cuadrado es mágico: "+ esMagico);
    }
}
