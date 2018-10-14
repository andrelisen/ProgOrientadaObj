/*
5) Desenvolva um método em JAVA que recebe uma string como parâmetro e verifica se a mesma é
composta apenas por caracteres maiúsculos. O método deve gerar 2 tipos de exceções específicas: uma
para indicar se existe algum caracter que não é uma letra e outra para indicar se alguma das letras não é
uma maiúscula. Para verificar o tipo dos caracteres use os métodos “isLetter” e “isUpperCase” da classe
“Character” (ambos static).
 */
package exercicio5;
import java.util.Scanner;
/**
 *
 * @author andrelise
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String str;
        int numeroCaracteres = 0, posicao = 0;
        char c;
        System.out.println("Digite uma palavra ");
        str = in.nextLine();
        numeroCaracteres = str.length(); 
        for (int i=0; i<numeroCaracteres; i++) {
            c = str.charAt(i); // i-ésimo caractere da string 's'
            if(Character.isLetter(c))
            {
                System.out.println("É uma letra :"+c);
            }
            else{
                System.out.println("Não é uma letra:"+c);
            }
                    if(Character.isUpperCase(c))
                    {
                    System.out.println("É maiúsculo:"+c);
                    }
                    else{
                    System.out.println("Não é maiúscula:"+c);
                    }
           
    }
    
}
}