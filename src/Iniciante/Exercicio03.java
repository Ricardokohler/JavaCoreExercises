package JavaCoreExercises.src.Iniciante;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-------\nPrograma calculo subtracao de produto:/nFormula ---> (A*B)-(C*D)");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double sub = a - b;
        System.out.println("subtracao = " + sub);
    }
    
}               