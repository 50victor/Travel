package IA.Travel;

import java.util.ArrayList;

public class City {

	
	private String name;
	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	private ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
	private ArrayList<Turism> turismList = new ArrayList<Turism>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addHotel(Hotel hotel) {
		this.hotelList.add(hotel);
	}
	
	public void addRestaurant(Restaurant restaurant) {
		this.restaurantList.add(restaurant);
	}
	
	public void addTurism(Turism turism) {
		this.turismList.add(turism);
	}
	
	
}
