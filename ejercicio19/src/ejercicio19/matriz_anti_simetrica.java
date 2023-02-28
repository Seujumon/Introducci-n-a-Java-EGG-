package ejercicio19;
public class matriz_anti_simetrica {
    public static void main(String[] args) {
        int[][] matriz= new int[3][3];
        matriz=llenar_matriz(matriz);
        mostrar_matriz(matriz);
        int[][] matriz_traspuesta = new int[3][3];
        System.out.println("========================");
        matriz_traspuesta=llenar_traspuesta(matriz, matriz_traspuesta);
        mostrar_matriz(matriz_traspuesta);
        matriz_antisimetrica(matriz, matriz_traspuesta);
    }
    public static int[][] llenar_matriz(int[][] matriz){
        matriz[0][0]=0;
        matriz[0][1]=-2;
        matriz[0][2]=4;
        matriz[1][0]=2;
        matriz[1][1]=0;
        matriz[1][2]=2;
        matriz[2][0]=-4;
        matriz[2][1]=-2;
        matriz[2][2]=0;
        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(Math.random() * 10);
            }
        }*/  //Esto llena la matriz de números aleatorios. Lo dejo comentado en caso de querer hacer la prueba cuando no es anti simétrica
        return matriz;
    }
    public static void mostrar_matriz(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    //La consigna no aclara si hay que hacer una nueva matriz, o solo mostrar la otra como traspuesta, así que opté por crear la nueva.
    public static int[][] llenar_traspuesta(int[][]matriz, int[][]matriz_traspuesta){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_traspuesta[i][j]=matriz[j][i];
            }
        }
        return matriz_traspuesta;
    }
    public static void matriz_antisimetrica(int[][]matriz, int[][]matriz_traspuesta){
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz_traspuesta[i][j] *-1 == matriz[i][j]){
                    contador=contador+1;
                }
            }
        }
        if (contador == 9){
            System.out.println("Es una Matriz anti simétrica.");
        } else{
            System.out.println("No es una Matrix anti simétrica.");
        }
    }
}
