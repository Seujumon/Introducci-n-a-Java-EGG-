package ejercicio20;
    import java.util.Scanner;
/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
public class cuadrado_magico {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz=llenar_matriz(matriz);
        mostrar_matriz(matriz);
        cuadrado_magico(matriz);
    }
    public static int[][] llenar_matriz(int[][]matriz){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un número entre 1 y 9");
                    matriz[i][j]=leer.nextInt();
                    if (matriz[i][j]>9 || matriz[i][j]<1){
                        System.out.println("El número ingresado está fuera del rango de 1 a 9. Inténtelo nuevamente.");
                    } 
                } while(matriz[i][j]>9 || matriz[i][j]<1);
            }
        }
        return matriz;
   }
   public static void mostrar_matriz(int[][]matriz){
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.print(matriz[i][j]);
           }
           System.out.println("");
       }
   }
   public static void cuadrado_magico(int[][]matriz){
       int[]vector=new int[8];
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (i==j){
                   vector[6]=vector[6]+matriz[i][j];
               } //suma la diagonal 1
               if (i+j==2){
                   vector[7]=vector[7]+matriz[i][j];
               } //suma la diagonal 2
               vector[i]=vector[i]+matriz[i][j];//esto suma filas
               vector[j+3]=vector[j+3]+matriz[i][j]; //esto suma las columnas
           }
       }
       /*for (int i = 0; i < 8; i++) {
           System.out.print(vector[i] + " | ");
       }
       System.out.println("");*/ //Esto estaba para comprobar la suma dentro del vector. 
       int contador = 1;
       for (int i = 0; i < 7; i++) {
           if (vector[i]==vector[i+1]){
               contador=contador+1;
           } else {
               System.out.println("No es un cuadrado mágico");
               break;
           }
       }
       if (contador==8){
           System.out.println("Es un cuadrado mágico.");
       }
   }
    
}
