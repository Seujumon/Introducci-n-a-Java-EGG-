/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
package ejercicio_extra_10;

    import java.util.Scanner;

public class Ejercicio_extra_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1=0;
        int num2=0;
        num1=aleatorio(num1);
        num2=aleatorio(num2);
        int multi = 0;
        String respuesta = "";
        /*System.out.println(num1 + " | " + num2 + " | " + num1*num2);*/ 
        //Esto estaba solo para comprobar el resultado
        do{
            System.out.println("Intente adivinar cual es el resulrado de "
                    + "la multiplicación de 2 números aleatorios entre 0 y 10");
            multi=leer.nextInt();
            if (multi!=(num1*num2)){
                System.out.println("Desea intentar adivinar nuevamente: (responda s o n)");
                respuesta=leer.next();
            } else{
                System.out.println("CORRECTO");
            }
        } while((respuesta.equalsIgnoreCase("s")) & (multi !=(num1*num2)));
    }
    public static int aleatorio(int n){
        n=(int)(Math.random()*10);
        return n;
    }
}