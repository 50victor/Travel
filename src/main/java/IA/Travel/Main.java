package IA.Travel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Base database = new Base();
		Scanner scan = new Scanner(System.in);
				
//		City rio = new City();
//		rio.setName("Rio");
//		
//		Hotel copaPalace = new Hotel();
//		copaPalace.acceptsAnimals = false;
//		copaPalace.breakfastIncluded = true;
//		copaPalace.hasPool = true;
//		
//		rio.addHotel(copaPalace);
//		
//		Restaurant confeitariaColombo = new Restaurant();
//		confeitariaColombo.setName("Confeitaria Colombo");
//		
//		rio.addRestaurant(confeitariaColombo);
//
//		Turism corcovado = new Turism();
//		corcovado.setName("Cristo Redentor");
//		corcovado.setCategory("Passeio");
//		corcovado.needsTicket = true;
//		
//		rio.addTurism(corcovado);
//		
//		database.cityList.add(rio);
		
		
		
		System.out.println("Seja bem vindo ao sistema de planejamento da sua viagem");
		System.out.println("Insira seu nome: ");
		String userName = scan.nextLine();
		User newUser = new User();
			
		System.out.println("Insira a cidade desejada");
		String city = scan.nextLine();
		
		newUser.setName(userName);
		newUser.setCityName(city);
		
		Boolean flag = true;
		while (flag) {
			for(int i = 0; i < database.cityList.size(); i++) {
				if (database.cityList.get(i).getName().equals(city)) {// se existe a cidade
					System.out.println("Você deseja escolher:"
							+ "1 - Hotel"
							+ "2 - Restaurante"
							+ "3 - Passeio turistico"
							+ "4 - Finalizar escolhas"
							+ "5 - Sair");
					
					int option = scan.nextInt();
					if (option == 1) {
						//classe com opções de hotel
					}else if (option == 2) {
						//classe com opções de restaurante
					}else if (option == 3) {
						//classe com opções de passeios
					}else if (option == 4) {
						//imprimir escolhas do usuario
					}else if (option == 5) {
						flag = false;
					}else {
						System.out.println("Opção inválida, favor escolher de 1 a 4");
					}
					
				}else{
					System.out.println("Cidade não cadastrada");
				}	
			}			
		}
	}
}
