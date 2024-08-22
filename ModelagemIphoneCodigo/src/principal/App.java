package principal;

import componentes.Musica;
import componentes.Numero;
import componentes.Url;

public class App {
 public static void main(String[] args) {
	Iphone iphone11 = new Iphone();
	Musica musica1 = new Musica("Somente Nela");
	Numero numero1 = new Numero("71-42424-34214");
	Url url1 = new Url("www.youtube.com");
	

	iphone11.selecionarMusica(musica1.getTitulo());
	iphone11.tocar();
	iphone11.pausar();
	
	iphone11.atender();
	iphone11.ligar(numero1.getNumero());
	
	iphone11.exibirPagina(url1.getUrl());
	iphone11.atualizarPagina();
}
}
