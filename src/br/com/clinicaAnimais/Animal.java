package br.com.clinicaAnimais;

public abstract class Animal {

	private static int ID_Unico = 0;
	private String nome;
	private int id=0;
	protected void incrementarIdUnico() {
		ID_Unico += 1;
	}

	public static int getIdUnico() {
		return ID_Unico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
