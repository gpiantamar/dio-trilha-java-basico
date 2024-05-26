package Escola;
public class Aluno {
    /*O método get é responsável por obter o valor atual do atributo
    , logo ele precisa ser public e retornar um tipo correspondente ao valor, 
    Ex: public String getNome(){};
    */
    /*O método set é responsável por definit ou modificar o valor de um atributo
    em um ojeto, logo ele também precisa ser public, receber um parâ,metro do mesmo 
    tipo da variavel mas não retorna nenhum valor void.
    Ex: public static void setNome(String newNome);
    */
    private String nome;
    private int idade;
    private String sexo;

    //Getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }


    //Setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    public void setSexo(String novoSexo){
        this.sexo = novoSexo;
    }
}
