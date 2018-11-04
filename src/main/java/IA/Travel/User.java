package IA.Travel;

import java.util.ArrayList;

public class User {
	
	private String name;
	
	private String cityName;
	public ArrayList<Hotel> hotelOptions = new ArrayList<Hotel>();
	public ArrayList<Restaurant> restaurantOptions = new ArrayList<Restaurant>();
	public ArrayList<Turism> turismsOptions = new ArrayList<Turism>();


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void addHotel(Hotel hotel) {
		this.hotelOptions.add(hotel);
	}
	
	public void addRestaurant(Restaurant restaurant) {
		this.restaurantOptions.add(restaurant);
	}
	
	public void addTurism(Turism turism) {
		this.turismsOptions.add(turism);
	}
	
	
}

