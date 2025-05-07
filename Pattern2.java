package payilagam;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[]ar= {8,5,3,4,2};
	System.out.println("Enter number: ");
	int num=sc.nextInt();
	for(int i=0; i<ar.length; i++)
		if(ar[i]==num)
		{
System.out.println("Present -->"+ i);
break;
	}
	}
}
