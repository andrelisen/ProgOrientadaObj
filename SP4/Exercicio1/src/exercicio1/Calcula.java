/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Andrelise
 */
public class Calcula {
        protected int x, y, z;
        
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
            public int divisao()
            {
            try{
                int z = x/y;        
               // System.out.println("Resultado="+z);
                return z;
            }
            catch(ArithmeticException e)
            {
              //  System.out.println("Erro de divisão");
                throw e;
            }
            }
}
