package Entities.Concrete;

import java.time.LocalDate;

public class Customer extends User {
	String firstName;
	String lastName;
	String nickName;
	LocalDate dateOfBirth;
	String nationalityId;

	public Customer(final int id, final String email, final String password, final String firstName,
			final String lastName, final String nickName, final LocalDate dateOfBirth, final String nationalityId) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setDateOfBirth(final LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setNationalityId(final String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public void setNickName(final String nickName) {
		this.nickName = nickName;
	}

}
