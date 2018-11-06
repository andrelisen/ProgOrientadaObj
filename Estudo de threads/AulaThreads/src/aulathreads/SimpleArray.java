
package aulathreads;

import java.util.Random;

public class SimpleArray {
        private final int[] array;
        private int writeIndex = 0;
        private final static Random generator = new Random();
            public SimpleArray(int size) { 
                array = new int[size]; 
            }
            public synchronized void add(int value) {
                int position = writeIndex;
                try {
                    Thread.sleep(generator.nextInt(500));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                array[position] = value;
                    System.out.printf("%s escreve %2d o elemento %d.\n",
                    Thread.currentThread().getName(), value, position);
                    System.out.printf("Próximo indice de gravação: %d\n", ++writeIndex);
            }
}