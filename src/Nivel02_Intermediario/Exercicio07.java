package Intermediario;

import java.util.Scanner;

public class Exercicio07{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+------------------------------------------------+\n");
        System.out.print("|Programa para Calculo de intervalo de quadrante-|\n");
        System.out.print("+------------------------------------------------+\n\n");
        
        System.out.print("Digite o primeiro numero: ");
        Double x = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        Double y = sc.nextDouble();
        
        if(x > 0 && y > 0){
            System.out.print("\nQuadrante 1");
        } else if (x < 0 && y > 0){
            System.out.print("\nQuadrante 2");
        } else if(x < 0 && y < 0){
            System.out.print("\nQuadrante 3");
        } else if(x > 0 && y < 0){
            System.out.print("\nQuadrante 4");
        } else{
            System.out.print("\nOrigem!");
        }
        System.out.print("\nObrigado!\n");
        sc.close();    
    }
    
}
