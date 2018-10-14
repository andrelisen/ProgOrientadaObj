/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;
import java.util.Random;
/**
 *
 * @author Andrelise
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        // TODO code application logic here
      //  Dominio []dom = new Dominio[5]; //posso fazer isso depois inicializar o construtor de cada objeto
        Livro []book = new Livro[5];
        Dvd []filme = new Dvd[5];
        
        for(int i=0;i<5;i++)
        {
            book[i] = new Livro("A bela e a fera", 55.50f, "John");//(String nome, float preco, String autor)
            filme[i] = new Dvd("Planeta dos macacos", 67.99f, 1.56f );
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(book[i].toString()); 
            System.out.println(filme[i].toString()); 
        }
    }
    
}
