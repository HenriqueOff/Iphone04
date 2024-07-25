package reprodutorMusical;

public class Ipod implements ReprodutorMusical{
	public void tocar() {
		System.out.println("Tocando musica");
	}
	public void pausar() {
		System.out.println("Musica pausada");
	}
	public void selecionarMusica() {
		System.out.println("Selecionar uma música");
	}
}
