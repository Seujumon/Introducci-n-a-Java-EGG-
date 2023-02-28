package ejercicio15;
/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/
//No estaba seguro de la consigna, así que primero llené todo con números del 100 al 1 en las posiciones 0 a 99 del vector
public class cien_numeros {

    public static void main(String[] args) {
        int[] vector = new int[100];
        vector=llenar(vector);
        mostrar(vector);
    }
    public static int[] llenar(int vector[]){
        for (int i = 100; i > 0; i--) {
            vector[100-i]= i;
        }
        return vector;
    }
    public static void mostrar(int vector[]){
               
        for (int i = 0; i < 100; i++) {
            System.out.println(vector[i]);
        }
    }
}
