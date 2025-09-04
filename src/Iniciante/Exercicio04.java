package Iniciante;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------\n");
        System.out.print("Programa calculo de pagamento para funcionarios\n\nDigite o id do funcionario: ");
        int id = sc.nextInt();
        System.out.print("Valor por hora: ");
        double value = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        double hours = sc.nextDouble();
        
        double payment = value * hours;
        System.out.print("Pagamento do funcionario: " + payment);
        
        
        

    }
}
