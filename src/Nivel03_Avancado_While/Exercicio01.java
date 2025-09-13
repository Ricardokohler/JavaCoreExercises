package Nivel03_Avancado_While;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+---------------------------------------------------+\n");
        System.out.print("|---------Programa para Validacao de senha----------|\n");
        System.out.print("+---------------------------------------------------+\n\n");
        
        int a = sc.nextInt();
        while(a !=  2002){
          a = sc.nextInt();
        }
        
        sc.close();
    }    
    
}