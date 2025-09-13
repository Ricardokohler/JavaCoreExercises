package Nivel02_Intermediario;

import java.util.Scanner;

public class Exercicio03{
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+----------------------------------------------+\n");
        System.out.print("|----Programa para confirmacao de Multiplos----|\n");
        System.out.print("+----------------------------------------------+\n\n");
        
        
        System.out.print("Digite um numero: ");
        Double a = sc.nextDouble();
        
        System.out.print("Digite outro numero: ");
        Double b = sc.nextDouble();
        
        if (a % b == 0){
            System.out.print("\nMultiplos");
        } else if(b % a == 0){
            System.out.print("\nMultiplos");
        } else {
            System.out.print("\nNao sao multiplos");
        }
        
        System.out.print("\nObrigado!\n");
        sc.close();     
    }
}
