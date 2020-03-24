package br.com.clinicaAnimais;

public class Girafa extends Animal {
	public Girafa(int id, String nome) {

		setNome(nome);
		setId(id);
		incrementarIdUnico();

	}

}
