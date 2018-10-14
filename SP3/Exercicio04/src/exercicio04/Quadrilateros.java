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
public abstract class Quadrilateros implements Formas{
        private int x;
        private int y;
        private int z; 
        private int w;
        public Quadrilateros(int x,int y,int z,int w)
        {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
        @Override
        public int perimetro()
        {
            return x+y+z+w;
        }

    @Override
    public String toString() {
        return "Quadrilateros{" + "x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + perimetro() +'}';
    }
        
}
