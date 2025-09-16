/*
    Programa- Media de Idades

Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.

Depois, mostrar na tela a altura média das pessoas,
e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.

*/

package Nivel02_Intermediario.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao cadastradas? ");
        int n = sc.nextInt();
        
        String [] names = new String [n];
        Double [] heights = new Double[n];
        Double [] ages = new Double[n];
        
        Double sum = 0.0;
        Double calc = 0.0;
        
        for (int i=0; i<=n; i++){
            System.out.print("Cliente #" + (i+1) + ": ");
            
            System.out.print("\nNome: ");
            names [i] = sc.nextLine();
            System.out.print("\nIdade: ");
            ages[i] = sc.nextDouble();
            System.out.print("\nAltura: ");
            heights[i] = sc.nextDouble();
            
            sum += heights[i];
            
            if(heights[i] > 16){
                calc += 1;
            }
        }   
                
        Double avg = sum / n;
        Double porc = (calc/n) * 100;
        System.out.print("----------------------\n\nMedia de altura: " + avg 
                        + "\nPorcentagem de menos de 16 anos: " + porc + "\n");
        for(int i=0; i<n; i++){
            if(ages[i] < 16){
                System.out.print("\n" + names[i]);
            }
        }
        
    sc.close();  
        
    }
}
