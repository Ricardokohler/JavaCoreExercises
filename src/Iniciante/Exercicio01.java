package Iniciante;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("----------------\nPrograma Soma: \n\nDigite um numero: ");
        Double a = sc.nextDouble();
        System.out.print("Digite outro numero: ");
        Double b = sc.nextDouble();
        Double soma = a + b;
        System.out.println("soma = " + soma);
    }
    
}               