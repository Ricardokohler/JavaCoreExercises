/*               PROBLEMA "NUMEROS PARES":

Faça um programa que leia N números inteiros e armazene-os em um vetor.
Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.

*/

package Nivel05_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
        
        System.out.print("\nQuantos numeros serao digitados? ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        int pares = 0;
        
        System.out.println();
        for(int i =0; i<n; i++){
            System.out.print("\nDigite um numero: ");
            nums[i] = sc.nextInt();
        }
        
        System.out.print("\nPares:");
        
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                System.out.print("\n" + nums[i]);
                count += 1;
            }            
        }
        
        System.out.print("\n\n Quantidade de pares: " +count + "\n\n");
        
        
        
        
    sc.close();    
    }
}




