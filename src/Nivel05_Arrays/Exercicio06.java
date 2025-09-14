    /*               Problema "soma_vetores2"

Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.

    */
package Nivel05_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("\n+------------------------------------+");
        System.out.print("\n|------Programa soma de vetores------|");
        System.out.print("\n+------------------------------------+");
        
        System.out.print("\n\nQuantos numeros serao digitados? ");
        int n = sc.nextInt();
        
        int [] n1 = new int[n];
        int [] n2 = new int[n];
        int [] sum = new int[n];
        
        System.out.print("\nVetor #1 ");
        for(int i=0; i<n; i++){
            System.out.print("\nDigite um numero: ");
            n1[i] = sc.nextInt();
        }
        
        System.out.print("\nVetor #2: ");
        for (int i=0; i<n; i++){
            System.out.print("\nDigite um numero: ");
            n2[i] = sc.nextInt();    
        }
        
        for(int i =0; i<n; i++){
            System.out.print("\nSoma: " + (n1[i] + n2[i]));
        }
        
        System.out.print("\nObrigado! \n");
        sc.close();
    }
}




