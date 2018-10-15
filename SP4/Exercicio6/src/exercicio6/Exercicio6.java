package exercicio6;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack stk = new Stack();
      //  stk.push(12L); stk.push(34567); stk.push(1.0F);
    int opc;
    do{
        System.out.println("0-Sair\t1-Inserir\t2-Retirar\nOpção:");
        opc = in.nextInt();
        switch(opc)
        {
            case 1: 
                try{
                    System.out.println("Digite o valor:");
                    float x = in.nextFloat();
                    stk.push(x);
                }
                catch(ArithmeticException e)
                {
                    System.err.println("Erro de argumento!!");
                }
                break;
            case 2:
               try {
                            System.out.println("Retirado:" + stk.pop());
                }
                 catch (Exception e) {
                System.err.println("Erro. Pilha vazia!!");
                }
                break;
        }
        
    }while(opc!=0);
     }
    
}
