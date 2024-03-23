package message;

import java.util.Scanner;

public class MessageApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter message");
		String text = s.nextLine();
		System.out.println(text.length());
		if (text.length() < 100) {
			System.out.println("Message Sent :)");
		} else {
			try {
				MoreThan100CharacterException m = new MoreThan100CharacterException();
				throw m;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
/*
 * DFGHJKLQWERTYUIZXCVBiqwertyuiopasdfghjklzxcvbn mqwerrtyyuiopasdfghjklzxcvbnmwhbeubbubub qwertyuiopasdfghjkkkkkkkkklzxcvbnm,qwertyuiopasdfghjklzxcvbnmwertyuiopasdfghjklzxcvbnm,qwertyuio1234567890-!@#$%^&*()
 * ASNaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
 */
