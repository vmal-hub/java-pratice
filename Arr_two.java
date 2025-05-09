package payilagam;

public class Arr_two {
	
	public static void main(String[] args) {
	int[][]exams= {
		    {90,80,76},
			{80,75,87},
			{76,98,87},
	};
int total=0;
	
		for (int row=0; row<exams.length;row++)
		{
			for(int col=0; col<exams[row].length; col++) {
//			System.out.println(exams[row][col]+ " ");

       total=total+exams[row][col];

		}
System.out.println(total);
//System.out.print();
	}

}
}
