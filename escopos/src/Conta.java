public class Conta {
    //Variavel da classe Conta.
    double saldo = 10.0;

    @SuppressWarnings("unused")
    public void sacar(double valor){
        //Variavel local de método.
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //Disponivel em toda classe.
        System.out.println(saldo);

        /*Disponivel somente no método sacar
        System.out.println(novoSaldo);Erro!*/
    }

    public double calcularDividaExponencial(){
        //Variavel local de metodo.
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x = 1; x <= 5; x++){
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
        }
        return valorMontante;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
