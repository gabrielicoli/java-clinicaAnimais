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
			System.out.println("4. Listar Girafas");
			System.out.println("5. Listar todos os animais");
			System.out.println("6. Remover um animal por id");
			System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("8. sair");
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
			case 5:ListarTodosAnimais();
			 
				s.nextLine();
				break;
			case 6:
				int idAnimal=-1;
				System.out.println("Entre com o id a ser removido");
				idAnimal=s.nextInt();
				ExcluirAnimalId(idAnimal);
				ListarTodosAnimais();
				
				break;
			case 7:				
				ListarAnimalPeloTipo();
				s.nextLine();
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
	Map<String, List<Animal>> mapa = new HashMap<String, List<Animal>>();

	// Cadastro Cavalo
	private void CadastrarCavalo(String nome) {
		Cavalo cavalo = new Cavalo(Animal.getIdUnico(), nome);
		listCavalo.add(cavalo);
		System.out.println("Cavalo adicionado com sucesso");
		s.nextLine();
		
		listAnimal.add(cavalo);		

		}	
	

	// Cadastro Girafa
	private void CadastrarGirafa(String nome) {

		Girafa girafa = new Girafa(Animal.getIdUnico(), nome);
		listGirafa.add(girafa);
		System.out.println("Girafa adicionada com sucesso");
		s.nextLine();
		
			listAnimal.add(girafa);
		
		 
	}

	// Listar cavalo
	private void ListarCavalo() {
		for (Animal cavalo : listCavalo) {

			System.out.println("Id do cavalo: " + cavalo.getId() + "   Nome do cavalo: " + cavalo.getNome());
			
		}
		s.nextLine();
	}

	// Listar Girafa
	private void ListarGirafa() {
		for (Animal girafa : listGirafa) {
			System.out.println("Id da Girafa: " + girafa.getId() + "   Nome da Girafa: " + girafa.getNome());
		}
		s.nextLine();
	}
	
	//Listar todos os animais
	
	private void ListarTodosAnimais() {
		
		for (Animal animalList : listAnimal) {
			System.out.println(
					"Id do animal: " + animalList.getId() + "   Nome do animal: " + animalList.getNome());
		}
		s.nextLine();
				
	}
	
	//Excluir um animal pelo seu id
	private void ExcluirAnimalId(int id) {
		boolean verificacao = false;
		for (Animal animalList : listAnimal) {

			if (id == animalList.getId()) {
				listAnimal.remove(id);
				verificacao = true;
				System.out.println("Animal removido com sucesso!");
			}

			if (verificacao == false) {
				System.out.println("Id inexistente");
			}

		}

	}
	
	//Listar animal pelo tipo
	private void ListarAnimalPeloTipo() {
	String tipo1="cavalo";
	String tipo2="girafa";
		mapa.put(tipo1, listCavalo);
		mapa.put(tipo2, listGirafa);
		
		System.out.println("Numero de cavalos cadastrados: "+listCavalo.size());
		int n=1;
		for (Animal cavalo : listCavalo) {
			System.out.println("	Dados do cavalo: ID_DO_CAVALO_"+n+":  "+ cavalo.getId()
								+"| NOME_DO_CAVALO_"+n+": "+ cavalo.getNome());
			n++;
		}
		System.out.println("Numero de Girafas cadastradas: "+listGirafa.size());
		for (Animal girafa: listGirafa) {
			System.out.println("	Dados do cavalo: ID_DA_GIRAFA_"+n+":  "+ girafa.getId()
								+"| NOME_DA_GIRAFA_"+n+": "+ girafa.getNome());
			n++;
		}
		
		System.out.println("Numero total de animais cadastrados: "+listAnimal.size());
		s.nextLine();
	}
	
	

}
