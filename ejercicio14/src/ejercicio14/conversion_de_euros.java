package ejercicio14;

    import java.util.Scanner;
public class conversion_de_euros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String moneda;
        System.out.println("Ingrese la cantidad de euros que desea convertir: ");
        double euros = leer.nextInt();
        System.out.println("Ingrese a qué moneda desea realizar la conversión: Libras' 'Dólares' 'Yenes'");
        moneda= leer.next();
        moneda= moneda.toLowerCase();
        convertir(euros, moneda);
    }
    public static void convertir(double euros, String moneda){
        if (moneda.equals("libras")){
            System.out.println("La cantidad ingresada equivale a " + (euros*0.85));
        } else if (moneda.equals("dólares")){
            System.out.println("La cantidad ingresada equivale a " + (euros*1.28611));
        } else if (moneda.equals("yenes")){
            System.out.println("La cantidad ingresada equivale a " + (euros*129.852));
        } else {
            System.out.println("El nombre de la moneda a la que desea convertir fue mal ingresado.");
        }
    }
    
}
/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/