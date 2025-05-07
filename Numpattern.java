package payilagam;

public class Numpattern {

	public static void main(String[] args) {
		
		for(int row=1; row<=4; row++){
	int limit= 2 * row-1;		   
			   for(int col=1; col<=limit; col++)
			{

			System.out.print(col+ " ");
			}
			   System.out.println();
			}
	}

}
