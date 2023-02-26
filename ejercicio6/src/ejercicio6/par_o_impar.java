package ejercicio6;
    import java.util.Scanner;
/*Crear un programa que dado un numero determine si es par o impar.*/
    public class par_o_impar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese un número entero: ");
        int numero = leer.nextInt();
        if (numero%2==0){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar");
          }
    }
    }
