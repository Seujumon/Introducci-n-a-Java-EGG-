package ejercicio1;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

public class suma_de_enteros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: "); 
        int num2 = leer.nextInt(); 
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + (num1+num2)); 
    }
}
