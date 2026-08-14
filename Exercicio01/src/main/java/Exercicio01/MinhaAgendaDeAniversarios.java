package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

	private ArrayList<Aniversariante> aniversariantes;

	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}

	public void adicionarAniversariante(String nome, int dia, int mes) {
		Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
		this.aniversariantes.add(aniversariante);
	}

	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
		ArrayList<String> nomes = new ArrayList<String>();
		DataAniversario data = new DataAniversario(dia, mes);

		for (Aniversariante aniversariante : aniversariantes) {
			if (aniversariante.getDataAniversario().equals(data)) {
				nomes.add(aniversariante.getNome());
			}
		}

		return nomes;
	}

	public void removerAniversariante(String nomeAniversariante) {
		for (int i = aniversariantes.size() - 1; i >= 0; i--) {
			Aniversariante aniversariante = aniversariantes.get(i);
			if (aniversariante.getNome().equals(nomeAniversariante)) {
				aniversariantes.remove(i);
			}
		}
	}
}
