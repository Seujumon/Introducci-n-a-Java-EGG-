package ejercicio10;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
public class hacer_mientras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        do{
            System.out.println("Ingrese un número positivo: ");
            int numero = leer.nextInt();
            suma = suma + numero;
        } while(suma<20);
        System.out.println("La suma de los números ingresados es " + suma);
    }
    
}