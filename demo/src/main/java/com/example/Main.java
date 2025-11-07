package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Atributos
        int n;
        int q;
        int bestP;
        int bestQ;
        boolean encontrado = false;
        // * Sello 7 centimos
        // * sello 4 centimos

        n = sc.nextInt();
        int minimo = n;
        while (sc.hasNext()) {

            if (sc.hasNextInt() && n <= 19) {
                // n = 7*p // + 4*q
                bestQ = 0;
                bestP = 0;
                for (int p = 0; p <= n / 7; p++) { // p = cantidad de sellos de 7 centimos
                    int remaind = n - 7 * p;

                    if (remaind % 4 == 0) {
                        q = remaind / 4;
                        if (p + q < minimo) {
                            bestP = p; // Renovamos valores
                            bestQ = q;
                            minimo = p + q;
                        }
                    }
                }
                System.out.println(bestP + " " + bestQ);
            } else {
                String token = sc.next();
                if (token.equals(".")) {
                    encontrado = true;
                }
            }
        }
        sc.close();
    }
}