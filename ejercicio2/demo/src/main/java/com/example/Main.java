package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op; // Operacion
        double a, b; // numeros

        while (true) {
            System.out.println("¿Que quieres hacer? (solo en minusculas)");
            System.out.println("""
            MENU
            suma
            resta
            inversion
            salir
            """);
            // Leer Op
            op = sc.next();
            if (op.equals("suma")) {
                System.out.println("Escribe el primer numero:");
                a = sc.nextDouble();
                System.out.println("Escribe el segundo numero:");
                b = sc.nextDouble();
                System.out.println(a + b);
            } else if (op.equals("resta")) {
                System.out.println("Escribe el primer numero.");
                a = sc.nextDouble();
                System.out.println("Escribe el segundo numero.");
                b = sc.nextDouble();
                System.out.println(a - b);
            } else if (op.equals("inversion")) {
                System.out.println("Escribe el numero a invertir:");
                a = sc.nextDouble();
                a = -a;
                System.out.println(a);
            } else if (op.equals("salir")) {
                System.out.println("Has salido con exito!");
                break;
            }
        }
    }
}
