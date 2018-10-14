/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;
import java.util.Scanner;
/**
 *
 * @author Andrelise
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Olá usuário, desejas criar quantas formas?");
        int numero = in.nextInt();
        Formas a[] = new Formas[numero];
        int valor, v1, v2, v3, v4, base, altura, raio;
        for(int i=0;i<numero;i++)
        {
            System.out.println("Escolha a forma desejada\n1-Quadrilatero\t2-Retangulo\t3-Quadrado\t4-Círculo\nResposta:");
            valor = in.nextInt();
            switch(valor)
            {
                case 1:
                    System.out.println("Digite os valores dos quatro lados de forma sequencial:");
                    v1 = in.nextInt();
                    v2 = in.nextInt();
                    v3 = in.nextInt();
                    v4 = in.nextInt();
                    a[i] = new Quadrilateros(v1, v2, v3, v4);
                    break;
                case 2:
                    System.out.println("Digite a base do retangulo:");
                    base = in.nextInt();
                    System.out.println("Digite a altura do retangulo:");
                    altura = in.nextInt();
                    a[i] = new Retangulos(base, altura);
                    break;
                case 3:
                    System.out.println("Digite o valor do lado do quadrado");
                    v1 = 0;
                    v1 = in.nextInt();
                    a[i] = new Quadrado(v1);
                    break;
                case 4: 
                    System.out.println("Valor do raio do círculo:");
                    raio = in.nextInt();
                    a[i] = new Circulo(raio);
                    break;
            }
        }
            for(int i=0;i<numero;i++)
            {
                System.out.println(a[i].toString()); 
            }
    }
    
}
