/*
Exemplo da utilização da classe
 */
package usandoclascharacter;
import java.util.Scanner;
/**
 *
 * @author andrelis//e
 */
public class UsandoClasCharacter {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String s;
    char c;
    int i, n, ctalfa = 0, ctnum = 0;
 
    System.out.printf("Informe uma String:\n");
    s = ler.nextLine();
 
    System.out.println();
 
    n = s.length(); // tamanho da string (qtde de caracteres)
    for (i=0; i<n; i++) {
      c = s.charAt(i); // i-ésimo caractere da string 's'
// verificando se é um caractere alfabético
      if (Character.isLetter(c)) {
         ctalfa = ctalfa + 1;
         System.out.printf("%c ---> %da. letra\n", c, ctalfa);
      }
// verificando se é um caractere numérico
      else if (Character.isDigit(c)) {
              ctnum = ctnum + 1;
              System.out.printf("%c ---> %do. número\n", c, ctnum);
           }
           else System.out.printf("%c\n", c);
    }
     // verificando se é um caractere alfabético
//             if (Character.isLetter(c))
//             {
//             posicao = posicao + 1;
//               System.out.printf("%c ---> %da. letra\n", c, posicao);
//             }
  }
 
}