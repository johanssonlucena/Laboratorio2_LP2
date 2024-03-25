package br.edu.ufcg.computacao.p2lp2.coisa;

public class RegistroTempoOnline {
	
	private String nomeDisciplina;
	private int tempoOnline;
	private int tempoEsperado;
	
	public RegistroTempoOnline (String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnline = 0;
		this.tempoEsperado = 120;
	}
	
	public RegistroTempoOnline (String nomeDisciplina, int tempoEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnline = 0;
		this.tempoEsperado = tempoEsperado;
	}
	
	public void adicionaTempoOnline(int tempo) {
		this.tempoOnline += tempo;
	}
	
	public boolean atingiuMetaTempoOnline() {
		if (tempoOnline >= tempoEsperado) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		return nomeDisciplina + " " + tempoOnline + "/" + tempoEsperado;
	}
	
}
