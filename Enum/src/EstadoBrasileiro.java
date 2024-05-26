//Criando enum EstadoBrasileiro para ser usado em toda aplicação
public enum EstadoBrasileiro {
    //Não é variável, são objetos.
    //Objetos
    //SÃO PARA VALORES PRÉ ESTABELECIDOS!!!
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piauí", 13),
    MARANHAO("MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15),
    MATO_GROSSO("MT", "Mato Grosso", 16);

    private String nome;
    private String sigla;
    private int ibge;

    //privado pois não precisa construir d fora!
    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    //Getters

    public int getIbge(){
        return ibge;
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
