package ejercicio18;
/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
public class matriz_traspuesta {
    public static void main(String[] args) {
        int[][] matriz= new int[4][4];
        matriz=llenar_matriz(matriz);
        mostrar_matriz(matriz);
        int[][] matriz_traspuesta = new int[4][4];
        System.out.println("========================");
        matriz_traspuesta=llenar_traspuesta(matriz, matriz_traspuesta);
        mostrar_matriz(matriz_traspuesta);
    }
    public static int[][] llenar_matriz(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(Math.random() * 10);
            }
        }
        return matriz;
    }
    public static void mostrar_matriz(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    //La consigna no aclara si hay que hacer una nueva matriz, o solo mostrar la otra como traspuesta, así que opté por crear la nueva.
    public static int[][] llenar_traspuesta(int[][]matriz, int[][]matriz_traspuesta){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_traspuesta[i][j]=matriz[j][i];
            }
        }
        return matriz_traspuesta;
    }
}
