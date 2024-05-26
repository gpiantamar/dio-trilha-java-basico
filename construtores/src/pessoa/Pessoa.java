package pessoa;
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //método construtor
    //o nome dele deve ser igual ao nome da classe
    //Com parÂmetros obrigatótios --> Recomendável
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    //Sem parâmetros ->> Recomendável
    public Pessoa(){
    }
    //Getters
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }

    //Setters

    public void setEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }
}
