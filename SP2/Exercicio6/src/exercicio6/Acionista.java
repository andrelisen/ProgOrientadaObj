
package exercicio6;

public class Acionista {
        private String cliente;
        private static int numeroCotas;
        private float valorCota;
        
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public static void setNumeroCotas(int numeroCotas) {
        Acionista.numeroCotas = numeroCotas;
    }

    public void setValorCota(float valorCota) {
        this.valorCota = valorCota;
    }
        
    public void toString()
    {
        System.out.println("Nome do cliente:"+cliente+"\tNúmero de cotas="+numeroCotas+"Valor de cotas="+valorCota);
    }
}
