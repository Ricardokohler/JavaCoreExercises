package Nivel01_Iniciante.Condicional;

import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+----------------------------------------------+\n");
        System.out.print("|----Programa calculo de tempo de jogo---------|\n");
        System.out.print("+----------------------------------------------+\n\n");
        
        System.out.print("Digite a hora inicial do jogo: ");
        Double start = sc.nextDouble();
        System.out.print("Digite a hora final do jogo: ");
        Double end = sc.nextDouble();
        
        if(start < end) {
            Double res = end - start;
            System.out.printf("Tempo de jogo = %.0f Horas\n", res);
        } else if(start > end){
            Double res = (24 - start) + end;    
            System.out.printf("Tempo de jogo = %.0f Horas\n", res);    
        } else {
            System.out.print("24 horas de jogo\n");
        }
        
        System.out.print("\nObrigado!\n");
        sc.close();
        
    }
}
