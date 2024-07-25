package celularLuan;

import Iphone.Iphone;
import java.util.Scanner;

public class CelularLuan {
	public static void main(String[] args) {
		
		Iphone celular = new Iphone();
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Tocar musica");
			System.out.println("2 - Pausar musica");
			System.out.println("3 - Selecionar musica");
			System.out.println("4 - Exibir página");
			System.out.println("5 - Adicionar página");
			System.out.println("6 - Atualizar página");
			System.out.println("7 - Ligar para outro telefone");
			System.out.println("8 - Atender ligação");
			System.out.println("9 - Correio de voz");
			System.out.println("10 - Sair");
			
			int escolha = sc.nextInt();
			sc.nextLine();
			switch(escolha) {
			case 1:
				celular.tocar();
				break;
			
			case 2:
				celular.pausar();
				break;
			
			case 3:
				celular.selecionarMusica();
				break;
				
			case 4:
				System.out.println("Digite o endereço do site que deseja visitar: ");
				String url = sc.nextLine();
				celular.exibirPagina(url);
				break;
				
			case 5:
				celular.adicionarNovaAba();
				break;
				
			case 6:
				celular.atualizarPagina();
				break;
				
			case 7: 
				System.out.println("Digite o numero que deseja ligar");
				String numero = sc.nextLine();
				celular.ligar(numero);
				break;
				
			case 8:
				celular.atender();
				break;
				
			case 9:
				celular.iniciarCorreioVoz();
				break;
				
			case 10:
				System.out.println("Saindo da aplicação");
				sc.close();
				return;
			default:
				System.out.println("Opção Inválida");
				break;
			
			}
		}
	}
}
