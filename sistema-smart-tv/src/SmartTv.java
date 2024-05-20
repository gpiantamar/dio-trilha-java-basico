public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;

	public void mudarCanal(int novoCanal){
		canal = novoCanal;
	}

	public void aumentarCanal(){
		//Canal = canal + 1.
		canal++;
		System.out.println("Aumentando o canal para: " + canal);
	}
	public void diminuirCanal(){
		//Canal = canal + 1.
		canal--;
		System.out.println("Diminuindo o canal para: " + canal);
	}
	public void ligar(){
		ligada = true;
	}
	public void desigar(){
		ligada = false;
	}
	public void aumentarVolume(){
		//Volume = volume + 1.
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	public void abaixarVolume(){
		//Volume = volume - 1.
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
}
