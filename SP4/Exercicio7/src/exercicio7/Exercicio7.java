/*7) Faça um programa que crie uma fila de elementos do tipo inteiro usando a interface Queue e a classe
LinkedList. O programa deve exibir o seguinte menu:
1 – Inserir item no final da fila
2 – Retirar e mostrar item do início da fila
3 – Exibir todo o conteúdo da fila
4 - Sair
Digite sua opção: __
Trate todas as exceções que possam vir a ocorrer.*/;
package exercicio7;

import java.util.Scanner;
import java.util.LinkedList; 
import java.util.Queue; 
  
public class Exercicio7
{ 
  public static void main(String[] args) 
  { 
      Scanner in = new Scanner(System.in);
    Queue<Integer> q = new LinkedList<>(); 
    int opc;
  	do{
  	System.out.println("0-SAIR\t1-INSERIR\t2-RETIRAR\t3-IMPRIMIR\t\nOPÇÃO:");
  	opc = in.nextInt();
  		switch(opc)
  		{
  		case 1:
  		try
                { System.out.println("Digite o número");
  		int valor = in.nextInt();
  		q.add(valor);
                } catch(ArithmeticException e)
                {
                    System.err.println("Valor inserido está incorreto com o formato INT");
                }
  		break;
  		case 2:
  		 try{
                 int removido = q.remove(); 
  		 System.out.println("Valor removido:" + removido); 
                 }catch(Exception e)
                 {
                     System.err.println("Erro! Fila vazia");
                 }
                 break;
  		case 3:
  		    int quantidade = q.size();
                    for(int i = 0; i < quantidade; i++)
  		    {
  		    int head = q.remove(); //retira do inicio
                    q.add(head);//repõe no final
   		    System.out.println("Valor lido:" + head); 
   		    }
  		break;
  		}
  	}while(opc!=0);
  }
  }

