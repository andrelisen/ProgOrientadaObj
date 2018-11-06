
package arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        //ABRINDO um arquivo com caminho
        File f = new File("/home/andrelise/Área de Trabalho/poema");
        //O que eu posso fazer com o meu arquivo
        System.out.println(f.canRead()); //pode ler
        System.out.println(f.canWrite()); //pode escrever
        System.out.println(f.exists()); //pode sair
        System.out.println(f.isFile()); //é arquivo
        System.out.println(f.isDirectory()); //é diretório
        System.out.println(f.getName()); // obter o nome
        System.out.println(f.getPath()); // obter caminho
        System.out.println(f.length()); //comprimento
        System.out.println(f.lastModified()); //ultima modificação
        //Lendo arquivos de texto
        try
        {
        // Usa a classe Scanner para ler de um arquivo
             Scanner input = new Scanner(new File("poema"));
                while (input.hasNext()) {
                String linha = input.nextLine();
                System.out.println(linha);//imprime arquivo na tela
                }
            input.close(); // Fecha o arquivo
        }
        catch(FileNotFoundException e) 
        {
        // Precisa capturar ou informar esta exceção
            System.err.println("Arquivo não encontrado!");
        }
       //Gravar arquivo de texto 
        String []teste = new String[10];
        teste[0]="andrelise";
        teste[1]="22 de junho de 1999";
        teste[2]="bagé, rio grande do sul";
        try {
            /* Usa a classe Formatter para gravar
            texto formatado em um arquivo */
            Formatter output = new Formatter("lixo.txt"); //cria novo arq txt
            for(int i = 0; i < teste.length; i++)//escreve no arq
            {
            output.format("%s\n", teste[i]);//linha por linha
            output.close(); // Fecha o arquivo
             System.out.println("Arquivo escrito com sucesso!");
            }
          }
            catch(Exception e) {
            System.err.println("Exceção: " + e);
        }
 }   
}
