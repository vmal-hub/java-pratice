package payilagam;

public class Two_dim {

	public static void main(String[] args) {
		int[][]exams= {
			    {90,80,76},
				{80,75,87},
				{76,98,87},
		};
				int greatest=0;
				int total=(exams[0][1]+exams[0][1]+exams[0][2]);
				 if(total>greatest)
				 greatest=total;
				 
				 total=(exams[1][0]+exams[1][1]+exams[1][2]);
				 if(total>greatest)
				 greatest=total;
				 
				   total=(exams[2][0]+exams[2][1]+exams[2][2]);
			 if(total>greatest)
			 greatest=total;
				 
				// System.out.println(total+ " "+ total2+" "+ total3);
				  
System.out.println("phy: "+ exams[0][0]+" "+exams[0][1]+" "+exams[0][2]);
System.out.println("chm: "+exams[1][0]+" "+exams[1][1]+" "+exams[1][2]);
System.out.println("Mat: "+exams[2][0]+" "+exams[2][1]+" "+exams[2][2]);

System.out.println("Highmark: "+greatest);
		}
	

}
