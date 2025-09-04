package Iniciante;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------\n\n");
        System.out.print("Programa calculo de area de CIRCULO\nDigite o raio: ");
        Double raio = sc.nextDouble();
        Double area = 3.14159*(Math.pow(raio, 2)); 
        
        System.out.println("\n Area calculada: " + area);
    }
    
}               