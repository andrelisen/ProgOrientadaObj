
package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ConversaoDeUnidadesDeArea value = new ConversaoDeUnidadesDeArea();
                int opcao;
                double x;
                    do{
                        System.out.print("0-Sair\n--->Converter de:\n1-Metro quadrado para pés quadrados\n2-Pé quadrado para centímetros quadrados\n3-Milha quadrada para acres\n4-Acre para pés quadrados\nOpcão:");
                        opcao = in.nextInt();
                        switch(opcao)
                        {
                            case 1:
                                System.out.println("Valor");
                                x = in.nextDouble();
                                value.setValor(x);
                                System.out.println(value.convertePesparaCm());
                                break;
                            case 2:  
                                System.out.println("Valor");
                                x = in.nextDouble();
                                value.setValor(x);
                                System.out.println(value.converteMparaPes());
                                break;
                            case 3:
                                System.out.println("Valor");
                                x = in.nextDouble();
                                value.setValor(x);
                                System.out.println(value.converteMilhaparaAcres());
                                break;
                            case 4:
                               System.out.println("Valor");
                               x = in.nextDouble();
                                value.setValor(x);
                                System.out.println(value.converteAcreparaPes());
                                break;
                        }
                    }while(opcao!=0);
    }
}
