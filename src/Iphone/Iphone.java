package Iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	public void tocar() {
		System.out.println("Tocar Musica");
	}


	public void pausar() {
		System.out.println("Musica pausada");
	}


	public void selecionarMusica() {
		System.out.println("Musica Selecionada");
	}


	public void exibirPagina(String url) {
		System.out.println("A página a ser exibida é: "+url);
	}


	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	}


	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}


	public void ligar(String numero) {
		System.out.println("Ligar para numero: "+numero);
	}


	public void atender() {
		System.out.println("Atendendo Ligação");
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}

}
