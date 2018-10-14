
package exercicio3;
import java.math.*;

public class Circulo {
        private double x;//ponto
        private double y;//ponto
        private double raio;
        //métododos

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaio() {
        return raio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void inflar()
    {
        raio = raio+1;
    }
            
    public void desinflar()
    {
        raio = raio-1;
    }
    
    public void mover(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    
    public double area()
    {
        return raio * Math.PI;
    }
}
