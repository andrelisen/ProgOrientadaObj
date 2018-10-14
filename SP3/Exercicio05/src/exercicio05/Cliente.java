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
public class Cliente extends Pessoa {

    /**
     *
     */
    private int codigo;
    @Override
    public void imprimeDados(){
        System.out.println("Nome:"+nome);
        System.out.println("Nascimento:"+nascimento.dia+"/"+nascimento.mes+"/"+nascimento.ano);
        System.out.println("Código:"+codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    }
