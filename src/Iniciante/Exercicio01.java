package Iniciante;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("+----------------------------------------------+\n");
        System.out.print("|          Programa Soma de inteiros           | \n");
        System.out.print("+----------------------------------------------+\n\n");
        
        System.out.print("Digite um numero: ");
        Double a = sc.nextDouble();
        System.out.print("Digite outro numero: ");
        Double b = sc.nextDouble();
        Double soma = a + b;
        System.out.printf("soma = %.2f", soma);
    }
    
}               