package principal;

import servicos.AparelhoTelefonico;
import servicos.NavegadorInternet;
import servicos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {

	
	//Reprodutor Musical
	@Override
	public void tocar() {
		System.out.println("Musica tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica " + musica + " selecionada");
		
	}

	
	//NavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Página " + url + " selecionada");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}

	//AparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero " +numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println();
		
	}

	
 
}
