
package Calculadora;
import java.util.Scanner;
public class Calculadora_app {
       static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //creamos variables 

        int opcion, a, b;
        double version = 1.0;
        
        
        //asignamos valores a y b
        System.out.println("---Bienvenido a mi calculadora version: " + version +".---");
        System.out.println("Asigna un valor para a:");
        a = sc.nextInt();
        System.out.println("Asigna un valor para b:");
        b = sc.nextInt();
        
        
        //hacemos un menu
        do{

           System.out.println("---Bienvenido a mi calculadora version: " + version +".---");
           System.out.println("Seleccione una opción: (Escriba un número)");
           System.out.println("1. Asignar valor a");
           System.out.println("2. Asignar valor b");
           System.out.println("3. Sumar");
           System.out.println("4. Restar");
           System.out.println("5. Salir");
           opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    a = AsignarVr(a);
                    break;
                case 2:
                    b = AsignarVr(b);
                    break;  
                 case 3:
                    Sumar(a,b);
                    break;
                 case 4:
                    Restar(a,b);
                    break;
                    
                default:
                    System.out.println("Excelente día.");
            }       
        }while (opcion != 5);
        

       }
         
//hacemos metodos
       public static int AsignarVr(int x){
       System.out.println("Agrega un valor");
       x = sc.nextInt();
       return x;
       }

       public static void Sumar(int a, int b){
           int suma;
           suma = a +b ;
           System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
       }

       public static void Restar(int a, int b){
           int resta;
           resta = a - b ;
           System.out.println("La resta entre " + a + " y " + b + " es: " + resta);
       }
}
