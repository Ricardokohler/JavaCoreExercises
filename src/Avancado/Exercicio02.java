package Avancado;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
        
      System.out.print("\n+-----------------------------------------------------+\n");
      System.out.print("|---------Programa para Calculo de quadrante----------|\n");
      System.out.print("+-----------------------------------------------------+\n\n");
        
      int x = 1;
      int y = 1;
      
      while(x != 0 && y != 0){
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x > 0 && y > 0){
          System.out.print("Quadrante 1\n");          
        } else if(x < 0 && y > 0){
          System.out.print("Quadrante 2\n");
        } else if(x < 0 && y < 0){
          System.out.print("Quadrante 3\n");
        }else if(x > 0 && y < 0){
          System.out.print("Quadrante 4\n");
        }
      }    
      sc.close();
    }
}