package ejercicio_extra_6;
    import java.util.Scanner;
/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/
public class Ejercicio_extra_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double suma1 = 0;
        double suma2= 0;
        int contador=0;
        double altura=0;
        System.out.println("Ingrese la altura de 5 personas(metros.centímetros) : ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la altura de la " + (i+1) + "º persona");
            altura = leer.nextDouble();
            suma1 = suma1+altura;
            if (altura<1.6){
                suma2= suma2 + altura;
                contador=contador+1;
            }
        }
        System.out.println("El promedio de estatura de las personas por debajo de 1.60 mts es " + (suma2/contador));
        System.out.println("El promedio de estatura general es " + (suma1/5));
    }
}