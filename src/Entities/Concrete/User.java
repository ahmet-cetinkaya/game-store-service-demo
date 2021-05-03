package Entities.Concrete;

import Entities.Entity;

public class User implements Entity {
	int id;
	String email;
	String password;

	public User(final int id, final String email, final String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setPassword(final String password) {
		this.password = password;
	}
}
