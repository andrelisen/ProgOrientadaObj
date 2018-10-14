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
public class Dominio {
    protected String nome;
    protected float preco;
        public Dominio(String nome, float preco)
        {
            this.nome = nome;
            this.preco = preco;
        }

    @Override
    public String toString() {
        return "Dominio{" + "nome=" + nome + ", preco=" + preco + '}';
    }
        
}
