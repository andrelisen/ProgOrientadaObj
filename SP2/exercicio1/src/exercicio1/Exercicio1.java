
package exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Contador numero = new Contador(); //não esquecer de inicializar
            int escolha;
            do{
            System.out.println("0-Encerrar programa\t1-Zerar\t2-Incrementar\t3-Mostrar");
             escolha = in.nextInt();
                switch(escolha)
                {
                    case 1:
                           numero.zerar();
                           System.out.println("Classe zerada com sucesso");
                           break;
                    case 2:
                           numero.incrementar();
                           System.out.println("Classe incrementada");
                           break;
                    case 3:
                           numero.imprime();
                           break;
                }
        }while(escolha!=0);       
    }
}
