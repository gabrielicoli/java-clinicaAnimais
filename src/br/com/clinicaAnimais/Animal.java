package br.com.clinicaAnimais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Animal {

	public int id;
	public String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	Scanner s = new Scanner(System.in);	
	
     public void cadastroCavalo() {
		
		
		List cavalo = new ArrayList();
		 System.out.println("Digite o nome do cavalo: ");
		 nome=s.next();
		cavalo.add(nome);
		
		
	}
	
}