package ejercicio_extra_14;
    import java.util.Scanner;
/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.*/
public class Ejercicio_extra_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias:");
        int familias = leer.nextInt();
        int hijos = 0;
        int cantidad = 0;
        int edad=0;
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la " + (i+1) + "º familia.");
            cantidad = leer.nextInt();
            hijos = hijos + cantidad;
            for (int j = 0; j < cantidad; j++) {
                System.out.println("Ingrese la edad del/de la " + (j+1) + "º hijo/a");
                edad =edad + leer.nextInt();
            }
        }
        double media = (double)(edad)/(double)(hijos);
        System.out.println(media);
    }
}