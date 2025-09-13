package Nivel02_Intermediario;

import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+----------------------------------------------+\n");
        System.out.print("|----Programa para soma de Produtos por id-----|\n");
        System.out.print("+----------------------------------------------+\n\n");
        
        System.out.print("Digite o id do produto");
        int productId =  sc.nextInt();
        
        switch(productId){
            case 1:
                Double productPrice = 4.00;
                int quantity = sc.nextInt();
                System.out.printf("total: R$ %.2f reais", productPrice * quantity);
                break;
            case 2:
                productPrice = 4.50;
                quantity = sc.nextInt();
                System.out.printf("total: R$ %.2f reais", productPrice * quantity);
            break;
            case 3:
                productPrice = 5.0;
                quantity = sc.nextInt();
                System.out.printf("total: R$ %.2f reais", productPrice * quantity);
                break;
            case 4:
                productPrice = 2.0;
                quantity = sc.nextInt();
                System.out.printf("total: R$ %.2f reais", productPrice * quantity);
            break; 
            case 5:
                productPrice=1.5;           
                quantity = sc.nextInt();
                System.out.printf("total: R$ %.2f reais", productPrice * quantity);
            default:
                System.out.print("Codigo nao encontrado");
            break;
        }
        
        System.out.print("\nObrigado!\n");
        sc.close();    
    }
    
}
