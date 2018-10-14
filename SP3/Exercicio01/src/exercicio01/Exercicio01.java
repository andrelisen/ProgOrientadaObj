/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Andrelise
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa people = new Pessoa();
        Rica r = new Rica();
        Pobre p = new Pobre();
        Miseravel m = new Miseravel();
        
        people.setIdade(10);
        people.setNome("Juca");
        System.out.println(people.toString());
        
        r.setNome("Ana");
        r.setIdade(50);
        r.fazCompras();
        System.out.println(r.toString());
        
        p.setIdade(56);
        p.setNome("Zeca");
        p.trabalha();
        System.out.println(p.toString());
        
        m.setNome("Valdirene");
        m.setIdade(28);
        m.mendiga();
        System.out.println(m.toString());
        
    }
    
}
