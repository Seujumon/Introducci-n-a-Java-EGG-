package ejercicio7;
    import java.util.Scanner;
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/
public class frase_identica_eureka {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese la frase eureka");
        String frase = leer.nextLine(); 
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}