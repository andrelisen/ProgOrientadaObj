/*
 4) Faça um programa que recebe 4 argumentos da linha de comando e os imprime na tela. O programa
deve gerar uma exceção específica caso o número de argumentos esteja incorreto. A mensagem exibida,
neste caso, deve indicar a quantidade de argumentos passados e a quantidade correta.
 */
package exercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=0, y=0, z=0, w=0, cont = 0;
        System.out.println("DIgite os argumentos");  
        try{
                x = in.nextInt();
                cont++;
                y = in.nextInt();
                cont++;
                z = in.nextInt();
                cont++;
                w = in.nextInt();
                cont++;
            }
            catch(InputMismatchException e) //Exceção do tipo argumento incorreto = valor dig não corresponde ao que é solicitado
            {
                System.out.println("Erro de argumentos\n Foram inseridos"+cont+", porém são 4, Usuário");
            }
            System.out.println("Argumentos digitados="+x+";"+y+";"+z+";"+w);
    }
    
}
