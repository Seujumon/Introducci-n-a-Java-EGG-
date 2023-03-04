package ejercicio_extra_8;

    import java.util.Scanner;

/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
public class Ejercicio_extra_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero = 0;
        int pares = 0;
        int impares = 0; 
        int positivos = 0;
                
        do {
            System.out.println("**Ingrese un número**");
            numero=leer.nextDouble();
            if (numero>=0){
                    if (numero%2==0){
                        pares=pares+1;
                    } else{
                        impares=impares+1;
                    }
                    positivos = positivos +1;
            }
        } while((numero%5)!=0);
        System.out.println("La cantidad total de números positivos es " + positivos);
        System.out.println("La cantidad de números pares es " + pares);
        System.out.println("La cantidad de números impares es " + impares);
    }
}