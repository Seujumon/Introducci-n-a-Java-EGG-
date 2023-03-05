package ejercicio_extra_22;
/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.*/
public class Ejercicio_extra_22 {
    public static void main(String[] args) {
        int[][] matriz= new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
           }
        }
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
                suma= suma+matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos es " + suma);    
    }
}