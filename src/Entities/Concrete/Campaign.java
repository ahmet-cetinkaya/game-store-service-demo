package Entities.Concrete;

import Entities.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private byte discount;
	boolean status;

	public Campaign(final int id, final String name, final byte discount, final boolean status) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.status = status;
	}

	public byte getDiscount() {
		return discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setDiscount(final byte discount) {
		this.discount = discount;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setStatus(final boolean status) {
		this.status = status;
	}

}
