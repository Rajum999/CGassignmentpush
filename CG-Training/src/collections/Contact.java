package collections;

import java.util.Comparator;

enum Gender {
	male, female;

}

public class Contact {
	long phoneNumber;
	String name;
	String email;
	Enum gender;

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact(long phoneNumber, String name, String email, Enum gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ "]";
	}

}
