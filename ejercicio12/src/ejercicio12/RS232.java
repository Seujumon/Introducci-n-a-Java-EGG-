package ejercicio12;
//La consigna está al final del ejercicio
    import java.util.Scanner;

public class RS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        String cadena;
        cadena = null;
        int correcto = 0; 
        int incorrecto = 0;
        do{ 
        System.out.println("Ingrese una cadena de caracteres, que tenga como "
                + "máximo 5 caracteres, comience con X y termine con 0 ");
        System.out.println("Si desea terminar, ingrese '&&&&&'");
        cadena = leer.nextLine();
        if (cadena.equals("&&&&&")){
            break;
        } else if(cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("0") && cadena.length()==5){
            correcto= correcto +1;
        } else{
                incorrecto=incorrecto+1;
                }
        } while(!cadena.equals("&&&&&"));
        System.out.println("Correctos: " + correcto);
        System.out.println("Incorrectos: " + incorrecto);
    }
}
/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
