package inter.estabelecimento;
import inter.equipamentos.impressora.Impressora;
import inter.equipamentos.copiadora.Copiadora;
import inter.equipamentos.digitalizadora.Digitalizadora;
import inter.equipamentos.digitalizadora.Scanner;
import inter.equipamentos.impressora.Deskjet;
import inter.equipamentos.impressora.Laserjet;
import inter.multifuncional.EquipamentoMultifuncional;
public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();

		Deskjet deskjet = new Deskjet();
		Laserjet laserjet = new Laserjet();
		Impressora impressora = em;
		Digitalizadora digitalizadora= em;
		Copiadora copiadora = em;
		Scanner scanner = new Scanner();

		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();

		laserjet.imprimir();
		deskjet.imprimir();

		scanner.digitalizar();

	}
}
