package ejercicio3;
    import java.util.Scanner;
/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */ 
public class mayusculas_minusculas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("La frase en mayúsculas es la siguiente: ");
        System.out.println(frase.toUpperCase());
        System.out.println("La frase en minúsculas es la siguiente: ");
        System.out.println(frase.toLowerCase());
    }
}