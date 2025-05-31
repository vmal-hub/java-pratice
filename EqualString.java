package String;

import java.util.Scanner;

public class EqualString {
	public static void main(String [] sugu) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name1:");
		String name1 = "sugu";
		
		System.out.println("Enter the name2:");
		String name2 = "sugu";
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
	}
  
}

