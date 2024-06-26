package br.edu.ufcg.computacao.p2lp2.coisa;

public class Descanso {

	private int horasDescanso;
	private int numerosSemanas;
	private boolean cansado;
	
	public Descanso() {
		this.horasDescanso = 0;
		this.numerosSemanas = 0;
		this.cansado = true;
	}
	
	public void defineHorasDescanso(int horas) {
		this.horasDescanso = horas;
		atualizaStatus();
	}
	
	public void defineNumeroSemanas(int semanas) {
		this.numerosSemanas = semanas;
		atualizaStatus();
	}
	
	public String getStatusGeral() {	
		if (cansado) {
			return "cansado";
		} 	
		return "descansado";
	}
	
	private void atualizaStatus() {
		if (horasDescanso >= numerosSemanas * 26) {
			this.cansado = false;
		} else {
			this.cansado = true;
		}
	}

}