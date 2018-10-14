
package exercicio2;

public class Ponto2D {
        private String nome;
        private double abcissa;
        private double ordenada;
        //métodos públicos

             public String getNome() {
                 return nome;
            }

             public void setNome(String nome) {
                 this.nome = nome;
            }

            public double getAbcissa() {
                return abcissa;
            }

             public void setAbcissa(double abcissa) {
                this.abcissa = abcissa;
            }

            public double getOrdenada() {
                return ordenada;
            }

             public void setOrdenada(double ordenada) {
                this.ordenada = ordenada;
            }
            
            public void movimenta(double abcissa, double ordenada)
            {
                this.ordenada=ordenada;
                this.abcissa=abcissa;
            }
            public String representacao ()
            {
                String pontocompleto;
                    pontocompleto = "Nome do ponto:"+nome+"\tPONTO NO EIXO DAS ABCISSAS="+abcissa+"\tPONTO NO EIXO DAS ORDENADAS="+ordenada;
                    return pontocompleto;
            }
    }
