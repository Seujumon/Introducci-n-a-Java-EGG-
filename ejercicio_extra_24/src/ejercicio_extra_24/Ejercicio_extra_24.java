package ejercicio_extra_24;
    import java.util.Scanner;
/*Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci.*/
public class Ejercicio_extra_24 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = leer.nextInt();
        int[] vector = new int[numero];
        vector=completar(vector, numero);
        mostrar(vector, numero);
    }

    public static int[] completar(int[]vector, int n){
        int anterior = 1;
        int posterior= 1;
        int suma=0;
        for (int i = 0; i < n; i++) {
            vector[i]= anterior;
            suma=anterior+posterior;
            anterior=posterior;
            posterior=suma;
        }
        return vector;
    }

    public static void mostrar(int[]vector, int n){
         for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " | ");
        }
    }
}