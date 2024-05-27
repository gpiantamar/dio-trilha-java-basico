public class Carro extends Veiculo{
    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado!");
    }
    //Escondendo as operações.
    private void confereCombustivel(){
        System.out.println("Conferindo combustível!");
    }
    private void confereCambio(){
        System.out.println("Conferindo câmbio(P)!");
    }
}
