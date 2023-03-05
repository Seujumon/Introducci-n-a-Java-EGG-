package ejercicio_extra_16;
    import java.util.Scanner;
/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
public class Ejercicio_extra_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] datos= new String[2];
        String respuesta = "Si";
        boolean freno = true;
        do{
            datos=personas(datos,leer);
            System.out.println("Si desea ingresar más datos escriba Si, de lo contrario escriba No: ");
            respuesta = leer.nextLine();
            freno=respuesta.equalsIgnoreCase("No");
        }while(!freno); //La variable freno está de más. El indicador de negación ! es el que ayuda a comparar por la negativa. 
    }
    public static String[] personas(String[]datos, Scanner leer){
        System.out.println("Ingrese el nombre de la persona "); 
        datos[0]= leer.nextLine();
        System.out.println("Ingrese la edad de " + datos[0]);
        datos[1]=leer.nextLine();
        if ((Integer.parseInt(datos[1]))>=18) {
            System.out.println(datos[0] + " tiene " + datos[1] + " y es mayor de edad");            
        } else {
            System.out.println(datos[0] + " tiene " + datos[1] + " y no es mayor de edad");
        }

        return datos; //este return es inutil, pero la consigna pedía que sea una función, y por lo que aprendimos antes la función debe retornar algo.
    }
}
