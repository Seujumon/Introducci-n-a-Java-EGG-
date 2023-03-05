package ejercicio_extra_20;
/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
public class Ejercicio_extra_20 {
    public static void main(String[] args) {
        int[] vector = new int[5];
        vector=llenar(vector);
        mostrar(vector);
    }
    public static int[] llenar(int[] n){
        for (int i = 0; i < 5; i++) {
            n[i]=(int)(Math.random()*10);
        }
        return n;
    }
    public static void mostrar(int[] n){
        for (int i = 0; i < 5; i++) {
            System.out.println("| " + n[i] + " |");
        }
    }
}