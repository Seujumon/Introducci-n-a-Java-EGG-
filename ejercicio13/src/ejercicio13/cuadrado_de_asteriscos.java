package ejercicio13;
//La consigna está al final
import java.util.Scanner;

public class cuadrado_de_asteriscos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño del cuadrado: "); 
        int cuadrado = leer.nextInt(); 
        for (int i = 0; i < cuadrado; i++) {
            for (int j = 0; j < cuadrado; j++) {
                if (i==0 || i==(cuadrado-1) || j==0 || j==(cuadrado-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*
*
*
*
* * * **/
