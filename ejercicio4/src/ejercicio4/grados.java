package ejercicio4;
    import java.util.Scanner;
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    public class grados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad de grados centígrados: ");
        double centigrados = leer.nextDouble();
        double fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println(fahrenheit);
    }
}