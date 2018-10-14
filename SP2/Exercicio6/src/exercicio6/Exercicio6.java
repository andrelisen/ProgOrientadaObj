
package exercicio6;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Acionista num1 = new Acionista();
            Scanner in = new Scanner(System.in);
                System.out.println("Nome");
                String nome = in.nextLine();
                System.out.println("Numero de cotas");
                int numCotas = in.nextInt();
                System.out.println("Valor da cota");
                int valorCota = in.nextInt();
                    num1.setCliente(nome);
                    num1.setValorCota(valorCota);
                    num1.setNumeroCotas(numCotas);
                    num1.toString();
    }
    
}
