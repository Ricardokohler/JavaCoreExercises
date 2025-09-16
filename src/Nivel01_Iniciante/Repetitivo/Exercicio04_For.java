package Nivel01_Iniciante.Repetitivo;


import java.util.Scanner;

public class Exercicio04_For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-----------------------------------------------------------------------+");
        System.out.print("\n|--------------Programa para impressao in e out (entre 10 e 20)---------|");
        System.out.print("\n+-----------------------------------------------------------------------+\n");

        //entre 10 e 20
        System.out.print("\nQuantos valores serão digitados? ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite o valor #" + (i+1) + ": ");
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in ++ ;
            } else{
                out ++ ;
            }
        }

        System.out.print("\nin: " + in + "\nout: "+ out );

        System.out.print("\n\nObrigado!\n");

        sc.close();
    }
}
