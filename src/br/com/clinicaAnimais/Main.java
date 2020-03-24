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
		Integer id=-1;
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
				CadastrarCavalo(nomeCavalo);
				break;

			case 2:
				String nomeGirafa;
				int idGirafa = 0;
				System.out.println("Digite o nome da Girafa: ");
				nomeGirafa = s.next();
				CadastrarGirafa(nomeGirafa);
				s.nextLine();
				break;
			case 3:
				ListarCavalos();
				s.nextLine();
				break;
			case 4: 
				ListarGirafas();
				s.nextLine();
			case 5: 
				break;
			case 6: System.out.println("Remova um animal pelo seu id");
										ExcluirID(id);
				break;
			case 8:
				System.exit(0);
				break;

			default:
				System.out.println(" Opção inexistente!\n\n");
			}

		}
	}
	List<Animal> listAnimal= new ArrayList<Animal>();
	List<Animal> listCavalo = new ArrayList<Animal>();
	List<Animal> listGirafa = new ArrayList<Animal>();
	
	Map<Integer,List<Animal>> mapa = new HashMap<Integer, List<Animal>>();
	
	private void CadastrarCavalo(String nome) {
       
		Cavalo cavalo = new Cavalo(nome);
		
		listCavalo.add(cavalo);
		System.out.println("Cavalo adicionado com sucesso");
		s.nextLine();
	}

	private void CadastrarGirafa(String nome) {

		Girafa girafa = new Girafa (nome);
		listGirafa.add(girafa);
		System.out.println("Girafa adicionada com sucesso");
		s.nextLine();
	}
	
	private void ListarCavalos() {
		Integer id= 0;
		
		for (Animal cavalo : listCavalo) {
			
		mapa.put(id, listCavalo);
		
		}
		
		
		for (Map.Entry<Integer, String> entrySet : MapaAnimaisClinica.entrySet()) {
            System.out.println("Id do cavalo:" + entrySet.getKey() + " nome do animal: "+ entrySet.getValue());            
        }
		
		
	}
	private void ListarGirafas() {
		for (Animal girafa : listGirafa) {
			System.out.println("Id da Girafa: "
					+"   Nome da Girafa: "+girafa.getNome());
			s.nextLine();
		}
		
	}
	private void ListarTodosAnimais() {
		
	}
	private void ExcluirID(Integer id) {
		mapa.remove(id);
	}
}
