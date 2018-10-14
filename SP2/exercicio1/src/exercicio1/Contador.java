
package exercicio1;
//classe contador 
public class Contador {
    private int valor;
    //métodos públicos
    public void zerar()
    {
        valor=0;
    }
    public void incrementar()
    {
        valor=valor+1;
    }
    public void imprime(){
        System.out.println("Valor no elemento da classe é = "+ valor);
    }
}
