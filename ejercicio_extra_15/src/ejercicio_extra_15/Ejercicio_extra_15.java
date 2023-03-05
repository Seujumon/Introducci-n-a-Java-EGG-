package ejercicio_extra_15;
    import java.util.Scanner;
/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/
public class Ejercicio_extra_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        System.out.println("Menú");
        System.out.println("====");
        System.out.println("Elija la operación que desea realizar");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        int operacion=leer.nextInt();
        int resultado;
        double resultado2;
        switch (operacion){
            case 1:
                System.out.println(suma(num1,num2));
                break;
            case 2:
                System.out.println(resta(num1,num2));
                break;
            case 3:
                System.out.println(multiplicacion(num1,num2));
                break;
            case 4:
                System.out.println(division(num1,num2));
                break;
            default:
                System.out.println("Error. No ingresó una opción válida.");
        }
    }
    public static int suma(int n1, int n2){
        int resultado = n1+n2;
        return resultado;
    }
    public static int resta(int n1, int n2){
        int resultado = n1-n2;
        return resultado;
    }
    public static int multiplicacion(int n1, int n2){
        int resultado = n1*n2;
        return resultado;
    }
    public static double division(int n1, int n2){
        double resultado = (double)(n1)/(double)(n2);
        return resultado;
    }
}