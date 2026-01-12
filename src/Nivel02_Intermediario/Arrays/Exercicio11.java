package Nivel02_Intermediario.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-------------------------------------------+");
        System.out.print("\n|-------- Programa Altura/Genero -----------|");
        System.out.print("\n+-------------------------------------------+\n");
        System.out.print("\n\nQuantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        Integer maleCount = 0;
        Integer femCount =0;
        Double maxHeight = 0.0;
        Double minHeight = 100.0;
        Double femAvgHeight = 0.0;
        
        Double [] heights = new Double[n];
        
        for(int i=0; i < n; i++){
            System.out.print("\nAltura "+(i+1) +"ª pessoa: ");
            heights[i] = sc.nextDouble();
            System.out.print("Genero " +(i+1) + "ª pessoa: ");
            sc.nextLine();
            char res = sc.nextLine().charAt(0);
            
            if((res == 'M') || (res == 'm')){
                maleCount += 1;
            }
            
            if((res == 'F') || (res =='f')){
                femAvgHeight += heights[i];
                femCount += 1;
            }
            
            if(maxHeight < heights[i]){
                maxHeight = heights[i];
            }   
            
            if(minHeight > heights[i]){
                minHeight = heights[i];
            }
        }
        
        femAvgHeight = femAvgHeight / femCount;
        
        System.out.print("\nMenor altura:" + minHeight);
        System.out.print("\nMaior Altura: " + maxHeight);
        System.out.printf("\nMedia entre mulheres: %.2f", femAvgHeight);
        System.out.print("\nNumero de homens: " + maleCount);
        System.out.print("\nObrigado\n");
    }
}
