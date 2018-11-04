package IA.Travel;

public class CitiesData {
    City rio = new City();
		rio.setName("Rio");
		
		Hotel copaPalace = new Hotel();
		copaPalace.acceptsAnimals = false;
		copaPalace.breakfastIncluded = true;
		copaPalace.hasPool = true;
		
		rio.addHotel(copaPalace);
		
		Restaurant confeitariaColombo = new Restaurant();
		confeitariaColombo.setName("Confeitaria Colombo");
		
		rio.addRestaurant(confeitariaColombo);

		Turism corcovado = new Turism();
		corcovado.setName("Cristo Redentor");
		corcovado.setCategory("Passeio");
		corcovado.needsTicket = true;
		
		rio.addTurism(corcovado);
		
        database.cityList.add(rio);
        
    City Newyork = new City();
		Newyork.setName("Newyork");
		
		Hotel Thenewyorker = new Hotel();
		Thenewyorker.acceptsAnimals = true;
		Thenewyorker.breakfastIncluded = true;
		Thenewyorker.hasPool = true;
		
		Newyork.addHotel(Thenewyorker);
		
		Restaurant blueHill = new Restaurant();
		blueHill.setName("Blue Hill Restaurant");
		
		Newyork.addRestaurant(blueHill);

		Turism libertyStatue = new Turism();
		libertyStatue.setName("Liberty Statue");
		libertyStatue.setCategory("Passeio");
		libertyStatue.needsTicket = false;
		
		Newyork.addTurism(libertyStatue);
		
        database.cityList.add(Newyork);
    
    
    City Maceio = new City();
		Maceio.setName("Maceio");
		
		Hotel ritzlanta = new Hotel();
		ritzLAnta.acceptsAnimals = false;
		ritzLAnta.breakfastIncluded = true;
		ritzLAnta.hasPool = true;
		
		Maceio.addHotel(ritzLAnta);
		
		Restaurant massaguerinha = new Restaurant();
		massaguerinha.setName("Blue Hill Restaurant");
		
		Maceio.addRestaurant(massaguerinha);

		Turism praiafrances = new Turism();
		praiafrances.setName("Liberty Statue");
		praiafrances.setCategory("Passeio");
		praiafrances.needsTicket = false;
		
		Maceio.addTurism(praiafrances);
		
		database.cityList.add(Newyork);
    
}