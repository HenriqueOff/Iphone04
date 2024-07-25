package navegadorInternet;

public class Browser implements NavegadorInternet{
	public void exibirPagina(String url) {
		System.out.println("Acessando página url: "+url);
	}
	public void adicionarNovaAba() {
		System.out.println("Nova página adicionada");
	}
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}
}
