package Nivel01_Iniciante.Sequencial;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("+--------------------------------------------------+\n");
        System.out.print("| Programa para calculo de diferenca entre produto | \n");
        System.out.print("+--------------------------------------------------+\n\n");
        
        System.out.print("Digite o valor de A");
        double a = sc.nextDouble();
        System.out.print("\nDigite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("\nDigite o valor de C: ");
        double c = sc.nextDouble();
        System.out.print("\nDigite ovalor de D: ");
        double d = sc.nextDouble();
        double res = (a * b) - (c * d);
        System.out.printf("\nResultado = %.2f", res);
    }
    
}               