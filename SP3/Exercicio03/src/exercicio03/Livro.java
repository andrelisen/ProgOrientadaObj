/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author Andrelise
 */
public class Livro extends Dominio{
    private String autor;
        public Livro(String nome, float preco, String autor)
        {
            super(nome, preco);
            this.autor = autor;
        }

    @Override
    public String toString() {
        return "Livro{" + "autor=" + autor + "Nome do livro:"+nome+"Preço="+preco+'}';
    }
        
}
