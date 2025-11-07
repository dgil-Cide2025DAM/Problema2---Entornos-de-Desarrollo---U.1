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
}