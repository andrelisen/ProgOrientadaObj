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
public class Vip extends Ingresso{
    protected float valoradicional;
        public float valorIngresso()
        {
            return this.valor += valoradicional;
        }

    public float getValoradicional() {
        return valoradicional;
    }

    public void setValoradicional(float valoradicional) {
        this.valoradicional = valoradicional;
    }
        
}
