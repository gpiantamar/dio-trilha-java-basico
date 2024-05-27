package heranca;
public class ComputadorPedrinho {
	public static void main(String[] args) throws Exception{
		System.out.println("Facebook");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		System.out.println("MSN");
		MSNMessegenger msn = new MSNMessegenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
