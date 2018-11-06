//criando uma classe RUNNABLE
package aulathreads;

import java.util.Random;


public class PrintTask implements Runnable
{
        private final int st;
        private final String tsk;
        private final static Random rand = new Random();
            public PrintTask(String name)
            {
            tsk = name; st = rand.nextInt(5000);
            }
            public void run()
            {
                try {
                    System.out.printf("%s irá dormir %d ms", tsk, st);
                    Thread.sleep(st);
                } 
                catch (InterruptedException e) {
                    System.out.println(tsk + " interrompida");
                    }
             System.out.println(tsk + " acordou");
            } 
}