package ejercicio_extra_2;
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
public class Ejercicio_extra_2 {

    public static void main(String[] args) {
        int A=2;
        int B=3;
        int C=4;
        int D=5;
        int aux=0;
        System.out.println("A:" + A + " B: " + B + " C: " + C + " D: " + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("A:" + A + " B: " + B + " C: " + C + " D: " + D);
    }
}