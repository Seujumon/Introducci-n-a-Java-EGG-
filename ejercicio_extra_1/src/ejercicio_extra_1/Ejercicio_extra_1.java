package ejercicio_extra_1;
    import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
public class Ejercicio_extra_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos: ");
        int minutos = leer.nextInt();
        int dias = Math.abs(minutos/1440);
        int horas = Math.abs((minutos%1440)/60);
        minutos = Math.abs(minutos%60);
        System.out.println("El valor ingresado equivale a " + dias + " días " + horas + " horas y " + minutos + " minutos.");
    }
}
