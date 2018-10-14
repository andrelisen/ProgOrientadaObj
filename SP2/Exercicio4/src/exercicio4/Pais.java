
package exercicio4;

public class Pais {
        private int codigo;
        private String nome;
        private int populacao;
        private double dimensao;
    
    public void inicializa()
    {
        codigo = 0;
        populacao=0;
        dimensao=0;
    }
        
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    
    public double densidade()
    {
        return populacao/dimensao;
    }
}
