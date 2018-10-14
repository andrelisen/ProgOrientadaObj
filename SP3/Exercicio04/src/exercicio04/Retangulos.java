/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

/**
 *
 * @author Andrelise
 */
public abstract class Retangulos implements Formas{
    private int base;
    private int altura;
        public Retangulos(int base, int altura)
        {
            this.base = base;
            this.altura = altura;
        }
        @Override
         public int area()
        {
             return base * altura;       
        }

    @Override
    public String toString() {
        return "Retangulos{" + "base=" + base + ", altura=" + altura + area()+ '}';
    }
         
}
