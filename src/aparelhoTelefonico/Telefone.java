package aparelhoTelefonico;


public class Telefone implements AparelhoTelefonico{
	public void ligar(String numero){
		System.out.println("ligando para o número: "+numero);
	}
	public void atender() {
		System.out.println("Recebendo ligação");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}
