/*
 Escreva em Java uma classe que represente um circulo no plano cartesiano. Forneça os seguintes membros de classe:
a) Um construtor que receba o raio e um ponto (o centro do círculo);
b) Um construtor que receba o raio e posicione o círculo na origem do espaço cartesiano;
c) Métodos de acesso ao atributo raio do círculo;               
d) Métodos inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de um dado valor;
e) Método mover, que move o círculo para um local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e ordenada do ponto para onde o círculo se move);
f) Método que retorna a área do círculo.
 */
package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            Circulo circle = new Circulo();
                System.out.println("Digite o ponto (x, y)");
                double x = in.nextDouble();                
                double y = in.nextDouble();
                    circle.setX(x);
                    circle.setY(y);
                System.out.println("Digite o raio");
                double raio = in.nextDouble();
                    circle.setRaio(raio);
                int opcao;
                    do{
                        System.out.print("=======================\n0-SAIR\n1-MOVER CÍRCULO\n2-INFLAR\n3-DESINFLAR\n4-ÁREA DO CÍRCULO\n5-MOSTRAR INFORMAÇÕES DA CLASSE CÍRCULO\n\tOPÇÃO:");
                        opcao = in.nextInt();
                        switch(opcao)
                        {
                            case 1:
                                    System.out.println("Digite o ponto (x, y)");
                                      x = in.nextDouble();                
                                      y = in.nextDouble();   
                                      circle.mover(x, y);
                                break;
                            case 2:
                                    circle.inflar();
                                    System.out.println("Círculo inflado com sucesso");
                                    break;
                            case 3:
                                    circle.desinflar();
                                    System.out.println("Círculo desinflado com sucesso");
                                break;
                            case 4: 
                                System.out.println("Valor da área do círculo é igual a=\t"+circle.area());    
                                break;
                            case 5: 
                                System.out.println("Ponto (x,y) =("+circle.getX()+","+circle.getY()+")\tRaio ="+circle.getRaio());
                                break;
                        }
                    }while(opcao!=0);
    }
    
}
