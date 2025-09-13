

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        System.out.print("+----------------------------------------------+\n");
        System.out.print("| Programa para calculo de preco de duas pecas | \n");
        System.out.print("+----------------------------------------------+\n\n");
        
        int cod1 = sc.nextInt();
        int quantity1 = sc.nextInt();
        double price1 = sc.nextDouble();
        
        
        int cod2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double price2 = sc.nextDouble();
        
        
        System.out.print("Valor a Pagar: " + ((price1 * quantity1) + (price2 * quantity2)));
        
    }
}
