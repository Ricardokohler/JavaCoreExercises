package Nivel02_Intermediario.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+---------------------------------------+");
        System.out.print("\n|-------- Programa aprovados -----------|");
        System.out.print("\n+---------------------------------------+\n");
        //media 6, duas provas
        
        System.out.print("\nQuantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        String [] names = new String[n];
        Double [] notes1 = new Double[n];
        Double [] notes2 = new Double[n];
        
        for(int i=0; i<n; i++){
            System.out.print("\nDados do " + (i+1) + "° aluno: \nNome: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            
            
            System.out.print("Nota da primeira prova: ");
            notes1[i] = sc.nextDouble();
            System.out.print("Nota da segunda prova: ");
            notes2[i] = sc.nextDouble();
        }
        
        System.out.print("\n\nAprovados: \n");
        
        for(int i=0; i<n; i++){
            if(((notes1[i] + notes2[i]) / 2)  >= 6){
                System.out.print(names[i] + "\n");
            }
        }
        
        System.out.print("\nObrigado!\n");
        sc.close();
    }
}
