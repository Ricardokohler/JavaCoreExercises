package Nivel02_Intermediario;

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+-------------------------------------+");
        System.out.print("\n|-Calculo Confirmarcao de Par e impar-|");
        System.out.print("\n+-------------------------------------+");
        
        System.out.print("\n\nDigite um numero: ");
        int i = sc.nextInt();
        
        if(i % 2 ==0){
            System.out.print("numero par");
        } else {
            System.out.print("numero impar");
        }
        
        System.out.print("\nObridado!\n");
        sc.close();
    }
}
