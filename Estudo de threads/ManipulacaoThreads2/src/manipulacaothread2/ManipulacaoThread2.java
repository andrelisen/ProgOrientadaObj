
package manipulacaothread2;


public class ManipulacaoThread2 {

   
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("1", 1000);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("2",800);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("3", 500);
}
    
}
