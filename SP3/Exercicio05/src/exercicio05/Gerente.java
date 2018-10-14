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
public class Gerente extends Funcionario{
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public float calculaImposto(){
      return (float) (salario * 0.05/100);
    }    
    @Override
    public void imprimeDados(){
        System.out.println("Nome:"+nome);
        System.out.println("Nascimento:"+nascimento.dia+"/"+nascimento.mes+"/"+nascimento.ano);
        System.out.println("Area:"+area);
        System.out.println("Salario:"+salario);
    }

}
