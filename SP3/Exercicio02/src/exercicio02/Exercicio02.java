/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author Andrelise
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingresso simples = new Ingresso();
        Vip areaVip = new Vip();
        camaroteInferior parteBaixa = new camaroteInferior();
        camaroteSuperior open = new camaroteSuperior();
        
        simples.setValor(30.98f);
        simples.imprimeValor();
        areaVip.setValoradicional(10.76f);
        areaVip.setValor(30.98f);
        areaVip.valorIngresso();
        parteBaixa.setLocalizacao(32);
        System.out.println(parteBaixa.getLocalizacao());
        System.out.println(open.valorIngresso());
        
    }
    
}
