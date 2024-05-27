package inter.multifuncional;

import inter.equipamentos.copiadora.Copiadora;
import inter.equipamentos.digitalizadora.Digitalizadora;
import inter.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	public void copiar() {
		System.out.println("Copiando via Equipamento multifuncional.");
	}
	public void digitalizar() {
		System.out.println("Digitalizando via Equipamento multifuncional.");
	}

	public void imprimir() {
		System.out.println("Imprimindo via Equipamento multifuncional.");
	}

}
