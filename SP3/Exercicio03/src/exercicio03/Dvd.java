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
public class Dvd extends Dominio{
    private float duracao;
        public Dvd(String nome, float preco, float duracao)
        {
            super(nome, preco);
            this.duracao = duracao;
        }

    @Override
    public String toString() {
        return "Dvd{" + "duracao=" + duracao +"Nome do filme:"+ nome+ "preço="+preco+'}';
    }
        
}
