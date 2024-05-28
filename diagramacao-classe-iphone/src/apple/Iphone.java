package apple;
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
	public void atender(){
        System.out.println("Alô");
    }
	public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina " + url);
    }
	public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
	public void atualizarPagina(){
        System.out.println("Adicionando página");
    }
    public void tocar(){
        System.out.println("Tocando");
    }
	public void pausar(){
        System.out.println("Pausado");
    }
	public void selecionarMusica(String musica){
        System.out.println(musica + " reproduzindo");
    }
}
