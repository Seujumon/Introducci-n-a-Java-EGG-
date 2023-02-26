package ejercicio2;
    import java.util.Scanner;

/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.  */ 
public class ingresar_nombre {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine(); 
        System.out.println(nombre);
        }
    }
