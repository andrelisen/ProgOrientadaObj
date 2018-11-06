
package manipulacaothreads;

//MULTITAREFAS: processos e threads
/*
    Processo é um programa que está sendo executado;
    Thread é a menor unidade de CÓDIGO que pode ser executada. LOgo, dentro de um sistema que por si só e um 
    processo, podemos ter inumeras threads.Assim sendo, permite ao programa executar duas ou mais tarefas.
    Exemplo: editor de texto.
        Que pode formatar um texto(ao clicar num botão), e ao mesmo tempo pode enviar o texto para impressão
    --> Vantagens:programas mais eficientes,
*/

public class ManipulacaoThreads {

    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread 1", 600);
        //ele pode estar aqui ou dentro do construtor da thread dentro da classe
       // thread.start(); //executa o método run da classe minha thread
        MinhaThread thread2 = new MinhaThread("Thread 2", 900);
        
    }
}
