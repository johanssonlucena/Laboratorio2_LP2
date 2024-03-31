package br.edu.ufcg.computacao.p2lp2.coisa;

public class RegistroResumos {

	private int quantidade;
	private int indice;
	private Resumo[] resumos;
	
	public RegistroResumos(int numeroResumos) {
		this.resumos = new Resumo[numeroResumos];
		this.quantidade = 0;
		this.indice = 0;
	}
	
	public void adiciona(String tema, String conteudo) {
		this.resumos[this.indice] = new Resumo(tema, conteudo);
		indice++;
		if (quantidade != resumos.length) {
			quantidade++;
		}
		
		if (indice == resumos.length) {
			indice = 0;
		}

	}
	
	public String[] pegaResumos() {
		String[] resultado = new String[quantidade];
		for (int i = 0; i < quantidade; i++) {
			if (resumos[i] != null) {
				resultado[i] = resumos[i].toString();
			}
		}
		
		return resultado;
	}
	
	public String imprimeResumos() {
		String resultado = "- " + quantidade + " resumo(s) cadastrado(s)\n- ";
		for (int i = 0; i < quantidade; i++) {
			if (i == quantidade - 1) {
				resultado += resumos[i].getTema();
			} else {
				resultado += resumos[i].getTema() + " | ";
			}
		}
		
		return resultado;		
	}
	
	public int conta() {
		return quantidade;
	}
	
	public boolean temResumo(String tema) {
		for (int i = 0; i < quantidade; i++) {
			if (tema == resumos[i].getTema()) {
				return true;
			}
		}

		return false;
	}
	
}
