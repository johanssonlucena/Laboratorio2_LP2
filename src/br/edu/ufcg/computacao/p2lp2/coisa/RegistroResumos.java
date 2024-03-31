package br.edu.ufcg.computacao.p2lp2.coisa;

public class RegistroResumos {

	private int controle;
	private Resumo[] resumos;
	
	public RegistroResumos(int numeroResumos) {
		this.resumos = new Resumo[numeroResumos];
		this.controle = 0;
	}
	
	public void adiciona(String tema, String conteudo) {
		this.resumos[this.controle] = new Resumo(tema, conteudo);
		controle++;
	}
	
	public String[] pegaResumos() {
		String[] resultado = new String[resumos.length];
		for (int i = 0; i < controle; i++) {
			if (resumos[i] != null) {
				resultado[i] = resumos[i].toString();
			}
		}
		
		return resultado;
	}
	
	public String imprimeResumos() {
		String resultado = "- " + controle + " resumo(s) cadastrado(s)\n- ";
		for (int i = 0; i < controle; i++) {
			if (i == controle - 1) {
				resultado += resumos[i].getTema();
			} else {
				resultado += resumos[i].getTema() + " | ";
			}
		}
		
		return resultado;		
	}
	
	public int conta() {
		return controle;
	}
	
	public boolean temResumo(String tema) {
		for (int i = 0; i < controle; i++) {
			if (tema == resumos[i].getTema()) {
				return true;
			}
		}

		return false;
	}
	
}
