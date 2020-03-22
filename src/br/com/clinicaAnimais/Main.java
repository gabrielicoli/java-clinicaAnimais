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
			System.out.println("7. Exibir a quantidade de animais cadastradas por tipo");
			System.out.println("8. sair");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				String nomeCavalo;
				int idCavalo = 0;
				System.out.println("Digite o nome do cavalo: ");
				nomeCavalo = s.next();
				System.out.println("Digite o id do cavalo: ");
				idCavalo = s.nextInt();
				int i=0;
				++i;
				CadastrarCavalo(idCavalo, nomeCavalo);
				break;

			case 2:
				String nomeGirafa;
				int idGirafa = 0;
				System.out.println("Digite o nome da Girafa: ");
				nomeGirafa = s.next();
				System.out.println("Digite o id da Girafa: ");
				idGirafa = s.nextInt();
				CadastrarGirafa(idGirafa, nomeGirafa);
				break;
			case 3:
				ListarCavalos();
				break;
			case 4: 
				ListarGirafas();
			case 5: 
				break;
			case 6: 
				break;
			case 8:
				System.exit(0);
				break;

			default:
				System.out.println(" Opção inexistente! Tente novamente.\n\n");
			}

		}
	}
	List<Animal> listAnimal= new ArrayList<Animal>();
	List<Animal> listCavalo = new ArrayList<Animal>();
	List<Animal> listGirafa = new ArrayList<Animal>();
	
	Map<Integer,List<Animal>> mapa = new HashMap<Integer, List<Animal>>();
	
	private void CadastrarCavalo(int id, String nome) {
        mapa.put(1, listCavalo);
		Cavalo cavalo = new Cavalo(id, nome);
		
		listCavalo.add(cavalo);
		System.out.println("Cavalo adicionado com sucesso");
	}

	private void CadastrarGirafa(int id, String nome) {

		Girafa girafa = new Girafa (id, nome);
		listGirafa.add(girafa);
		System.out.println("Girafa adicionada com sucesso");
	}
	
	private void ListarCavalos() {
		
		for (Animal cavalo : listCavalo) {
			System.out.println("Id do cavalo: "+cavalo.getId()+"   Nome do cavalo: "+cavalo.getNome());
		}
		
		
	}
	private void ListarGirafas() {
		for (Animal girafa : listGirafa) {
			System.out.println("Id da Girafa: "+girafa.getId()+"   Nome da Girafa: "+girafa.getNome());
		}
	}
	private void ListarTodosAnimais(){
		
	}
}
