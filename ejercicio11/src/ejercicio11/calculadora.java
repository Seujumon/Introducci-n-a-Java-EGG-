package ejercicio11;
//La consigna del ejercicio está al final. La resolución tiene retoques. 
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        String respuesta = "N";
        int num1= 0; 
        int num2= 0;
        double num3 =0;
        double num4 = 0;
        do{
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opción:");
        opcion = leer.nextInt();
        
        if (opcion < 5 && opcion > 0){
            System.out.println("Ingrese un número entero positivo: ");
            num1 = leer.nextInt();
            System.out.println("Ingrese un número entero positivo: ");
            num2 = leer.nextInt();
        }
        
        switch(opcion){
            case 1: 
                System.out.println("El resultado de la suma es " + (num1 + num2));
                
                break;
            case 2: 
                System.out.println("El resultado de la resta es " + (num1 - num2));
                break;
            case 3: 
                System.out.println("El resultado de la multiplicación es " + (num1*num2));
                break;
            case 4: 
                /*num3 = Double.valueOf(num1);
                num4 = Double.valueOf(num2);*/ //Una manera de convertir enteros a reales
                num3 = num1; 
                num4 = num2;    //otra forma de convertir enteros a reales
                System.out.println("El resultado de la división es " + (num3/num4));
                break;
            case 5: 
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                respuesta = leer.next();
                respuesta=respuesta.toUpperCase(); //Esto convierte la letra en mayúscula, para que salga sin importar si pone s o S.
                break;
            default: 
                System.out.println("El número ingresado no es una opción válida. ");
                        
        }
        } while(!respuesta.equals("S"));        //Con ese signo de exclamación al principio del equals compara si son diferentes
    }
}

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/