package ejercicio21;
//La consigna está al final
public class matriz_contenida_en_otra {

    public static void main(String[] args) {
        int[][] matriz1=new int[10][10];
        int[][] matriz2=new int[3][3];
        matriz1=llenar_matriz1(matriz1,10);
        matriz2=llenar_matriz1(matriz2,3);
        mostrar_matriz(matriz1,10);
        System.out.println("=================");
        mostrar_matriz(matriz2,3);
        System.out.println("=================");
        buscar_matriz(matriz1,10,matriz2,3);
    }
    public static int[][]llenar_matriz1(int[][]matriz, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j]=(int)(Math.random() * 10); //Para hacer una comprobación rápida de que funciona se puede poner en 1 o 2
            }
        }
        return matriz;
    }
    public static void mostrar_matriz(int[][]matriz, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    public static void buscar_matriz(int[][]m1, int n, int[][]m2, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((m1[i][j]==m2[0][0])& (n-i>=3) & (n-j>=3)){
                    boolean comprobacion=comprobar(m1,i,m2,j, n);
                    if (comprobacion){
                        System.out.println("La matriz comienza en la fila " + i + " columna " + j);
                    }
                }
            }
        }
    }
    public static boolean comprobar(int[][]m1,int fila, int[][]m2, int colum,int n){
        int contador = 0;
        for (int i = fila; i < fila+3; i++) {
            for (int j = colum; j < colum+3; j++) {
                if (m1[i][j]==m2[i-fila][j-colum]){
                    contador= contador+1;
                }
            }
        }
//        System.out.println(contador); //Era para comprobar hasta dónde llegaba la comprobación
        boolean comprobar= contador==9;
        return comprobar;
    }
}
/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/