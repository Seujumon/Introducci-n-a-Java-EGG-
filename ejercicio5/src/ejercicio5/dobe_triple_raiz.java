package ejercicio5;
    import java.util.Scanner;
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
public class dobe_triple_raiz {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese un número: ");
        int numero = leer.nextInt(); 
        System.out.println("El doble de " + numero + " es " + (numero*2) );
        System.out.println("El triple de " + numero + " es " + (numero*3));
        System.out.println("La raíz cuadrada de " + numero + " es " + (Math.sqrt(numero)));
    }
    
}
