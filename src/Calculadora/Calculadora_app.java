
package Calculadora;
import java.util.Scanner;
public class Calculadora_app {
       static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //creamos variables 

        int opcion, a, b;
        double version = 1.1;
        
        
        //asignamos valores a y b
        System.out.println("---Bienvenido a mi calculadora version: " + version +".---");
        a = leerEntero("Asigna un valor para a:");
        b = leerEntero("Asigna un valor para b:");
        
        
        //hacemos un menu
        do{
           System.out.println("\n===============================");
           System.out.println("---Bienvenido a mi calculadora version: " + version +".---");

           System.out.println("1. Asignar valor a");
           System.out.println("2. Asignar valor b");
           System.out.println("3. Sumar");
           System.out.println("4. Restar");
           System.out.println("5. Multiplicar");
           System.out.println("6. Dividir");
           System.out.println("7. Salir");

           opcion = leerEntero("Seleccione una opción: (Escriba un número)");
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
                 case 5:
                     Multiplicar(a, b);
                     break;
                 case 6:
                     Dividir(a, b);
                     break;
                    
                default:
                    if (opcion != 7) {
                        System.out.println("Error, opción no permitida, intente de nuevo.");
                    } else {
                        System.out.println("Excelente día.");
                    }
                    
            }       
        }while (opcion != 7);
        

       }
         
//hacemos metodos
    
        public static int leerEntero(String Mensaje){
        int numero = 0;
        boolean validador = false;
        
        while (!validador){
            System.out.println(Mensaje);
            try{
                numero = sc.nextInt();
                validador =true;
            }
            catch(Exception e){
                System.out.println("Error: Solo se permiten números enteros. Intente de Nuevo");
                sc.nextLine();
            }
        }
        return numero;
        }
  
    
    
       public static int AsignarVr(int x){

       x = leerEntero("Agrega un valor");
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

       public static void Multiplicar(int a, int b)
       {
           int rpta;
           rpta = a * b ;
           System.out.println("La Multiplicación entre " + a + " y " + b + " es: " + rpta);
       }

       public static void Dividir(int a, int b) {   
        if (b == 0) {
        System.out.println("Error: No se puede dividir entre cero.");
    }   else {
        double rpta = (double) a / b;
        System.out.println("La división entre " + a + " y " + b + " es: " + String.format("%.2f", rpta));
    }
}
       
}//Fin clase