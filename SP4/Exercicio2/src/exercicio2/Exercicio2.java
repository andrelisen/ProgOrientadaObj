/*
 2) Faça um método que recebe um inteiro “n” por parâmetro e retorne uma referência para um vetor de
“n” posições de inteiros. Trate a exceção “NegativeArraySizeException”.
 */
package exercicio2;
import java.util.Scanner;
/**
 *
 * @author Andrelise
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetor[];
        System.out.println("Digite o número:");
        int x = in.nextInt();
       // vetor = new int [x];
       // System.out.println("Usuário, digite a referencia para o seu vetor:");
       vetor = VetorNegativo(x);
       
    }
    public static int[] VetorNegativo(int n) {
        int vet[] = null;
        try {
            vet = new int[n];
            System.out.println("Vetor criado!!");
        } catch (NegativeArraySizeException e) {
            System.err.println("Array inválido! Número negativo detectado");
            e.printStackTrace();
        }
        return vet;
    }
}
