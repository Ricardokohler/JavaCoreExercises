package Nivel02_Intermediario.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+---------------------------------------+");
        System.out.print("\n|-------- Programa mais velho ----------|");
        System.out.print("\n+---------------------------------------+");
        
        System.out.print("\n\nQuantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        int older = 0;//contador a partir do indice
        
        
        int [] ages = new int[n];
        String [] names = new String [n];
        
        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.print("\nDados da "+(i+1)+"a pessoa:\nNome:");
            
            names[i] = sc.nextLine();
                
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            
            if(ages[i] > ages[older]){
                older = i;
            }
        }    
        
        System.out.print("\n\nPessoa mais velha: " + names[older]+ "\n");
        
        sc.close();
    }
}
