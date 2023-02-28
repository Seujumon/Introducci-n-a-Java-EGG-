package ejercicio16;
    import java.util.Scanner;
public class buscar_en_vector {
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
//Hice un subproceso para mostrar que me ayudó a controlar, y preferí dejarlo aunque no lo pide la consigna.    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector= new int[tamaño];
        vector=llenar_vector(vector,tamaño);
        mostrar_vector(vector, tamaño);
        buscar_numero(vector, tamaño);
    }
    public static int[] llenar_vector(int[] vector, int tamaño){
        for (int i = 0; i < tamaño; i++) {
            vector[i]= (int)(Math.random() * 10);
        }
        return vector;
    }
    public static void mostrar_vector(int[] vector, int tamaño){
        for (int i = 0; i < tamaño; i++) {
            System.out.print(" | " + vector[i] + " | ");
        }
        System.out.println("");
    }
    public static void buscar_numero(int[] vector, int tamaño){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número que desea buscar: "); 
        int numero = leer.nextInt();
        for (int i = 0; i < tamaño; i++) {
            if (vector[i]==numero){
                System.out.println("El número " + numero + " se encuentra en la posición " + i);
            } //recordar que la posición que muestra es según el vector que arranca en 0 (cero)
            //en caso de querer que muestre el lugar real, al final sería (i+1)<--no olvidar los paréntesis
        }
    }
}