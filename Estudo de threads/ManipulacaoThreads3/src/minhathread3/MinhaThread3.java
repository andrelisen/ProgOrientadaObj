/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhathread3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrelise
 */
public class MinhaThread3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("3", 500);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

       // t1.start();
        
//        try {
//            t1.join(200);//só executa o restante do código depois de 200 ms
//        } catch (InterruptedException ex) {
//            Logger.getLogger(MinhaThread3.class.getName()).log(Level.SEVERE, null, ex);
//        }
           t1.start();
           t2.start();
           t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } 
        catch (InterruptedException ex)
        {
            Logger.getLogger(MinhaThread3.class.getName()).log(Level.SEVERE, null, ex);
        }
           

        
        System.out.println("Programa finalizado");
        }
    
}
