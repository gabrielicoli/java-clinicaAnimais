package br.com.clinicaAnimais;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
			System.out.println("3. Listar Cavalos");
			//System.out.println("4. Listar Girafas");
			//System.out.println("5. Listar todos os animais");
			//System.out.println("6. Remover um animal por id");
			//System.out.println("7. Exibir a quantidade de animais cadastradas por tipo");
			//System.out.println("8. sair");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				String nomeCavalo;
				System.out.println("Digite o nome do cavalo: ");
				nomeCavalo = s.next();
				CadastrarCavalo(nomeCavalo);
				s.nextLine();
				break;
			case 2:
				String nomeGirafa;
				System.out.println("Digite o nome da Girafa: ");
				nomeGirafa = s.next();
				CadastrarGirafa(nomeGirafa);
				s.nextLine();
				break;
			case 3:
				ListarCavalo();
				s.nextLine();
				break;
			case 4:
				ListarGirafa();
				s.nextLine();
				break;
			case 5:

				break;
			case 6:
				System.out.println("Remova um animal pelo seu id");

				break;
			case 8:
				System.exit(0);
				break;

			default:
				System.out.println(" Opção inexistente!\n\n");
			}

		}
	}

	// Criação das listas
	List<Animal> listAnimal = new ArrayList<Animal>();
	List<Animal> listCavalo = new ArrayList<Animal>();
	List<Animal> listGirafa = new ArrayList<Animal>();

	// Criação do mapa
	Map<Integer, List<Animal>> mapa = new HashMap<Integer, List<Animal>>();

	// Cadastro Cavalo
	private void CadastrarCavalo(String nome) {
		Cavalo cavalo = new Cavalo(Animal.getIdUnico(), nome);		
		listCavalo.add(cavalo);		
		System.out.println("Cavalo adicionado com sucesso");
		s.nextLine();
		System.out.println("id do cavalo: "+cavalo.getIdUnico()  
							+"  |nome:"+ cavalo.getNome());
	}

	// Cadastro Girafa
	private void CadastrarGirafa(String nome) {

		Girafa girafa = new Girafa(Animal.getIdUnico(), nome);
		listGirafa.add(girafa);
		System.out.println("Girafa adicionada com sucesso");
		s.nextLine();
	}

	// Listar cavalo
	private void ListarCavalo() {
		for (Animal cavalo : listCavalo) {

			System.out.println("Id do cavalo: " + cavalo.getId() + "   Nome dao cavalo: " + cavalo.getNome());

		}
		s.nextLine();
	}

	// Listar Girafa
	private void ListarGirafa() {
		for (Animal girafa : listGirafa) {
			System.out.println("Id da Girafa: " + girafa.getIdUnico() + "   Nome da Girafa: " + girafa.getNome());
		}
		s.nextLine();
	}

}
