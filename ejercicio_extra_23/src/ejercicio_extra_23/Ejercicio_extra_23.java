package ejercicio_extra_23;
    import java.util.Scanner;

//ejercicio al final 
//No lo hice con número aleatorios porque es estúpido. Agregué letras aleatorias
public class Ejercicio_extra_23 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String palabra = "";
        String[][] matriz = new String[20][20]; //Inicializar matriz para comprobar. Se puede hacer en un subproceso. 
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]="";
            }
        }
        int fila;
        int columna;
        for (int i = 0; i < 5; i++) {
            palabra=comprobar_palabra(leer);
            /*System.out.println(palabra);*/ //Esto estaba para comprobar la comprobación. 
            do{
            fila=(int)(Math.random()*20);
            columna=(int)(Math.random()*20); //para comprobar esto, agregué la columna 16 y 17 y agregué una palabra de 3 letras para observar qué arrojaba
            // System.out.println(fila + " | " + columna); //para comprobar qué filas y columnas arroja el random 
            // System.out.println(comprobar_lugar_vacio(matriz, palabra, fila, columna)); 
            }while(!comprobar_lugar_vacio(matriz, palabra, fila, columna)); //tiene que hacer esto hasta que encuentre un lugar vacío 
            
            matriz=colocar_palabra(matriz, palabra, fila, columna); //Después que encuentra el lugar vacío, coloca la palabra en la matriz.
            /*for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    System.out.print(matriz[j][k] + " | ");
                }
                System.out.println("");
                
            }*/ //Esto estaba en este lugar para comprobar si se llenaban bien los espacios 
        }
        matriz=llenar_vacios(matriz); //Esto llena los espacios vacíos con letras random 
        for (int j = 0; j < 20; j++) { //Muestra la matriz ya completa. Lo hice tantas veces que debería simplificarlo con un subproceso
                for (int k = 0; k < 20; k++) {
                    System.out.print(matriz[j][k] + " | ");
                }
                System.out.println("");
            }
    }
    public static String[][] llenar_vacios(String[][]m){ 
        String abc= "abcdefghijklmnopqrstuvwxyz"; //tardaba menos escribiendo el abcdario que pensando otra forma de obtener una letra random
        int num = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (m[i][j].equals("")) {
                    num=(int)(Math.random()*(abc.length())); //Así obtengo una posición de la cadena abc para agregarla en los espacios vacíos de la matriz. 
                    m[i][j]=abc.substring(num,num+1); 
                }
            }
        }
        return m;
    }
    
    public static String[][] colocar_palabra(String[][]m, String palabra, int f, int c){ //coloca la palabra en su lugar 
        for (int i = c; i < (c+palabra.length()); i++) {
            m[f][i]=palabra.substring((i-c),(i-c+1));
            //System.out.println(palabra.substring((i-c),(i-c+1))); //para comprobar que estan bien las letras que se ingresan.
        }
        
        return m;
    }
    public static boolean comprobar_lugar_vacio(String[][]m, String palabra, int f, int c){
        boolean vacio = false;
        int contador=0;
        if (palabra.length()+c<=19) { //es necesario primero este if para comprobar si entra la palabra en el espacio que queda entre la columna seleccionada y el último lugar
            for (int i = c; i < (c+palabra.length()); i++) { //compueba que los lugares estén vacíos
                if (m[f][i]=="") {
                contador=contador+1;
                }
            }
        }
        // System.out.println(palabra.length() + " " + contador); //comprobacion
        vacio = (contador==palabra.length()||palabra.length()+c<=19); 
        /*Si el contador tenía la misma longitud de la palabra significa que contó suficientes espacios vacíos para que entre
        sino arroja falso y otra vez busca un lugar. 
        La segunda comprobación suma la longitud de la palabra con la columna. Si la suma es mayor a 19 no entra porque 
        no hay casilleros suficientes desde la columna seleccionada al azar*/
        return vacio;
    }
    public static String comprobar_palabra(Scanner leer){ //Ingresa la palabra y compueba que tenga de 3 a 5 caracteres. 
        String palabra;
        do{
        System.out.println("Ingrese una palabra que contenga entre 3 y 5 letras: ");
        palabra = leer.nextLine();
            if (palabra.length() < 3 || palabra.length()> 5) {
                System.out.println("La palabra ingresada está fuera del rango");
                System.out.println("Inténtelo nuevamente: ");
            }
        }while(palabra.length() < 3 || palabra.length()> 5);
        return palabra;
    }
}
/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/