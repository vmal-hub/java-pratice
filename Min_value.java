package payilagam;

public class Min_value {

	public static void main(String[] args) {
		int[]ar= {54,48,90,909,87};
int min =ar[0]; int second_min=ar[0];
 for (int i = 0; i<ar.length; i++) 
 {
	 if (ar[1] < min)
	 {
		     second_min=min;
		     min=ar[i];
	 }
 }
 	 if(ar[2]==99)
 	 System.out.println("true");
// 	 else
// 		 System.out.println("false");
 

 System.out.println(min);
 System.out.println(second_min);

 
	
}
}
