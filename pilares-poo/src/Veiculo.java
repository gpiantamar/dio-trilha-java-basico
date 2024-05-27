public abstract class Veiculo {
	private String chassi;

    public String getChassi(){
        return chassi;
    }

    public void setChassi(String novoChassi){
        this.chassi = novoChassi;
    }

	public abstract void ligar();
}
