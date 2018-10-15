/*
8) Utilizando métodos, classes e interfaces do framework de coleções do Java,
faça um programa que crie um vetor com um bilhão números de inteiros e preencha o 
mesmo com números aleatórios entre 0 e um bilhão. Em seguida ordene o vetor utilizando 
o método sort da classe Arrays. Por último peça para o usuário digitar um número e busque 
o mesmo no vetor utilizando busca binária. Informe a posição da primeira ocorrência do número 
ou a mensagem "não encontrado" se o mesmo não for encontrado.
 */
package exercicio8;
import java.util.Random;
import java.util.Arrays;

public class Exercicio8 {
    public static void main(String[] args) {
     Random gerador = new Random();
     int arr[] = new int[100000000]; //não consegui inserir 1 bilhao = erro no espaço da heap
     for(int i = 0; i<100000000; i++)
     {
         arr[i]=gerador.nextInt(100000000);
     }
        System.out.println("Antes da ordenação!!");
        for(int i = 0; i<100000000; i++)
         {
         System.out.println("Valor de = "+arr[i]+"\t");
        }
        System.out.println("Depois da ordenação!!");
        Arrays.sort(arr);
        for(int i = 0; i<100000000; i++)
         {
             System.out.println("Valor de = "+arr[i]+"\t");
      }
    }
}
