/*
 3) Faça um programa que leia 2 strings e compara se a primeira é lexicograficamente maior, menor ou
igual à segunda. Teste “NullPointerException” para o caso de uma das strings ser nula.
 */
package exercicio3;
import java.util.Scanner;
/**
 *
 * @author Andrelise
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1, str2;
        try{
            System.out.println("Digite a primeira string");
            str1 = in.nextLine();
            System.out.println("Digite a segunda string");
            str2 = in.nextLine();
                if(str1.compareTo (str2) < 0)
                {
                    System.out.println("A primeira string:"+str1+"é maior que a segunda string:"+str2);
                }
                else{
                    System.out.println("A segunda string:"+str2+"é maior que a primeira string:"+str2);
                }
        }
        catch(NullPointerException e)
        {
            System.err.println("Usuário, você digitou uma string nula!");
        }
    }
    
    
}
