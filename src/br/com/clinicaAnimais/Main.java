package br.com.clinicaAnimais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	public Scanner s = new Scanner(System.in);

	private void start() {

		int opcao = 0;
		while (true) {
			System.out.println("1. Cadastrar cavalo");
			System.out.println("2. Cadastrar girafa");
			System.out.println("3. sair");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				String nomeCavalo;
				int idCavalo = 0;
				System.out.println("Digite o nome do cavalo: ");
				nomeCavalo = s.next();
				System.out.println("Digite o id do cavalo: ");
				idCavalo = s.nextInt();

				CadastrarCavalo(idCavalo, nomeCavalo);
				break;

			case 2:
				String nomeGirafa;
				int idGirafa = 0;
				System.out.println("Digite o nome do cavalo: ");
				nomeGirafa = s.next();
				CadastrarGirafa(idGirafa, nomeGirafa);
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println(" Opção inexistente! Tente novamente.\n\n");
			}

		}
	}
	
	List<Animal> listCavalo = new ArrayList<Animal>();
	List<Animal> listGirafa = new ArrayList<Animal>();
	private void CadastrarCavalo(int id, String nome) {

		Cavalo cavalo = new Cavalo(id, nome);
		
		listCavalo.add(cavalo);

	}

	private void CadastrarGirafa(int id, String nome) {

		Girafa girafa = new Girafa (id, nome);
		listGirafa.add(girafa);
	}
}
