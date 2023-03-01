package ejercicio_extra_5;
    import java.util.Scanner;
//La consigna está al final del ejercicio.
public class Ejercicio_extra_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tipo de socio: 'A', 'B' o 'C'");
        char tipo = leer.next().toLowerCase().charAt(0);
        System.out.println("Ingrese el costo del tratamiento: ");
        double costo = leer.nextDouble();
        switch (tipo){
            case 'a':
                System.out.println("El costo del tratamiento es: $ " + (costo/2));
                break;
            case 'b':
                System.out.println("El costo del tratamiento es: $ " + (costo*0.65));
                break;
            case 'c':
                System.out.println("El costo del tratamiento es: $ " + costo);
                break;
            default:
                System.out.println("No se ingresó un tipo de socio válido.");
        }
    }
}
/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/
