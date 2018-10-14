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
public abstract class Quadrado implements Formas {
    private int lado;
        public Quadrado(int valor)
        {
        lado = valor;
        }
        @Override
        public int area()
        {
            return lado * lado;
        }
        @Override
        public int perimetro()
        {
            return 4 * lado;
        }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + area()+perimetro()+ '}';
    }
        
}
