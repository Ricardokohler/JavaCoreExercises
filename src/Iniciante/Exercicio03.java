package Iniciante;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-----------------\n\nPrograma calculo subtracao de produto.\n\nDigite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("\nDigite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("\nDigite o valor de C: ");
        double c = sc.nextDouble();
        System.out.print("\nDigite ovalor de D: ");
        double d = sc.nextDouble();
        double res = (a * b) - (c * d);
        System.out.println("\nResultado = " + res);
    }
    
}               