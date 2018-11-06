
package manipulacaothreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/*START:inicia o método run
RUN: executa a tarefa da thread
SLEEP:coloca a thread para dormir por alguns milissegundos
*/

public class MinhaThread extends Thread{
   
    private String nome;
    private int tempo;
    
    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    public void run()
    {
       try {
        System.out.println("Executando a thread");
            for(int i=0;i<6;i++)
            {
                System.out.println(nome +" contador "+i);
                Thread.sleep(tempo);//mandar dormir
            }
        }
       catch (InterruptedException ex){
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Terminou a execução");
    }
}
