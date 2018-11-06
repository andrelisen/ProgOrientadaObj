/*
Esses códigos são os que o professor Milton explicou em sala de aula
 */
package aulathreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class AulaThreads {

    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");
        System.out.println("Iniciando executor");
        //Disparando threads com um objeto Executor    
            ExecutorService xs = Executors.newCachedThreadPool();
            xs.execute(task1); //execute retorna imediatamente
            xs.execute(task2);
            xs.execute(task3);
                xs.shutdown(); // Encerra xs quando threads terminam
                    System.out.println("Tarefas iniciadas, para devidos fins");
        //chamando a parte em que fala sobre sincronização
        SimpleArray array = new SimpleArray(10);
        for(int i=0;i<10;i++)
        {
            array.add(i);
        }
} 
}
