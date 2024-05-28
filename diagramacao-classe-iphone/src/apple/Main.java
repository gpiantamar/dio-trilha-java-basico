package apple;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância da classe iPhone
        Iphone meuIphone = new Iphone();

        // Usa os métodos do ReprodutorMusical
        System.out.println("=================================");
        System.out.println("Reprodutor musical");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Mc Lan - Rabetão");


        // Usa os métodos do AparelhoTelefonico
        System.out.println("=================================");
        System.out.println("Aparelho telefonico");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usa os métodos do NavegadorInternet
        System.out.println("=================================");
        System.out.println("Navegador internet");
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        System.out.println("=================================");
    }
}
