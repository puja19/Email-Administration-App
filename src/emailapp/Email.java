package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	int mailBoxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String companySuffix = "matrix.com";

	// Constructor to recieve the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: First Name " + this.firstName + "Last Name" + this.lastName);

		// call a method asking for the department - return department

		this.department = setDepartment();
		System.out.println("The department selected is: " + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password is set");

		// comnbine elements to form email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Here is your email add " + email);
	}

	// ask for the department
	private String setDepartment() {
		System.out.println("Enter the department\n1 for sale\n2 for development\n3 for accounting \n4 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		switch (depChoice) {
		case 1:
			return "Sales";
		case 2:
			return "dev";
		case 3:
			return "acc";
		default:
			return "";
		}

	}

	// generate a random password

	private String randomPassword(int length) {
		String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*_+";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {

			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}

		return new String(password);

	}

	// set the mailbox capacity

	// set the alternate email

	// change the password

}
