package test5;

import java.util.Scanner;
public class NonRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean notUnique = false;
		String CountOfString = "";
		System.out.println("Please enter the String.");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) { 
			for (int j = 0; j < input.length(); j++) { 
				if (i != j && input.charAt(i) == input.charAt(j)) {
					notUnique = true;
				}
			}
			if (!notUnique) {
				CountOfString = CountOfString + input.charAt(i);
			}
			notUnique = false;
		}
		System.out.println( "The length of Non-repeat characters : "+CountOfString.length() +"\nNon repeat characters are "+CountOfString );
		sc.close();
	}
}
