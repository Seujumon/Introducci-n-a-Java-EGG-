package ejercicio_extra_21;
public class Ejercicio_extra_21 {
//el ejercicio está al final
    public static void main(String[] args) {
        cargar_notas();
    }
    public static void cargar_notas(){
        double[]vector = new double[10]; //este vector guarda el resultado de las notas 
        for (int i = 0; i < 10; i++) {
            vector[i]=notas();
            System.out.println(vector[i]); //no es necesario mostrar las notas, pero lo agregué para controlar
        }
        aprobados_desaprobados(vector);
    }
    public static void aprobados_desaprobados(double[]n){
        int aprobados = 0;
        int desaprobados = 0; 
        for (int i = 0; i < 10; i++) {
            if (n[i]>=7) {
                aprobados=aprobados+1;
            } else{
                desaprobados =desaprobados + 1;
            }
        }
        System.out.println("La cantidad de aprobados es " + aprobados);
        System.out.println("La cantidad de desaprobados es " + desaprobados);
    }
    public static double notas(){ //Lo lleno con números random para que no demore tanto, pero podría hacerlo manualmente con Scanner
        double suma = 0;
        double primertp=((int)(Math.random()*11))*0.10;
        double segundotp=((int)(Math.random()*11))*0.15;
        double primer_integrador=((int)(Math.random()*11))*0.25;
        double segundo_integrador=((int)(Math.random()*11))*0.50;
        suma=primertp + segundotp + primer_integrador + segundo_integrador;
        return suma;
    }
}

/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.*/
