package ejercicio_extra_18;
    import java.util.Scanner;
/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/
public class Ejercicio_extra_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número");
            vector[i]= leer.nextInt();
        }
        int suma=0;
        for (int i = 0; i < 5; i++) {
            suma = suma + vector[i];
        }
        System.out.println(suma);
    }
}