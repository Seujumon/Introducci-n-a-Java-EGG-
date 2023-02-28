package ejercicio17;
    import java.util.Scanner;
/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
public class separar_por_digitos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector= new int[tamaño];
        vector=llenar_vector(vector,tamaño);
        mostrar_vector(vector, tamaño);
        contar_vector(vector, tamaño);
    }
    public static int[] llenar_vector(int[] vector, int tamaño){
        for (int i = 0; i < tamaño; i++) {
            vector[i]= (int)(Math.random() * 100000);
        }
        return vector;
    }
    public static void mostrar_vector(int[] vector, int tamaño){
        for (int i = 0; i < tamaño; i++) {
            System.out.print(" | " + vector[i] + " | ");
        }
        System.out.println("");
    }
    public static void contar_vector(int[]vector,int tamaño){
        int[] vector2=new int[5];
        for (int i = 0; i < tamaño; i++) {
            if (vector[i]>=10000){
                vector2[4]=vector2[4]+1;
            } else if(vector[i]<10000 && vector[i]>=1000){
                vector2[3]=vector2[3]+1;
            } else if(vector[i]<1000 && vector[i]>=100){
                vector2[2]=vector2[2]+1;
            } else if(vector[i]<100 && vector[i]>=10){
                vector2[1]=vector2[1]+1;
            } else if(vector[i]<10){
                vector[0]=vector[0]+1;
            }            
        }
        System.out.println("Los números de 1 cifra son " + vector2[0]);
        System.out.println("Los números de 2 cifras son " + vector2[1]);
        System.out.println("Los números de 3 cifras son " + vector2[2]);
        System.out.println("Los números de 4 cifras son " + vector2[3]);
        System.out.println("Los números de 5 cifras son " + vector2[4]);
    }
}