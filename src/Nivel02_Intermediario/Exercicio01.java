package Nivel02_Intermediario;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+----------------------------------------------+\n");
        System.out.print("\n|----Programa para confirmacao de negativos----|\n");
        System.out.print("\n+----------------------------------------------+\n\n");
        
        System.out.print("Digite um numero: ");
        Double a = sc.nextDouble();
        
        if (a < 0){
            System.out.print("\nNegativo");
        } else if(a > 0){
            System.out.print("\nPositivo");
        } else {
            System.out.print("\nNumero nulo");
        }
        
        System.out.print("\nObrigado\n");
        sc.close();    
    }
}
