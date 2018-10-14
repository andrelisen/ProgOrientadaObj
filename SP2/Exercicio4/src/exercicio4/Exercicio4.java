

package exercicio4;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pais country = new Pais();
            country.inicializa();
            System.out.println("Digite as seguintes informações para prosseguir");
            System.out.println("Nome do pais");
            String name = in.nextLine();
            System.out.println("Código ISO do "+name);
            int codigo = in.nextInt();
            System.out.println("Número de habitantes");
            int populacao = in.nextInt();
            System.out.println("Dimensão territorial");
            double dimensao = in.nextDouble();
                country.setCodigo(codigo);
                country.setNome(name);
                country.setPopulacao(populacao);
                country.setDimensao(dimensao);
                System.out.println("Cálculo da densidade do pais "+name+"\té igual a ="+country.densidade());
    }
    
}
