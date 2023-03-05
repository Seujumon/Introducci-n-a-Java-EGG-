package ejercicio_extra_19;
    /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
    comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
    elementos).*/
public class Ejercicio_extra_19 {
    public static void main(String[] args) {
        int[] vector1=new int[5];
        int[] vector2= new int[5];
        vector1=llenar_vector(vector1);
        vector2=llenar_vector(vector2);
        mostrar_vector(vector1);
        mostrar_vector(vector2);
        boolean comparacion=true;
        for (int i = 0; i < 5; i++) {
            if (vector1[i]==vector2[i]) {
                comparacion=true;
                /*System.out.println(i);*/ //Esto estaba para ver si cortaba en cuanto encontraba un diferente
            } else{
                comparacion=false;
                break; //Esto lo corta en cuanto encuentra una comparación diferente
            }
        }
        if(comparacion){
            System.out.println("Son iguales");
        } else{
            System.out.println("Son diferentes");
        }
    }
    public static int[] llenar_vector(int[] n){
        for (int i = 0; i < 5; i++) {
            n[i]=(int)(Math.random()*2); //Lo hice con números de 0 -1 para obtener comparaciones que den correcto, pero se puede cambiar.
        }
        return n;
    }
    public static void mostrar_vector(int[] n){
        for (int i = 0; i < 5; i++) {
            System.out.print(n[i]);
        }
        System.out.println("");
    }
}