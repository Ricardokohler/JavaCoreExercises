package Intermediario;

import java.util.Scanner;

public class Exercicio08{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+-----------------------------------------------+\n");
        System.out.print("|Programa para Calculo de imposto-------------------|\n");
        System.out.print("+------------------------------------------------+\n\n");
        
        System.out.print("Digite o primeiro numero: ");
        Double a = sc.nextDouble();
        
        if(a >  2000){
            double subtotal = (a - 2000);
            
            subtotal += (subtotal * 0.08);
            
            double total = subtotal + 2000;
            System.out.print("Total: total");
            
        } else if( a > 3000){
            faixa2 = a - 3000;
            faixa1 = faixa2-2000;
            faixa2 +=  faixa2 * 0.18;
        
            faixa1 = 
        }
        
        System.out.print("\nObrigado!\n");
        sc.close();    
    }
    
}
