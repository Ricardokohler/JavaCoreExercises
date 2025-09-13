package Nivel03_Avancado.For;


import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-------------------------------------------------------------------------+");
        System.out.print("\n|--------Programa para calculo de media ponterada ---> (Peso Fixo) -------|");
        System.out.print("\n+-------------------------------------------------------------------------+");

        System.out.print("\n\nQuantas medias serao feitas? ");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){
            System.out.print("\nValores calculo #" + (i+1) + ": ");
            System.out.print("\nValores: \n#1: ");

            Double n1 = sc.nextDouble();
            System.out.print("#2: ");
            Double n2 = sc.nextDouble();
            System.out.print("#3: ");
            Double n3 = sc.nextDouble();

            Double mp = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
            System.out.printf("Media ponderada: %.1f \n", mp);
        }


        System.out.print("\nObrigado!");
        sc.close();
    }
}
