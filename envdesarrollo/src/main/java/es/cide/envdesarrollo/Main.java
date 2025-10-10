package es.cide.envdesarrollo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // EJERCICIO 1
        Scanner sc = new Scanner(System.in);
    
        // Para comparar, utilizamos a.convertTo(b)  < 0; -> el converTo()
        String a, b;
        /*  -> Asi los habia declarado antes, pero tenia que recpilar esos datos de la terminal.
        String a = "anna";
        String b = "xavier";
        
        String a, b = sc.next();
        */
        a = sc.next();
        b = sc.next();

        if (a.compareTo(b) < 0) {
            System.out.println(a + " < " + b);
        }

        else if (a.compareTo(b) > 0) {
            System.out.println(a + " > " + b);
        };

        else System.out.println(a + " = " + b);

        sc.close();
        

        
    }
    // EJERCICIO 2
    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);

        double sumar = 2.0;
        double restar = 3.5;
        double inversion = 1.4;
        double parar = 4.9;

        while ()
    }
}