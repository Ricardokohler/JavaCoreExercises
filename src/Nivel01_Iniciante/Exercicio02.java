package Nivel01_Iniciante;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("+----------------------------------------------+\n");
        System.out.print("|   Programa para calculo de area de circulo   | \n");
        System.out.print("+----------------------------------------------+\n\n");
        
        Double raio = sc.nextDouble();
        Double area = 3.14159 * (Math.pow(raio, 2)); 
        
        System.out.printf("\n Area calculada: %.2f", area);
    }
    
}               