package br.edu.ufcg.computacao.p2lp2.coisa;
import java.util.Arrays;

public class Disciplina {

	private String nomeDisciplina;
	private int horasEstudo;
	private double[] notas;
	
	public Disciplina (String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.horasEstudo = 0;
		this.notas = new double[4];
	}
	
	public void cadastraHoras(int horas) {
		this.horasEstudo += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota-1] = valorNota;
	}
	
	public boolean aprovado() {
		if (calculaMedia() >= 7) {;
			return true;
		}
		
		return false;
	}

	private double calculaMedia() {
		double soma = 0;
		for (double nota: notas) {
			soma += nota;
		}
		
		return soma / notas.length;
	}
	
	public String toString() {
		return nomeDisciplina +  " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
	}
}
