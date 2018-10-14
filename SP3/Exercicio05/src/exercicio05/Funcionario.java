/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

/**
 *
 * @author Andrelise
 */
public class Funcionario extends Pessoa {
    protected float salario;
    @Override
    public void imprimeDados() {
        System.out.println("Nome:"+nome);
        System.out.println("Nascimento:"+nascimento.dia+"/"+nascimento.mes+"/"+nascimento.ano);
        
    }
    public float calculaImposto(){
      return (float) (salario * 0.03/100);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
