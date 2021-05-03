package Entities.Concrete;

import Entities.Entity;

public class Game implements Entity {
	int id;
	String name;
	double price;

	public Game(final int id, final String name, final double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPrice(final double price) {
		this.price = price;
	}
}
