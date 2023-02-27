package ejercicio9;

import java.util.Scanner;
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/
public class subcadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase que comience con 'A': ");
        String frase = leer.nextLine();
        if (frase.substring(0,1).equals("A")){ //"equals" Devuelve un resultado lógico
            System.out.println("CORRECTO"); //Substring hay que usarlo con valor de inicio y final
        } else {
            System.out.println("INCORRECTO");
            }
    }
}
