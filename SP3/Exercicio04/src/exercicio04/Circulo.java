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
public abstract class Circulo implements Formas{
    private int raio;
        public Circulo(int raio)
        {
            this.raio = raio;
        }
        @Override
        public int area()
        {
            return 3 * raio;
        }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + area()+ '}';
    }
    
}
