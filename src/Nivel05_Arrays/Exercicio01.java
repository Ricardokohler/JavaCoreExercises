package Nivel05_Arrays;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("+-----------------------------------------------+");
        System.out.print("|------Programa para impressao de impares-------|");
        System.out.print("+-----------------------------------------------+");
        System.out.print("\nQuantos numeros serão digitados? ");

        int n = sc.nextInt();
        System.out.println();
        int [] nums = new int [n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            nums[i] = sc.nextInt();
        }

        System.out.print("\nNumeros negativos: \n");

        for(int i=0; i<n; i++){
            if(nums[i] < 0 ){
                System.out.print(nums[i] + "\n");
            }
        }

        System.out.print("\n\nObrigado\n");

        sc.close();
    }
}
