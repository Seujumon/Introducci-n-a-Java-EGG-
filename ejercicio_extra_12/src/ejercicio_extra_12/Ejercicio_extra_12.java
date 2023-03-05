package ejercicio_extra_12;
//La consigna está al final
public class Ejercicio_extra_12 {
    public static void main(String[] args) {
        String letra ="3";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (letra.equals(String.valueOf(i))){
                        System.out.print(" E |");
                    } else {
                        System.out.print(" " + i + " |" );
                    }
                    if (letra.equals(String.valueOf(j))){
                        System.out.print(" E| ");
                    } else {
                        System.out.print(" " + j + "| ");
                    }
                    if (letra.equals(String.valueOf(k))){
                        System.out.print(" E");
                    } else {
                        System.out.print(" " + k + "");
                    }
                System.out.println("");    
                }
            }
        }
    }
}
/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/