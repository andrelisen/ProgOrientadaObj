//Implementar uma fila circular em Java 
package filacirc;
import java.util.Scanner;
public class Filacirc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos elementos deseja inserir?");
        int quantidade = in.nextInt();
        int opcao, fila[], tamanho = 0, comeco=0;
        fila = new int[quantidade];
       do{
           System.out.println("====Menu da fila circular====\n0-Sair\n1-Inserir\n2-Remover\n3-Imprimir");
           opcao =in.nextInt();
           switch(opcao)
           {
               case 1: 
                   System.out.println("Digite o elemento a ser inserido");
                   int elemento = in.nextInt();
                   tamanho ++;
                   fila = insere(fila, quantidade, tamanho, elemento, comeco);
                  break;        
               case 2:
                 fila = remove(fila, quantidade);
                 comeco++;
                 quantidade--;
                   break;
               case 3:
                   imprime(fila, quantidade);
                   break;
           }
       }while(opcao!=0);
    }
    public static int[] insere(int []vetor, int quantidade, int tam, int elemento, int comeco) //igual a função em C mas, é chamado método
    {
        Scanner in = new Scanner(System.in);
       int posicao;
               if(quantidade<tam)
               {
                   System.out.println("Impossível inserir o valor "+elemento+"\nFila está cheia, usuário");
                   return vetor;
               }
              posicao=(comeco+tam)%quantidade;
           //   System.out.println("valor da posição do elemento="+posicao);
              vetor[posicao]=elemento;
          return vetor;
    }
    public static void imprime(int vetor[], int quantidade)
    {
        for(int i=0; i<quantidade;i++)
        {
        System.out.println("Valor da posicao"+i+"é igual a = "+vetor[i]);
        }
    }
    public static int[] remove(int vetor[], int quantidade)
    {
        if(quantidade==0)
        {
            System.out.println("Está fila já está completamente vazia, usuário");
            return vetor;
        }
        else{
            int valor = vetor[0];
            int vetorAux[];
            vetorAux = new int [quantidade -1];
            for(int i=0;i<quantidade-1;i++)
            {
                vetorAux[i]=vetor[i+1];
            }
            System.out.println("Elemento removido foi igual a "+valor);
            return vetorAux;
        }
    }
}