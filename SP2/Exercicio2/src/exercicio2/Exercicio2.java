
package exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ponto2D ponto = new Ponto2D();
        int opcao;
        double x, y;
        String nome;
        do{
            System.out.print("1-Novo ponto\t2-Movimentar ponto\t3-Imprimir\nOpcão=");
            opcao = in.nextInt();
            switch(opcao)
            {
            case 1:
            System.out.println("Crie um ponto\n-------");
            System.out.println("Para isso insira as seguintes informações:");
            System.out.println("Ponto da abcissa");
             x = in.nextDouble();
             ponto.setAbcissa(x);
            System.out.println("Ponto da ordenada");
             y = in.nextDouble();
            ponto.setOrdenada(y);
                    in.nextLine();
            System.out.println("Insira um nome para o ponto ");
             nome = in.nextLine();
             ponto.setNome(nome);
            break;
            case 2:
                    System.out.println("Ponto da abcissa");
                     x = in.nextDouble();
                    System.out.println("Ponto da ordenada");
                     y = in.nextDouble();
                     ponto.movimenta(x, y);
                    break;
            case 3:
                   System.out.println(ponto.representacao()+"\n");
            }
            }while(opcao!=0);
        
    }
    
}
