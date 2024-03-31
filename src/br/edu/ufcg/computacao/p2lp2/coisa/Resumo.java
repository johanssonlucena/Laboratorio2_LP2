package br.edu.ufcg.computacao.p2lp2.coisa;

public class Resumo {

	private String tema;
	private String conteudo;
	
	public Resumo(String tema, String conteudo) {
		this.tema = tema;
		this.conteudo = conteudo;
	}
	
	public String getTema() {
		return tema;
	}
	
	public String toString() {
		return this.tema + ": " + this.conteudo;
	}

}
