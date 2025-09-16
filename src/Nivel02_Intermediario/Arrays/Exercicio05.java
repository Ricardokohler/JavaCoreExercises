

package Nivel02_Intermediario.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\nQuantos numeros serao digitados? ");
        int n = sc.nextInt();
        
        int [] nums = new int[n]; 
        int count = 0;
        int posit = 0;
        
        System.out.print("\nValores: \n");
        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            nums[i] = sc.nextInt();
            
            if(nums[i] > count){
                count = nums[i];
                posit = i;
            }
            
        }
        System.out.print("\nMaior valor: " + count + "\nPosiçao: " + posit +"\n");
        
        System.out.print("\nObrigado!\n");
        
        sc.close();
    }
}




