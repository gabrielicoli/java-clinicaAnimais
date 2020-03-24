package br.com.clinicaAnimais;

public class Cavalo extends Animal {

	public Cavalo(int id, String nome) {

		setNome(nome);
		setId(id);
		incrementarIdUnico();
	}

}
