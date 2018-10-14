
package exercicio5;

public class ConversaoDeUnidadesDeArea {
               public static final double PESQUAD = 10.76;
               public static final int CENTIMETROSPES = 929;               
               public static final int MILHACRES = 640;
               public static final double ACRE = 43.560;
               public static double valor;
        /*       1 metro quadrado = 10.76 pés quadrados
 1 pé quadrado = 929 centímetros quadrados
 1 milha quadrada = 640 acres
 1 acre = 43.560 pés quadrados*/

                   public static void setValor(double valor) {
                         ConversaoDeUnidadesDeArea.valor = valor;
                     }

                    public double converteMparaPes()
                    {
                        return valor * PESQUAD;
                    }

                    public double convertePesparaCm()
                    {
                        return valor * CENTIMETROSPES;
                    }

                    public double converteMilhaparaAcres()
                    {
                        return valor * MILHACRES;
                    }
                    
                     public double converteAcreparaPes()
                    {
                        return valor * ACRE;
                    }

}
