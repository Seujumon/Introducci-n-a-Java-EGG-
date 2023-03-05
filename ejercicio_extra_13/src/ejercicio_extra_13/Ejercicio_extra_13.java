package ejercicio_extra_13;
    import java.util.Scanner;
/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/
public class Ejercicio_extra_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        int tamano = leer.nextInt();
        for (int i = 1; i < tamano+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}