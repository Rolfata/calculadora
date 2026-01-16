
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
           System.out.println("\n==========================================================");
           System.out.println("---Bienvenido a mi calculadora version: " + version +".---");

           System.out.println("1. Asignar valor a");
           System.out.println("2. Asignar valor b");
           System.out.println("3. Sumar");
           System.out.println("4. Restar");
           System.out.println("5. Multiplicar");
           System.out.println("6. Dividir");
           System.out.println("7. Potencia");
           System.out.println("8. Salir");

           opcion = leerEntero("Seleccione una opción: (Escriba un número)");
            switch (opcion) {
                case 1:
                    a = asignarVr(a);
                    break;
                case 2:
                    b = asignarVr(b);
                    break;  
                 case 3:
                    sumar(a,b);
                    break;
                 case 4:
                    restar(a,b);
                    break;
                 case 5:
                     multiplicar(a, b);
                     break;
                 case 6:
                     dividir(a, b);
                     break;
                 case 7:
                     System.out.println((potencia(a, b)));
                     break;
                default:
                    if (opcion != 8) {
                        System.out.println("Error, opción no permitida, intente de nuevo.");
                    } else {
                        System.out.println("Excelente día.");
                    }
                    
            }       
        }while (opcion != 8);
        

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
  
    
    
       public static int asignarVr(int x){

       x = leerEntero("Agrega un valor");
       return x;
       }

       public static void sumar(int a, int b){
           int suma;
           suma = a +b ;
           System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
       }

       public static void restar(int a, int b){
           int resta;
           resta = a - b ;
           System.out.println("La resta entre " + a + " y " + b + " es: " + resta);
       }

       public static void multiplicar(int a, int b)
       {
           int rpta;
           rpta = a * b ;
           System.out.println("La Multiplicación entre " + a + " y " + b + " es: " + rpta);
       }

       public static void dividir(int a, int b) {   
        if (b == 0) {
        System.out.println("Error: No se puede dividir entre cero.");
    }   else {
        double rpta = (double) a / b;
        System.out.println("La división entre " + a + " y " + b + " es: " + String.format("%.2f", rpta));
    }
}
       //creamos metodos raiz y potenciacion
       public static double potencia(int a, int b){
           double resultado=1;
           if (b < 0) {
             System.out.println("Error: la potencia no puede ser negativa.");
             return 0;
           }

           for (int i = 1; i<=b; i++) {
               resultado = resultado * a;
               
           }
           return resultado;
       }
       
}//Fin clase