public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 5.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Novo saldo:" + saldo);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}