package Nivel02_Intermediario;

import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n+----------------------------------------------+\n");
        System.out.print("|Programa para Calculo de intervalo entre numeros|\n");
        System.out.print("+------------------------------------------------+\n\n");
        
        System.out.print("Digite um numero: ");
        Double a = sc.nextDouble();
        
        if (a <= 25 ){
            System.out.print("Grupo 1");
        } else if (a > 25 && a <= 50) {
            System.out.print("Grupo 2");
        } else if (a > 50 && a <=75) {
            System.out.print("Grupo 3");
        }else if (a > 75 && a <= 100){
            System.out.print("Grupo 4");
        } else {
            System.out.print("Fora de intervalo");
        }
        
        System.out.print("\nObrigado!\n");
        sc.close();    
    }
    
}
