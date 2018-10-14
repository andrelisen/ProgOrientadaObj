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
public class camaroteSuperior extends Vip {
     @Override
    public float valorIngresso()
        {
            return this.valor += this.valoradicional;
        }
}
