/*1) Faça um programa em Java que solicite dois números ao usuário e, em seguida, imprime o resultado da
divisão do primeiro pelo segundo. Trate a exceção “ArithmeticException”. Teste o método “getMessage”
e “printStackTrace” de “Exception” e observe o tipo de mensagem.*/
package exercicio1;
import java.util.Scanner;
/**
 *
 * @author Andrelise
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
            int x, y;
            Calcula var = new Calcula();
            System.out.println("Digite o primeiro numero");
            x = in.nextInt();
            var.setX(x);
            System.out.println("Digite o segundo numero");
            y = in.nextInt();
            var.setY(y);
           try{
                System.out.println("Resultado:"+ var.divisao());
           }
           catch(Exception e)
           {
               System.err.println("ERRO DE DIVISÃO:"+ e);
               System.out.println(e.getMessage());
               System.out.println(e.printStackTrace();//Perguntar o motivo de dar esse erro               
           }
    }
    
}
