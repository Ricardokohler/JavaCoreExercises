package Nivel02_Intermediario.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+---------------------------------------+");
        System.out.print("\n|------- Programa média de pares -------|");
        System.out.print("\n+---------------------------------------+\n\n");
        
        System.out.print("Quantos numeros serao digitados? ");
        int n = sc.nextInt();
        
        Double [] nums = new Double[n];
        Double avg = 0.0;
        
        for(int i=0; i<n; i++){
            System.out.print("\nDigite um numero: ");
            nums[i] = sc.nextDouble();
            if(nums[i]%2==0){
                avg += nums[i];
            }
        }
        
        if(avg == 0.0){
            System.out.print("\n\n>Nenhum numero par\n");
            sc.close();    
        } else{
        
           avg = avg / n;
           System.out.printf("\n>Media dos pares: %.1f\n", avg);
        }
        sc.close();
    }
}
