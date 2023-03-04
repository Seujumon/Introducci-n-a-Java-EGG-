
package ejercicio_extra_9;

    import java.util.Scanner;

/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
public class Ejercicio_extra_9 {

    public static void main(String[] args) {
        System.out.println("Ingrese el dividendo: ");
        int dividendo = 0;
        dividendo = ingresar(dividendo);
        System.out.println("ingrese el divisor: ");
        int divisor =0;
        divisor = ingresar(divisor);
        restas_sucesivas(dividendo, divisor);
    }
    public static void restas_sucesivas(int n1, int n2){
        int cociente = 0;
        int residuo =n1; 
        do{
            if (residuo>=n2) {
                residuo = residuo-n2;
                cociente= cociente+1;
                            }
        }while(residuo>=n2);
        System.out.println(n1 + " / " + n2 + " es igual a " + cociente + " y su resto es " + residuo);
    }
    public static int ingresar(int numero){
        Scanner leer = new Scanner(System.in);
        do{
            numero = leer.nextInt();
            if (numero<2){
                System.out.println("El número es menor que 2. Ingrese un nuevo número");
            }
        }while(numero<2);
        
        return numero;
    }
}
