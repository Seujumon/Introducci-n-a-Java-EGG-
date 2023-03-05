package ejercicio_extra_11;
    import java.util.Scanner;
/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.*/
// Lo hice con recursividad y Long para que acpte números de más de 10 dígitos.

public class Ejercicio_extra_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        long numero=leer.nextLong();
        System.out.println(numero);
        System.out.println(dig(numero));
    }
    public static int dig(long n){
        int digitos=1;
        if (n>0){
            digitos=digitos+ dig(n/10);
        }else{
            digitos=0;
        }
        return digitos;
    }
}