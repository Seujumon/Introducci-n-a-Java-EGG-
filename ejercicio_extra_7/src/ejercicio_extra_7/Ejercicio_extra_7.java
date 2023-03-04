package ejercicio_extra_7;
    import java.util.Scanner;
/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/

public class Ejercicio_extra_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué cantidad de números desea ingresar?");
        int numeros = leer.nextInt();
        /*mientras(numeros,leer);*/ //Con while
        hacer_mientras(numeros,leer); //Con do-> while
    }
    public static void hacer_mientras(int n, Scanner leer){
        int contador = 0;
        int numero =0;
        int maximo =0; 
        int minimo =0;
        double suma=0;
        do {
            contador=contador+1;
            do {
            System.out.println("Ingrese el " + contador + "ª número");
            numero = leer.nextInt();
            if (numero<0){
                System.out.println("El número ingresado es menor a 0. Por favor ingrese otro número. ");
            }
            }while(numero<0);
                suma = suma + numero; 
                if (maximo<numero) {
                    maximo=numero;
                }
                if (minimo==0) {
                    minimo=numero;
                }
                if (minimo>numero) {
                    minimo=numero;
                }
                
        }while (contador<n);
        double promedio = suma/n;
        System.out.println("El valor mínimo ingresado es " + minimo);
        System.out.println("El valor máximo ingresado es " + maximo);
        System.out.println("El promedio de los valores ingresados es " + promedio);
    }
    public static void mientras(int n, Scanner leer){
        int contador = 0;
        int numero =0;
        int maximo =0; 
        int minimo =0;
        double suma=0;
        while (contador<n){
            contador=contador+1;
            do {
            System.out.println("Ingrese el " + contador + "ª número");
            numero = leer.nextInt();
            if (numero<0){
                System.out.println("El número ingresado es menor a 0. Por favor ingrese otro número. ");
            }
            }while(numero<0);
            suma = suma + numero; 
            if (maximo<numero) {
                maximo=numero;
            }
            if (minimo==0) {
                minimo=numero;
            }
            if (minimo>numero) {
                minimo=numero;
            }
        }
        double promedio = suma/n;
        System.out.println("El valor mínimo ingresado es " + minimo);
        System.out.println("El valor máximo ingresado es " + maximo);
        System.out.println("El promedio de los valores ingresados es " + promedio);
    }
}