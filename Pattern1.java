
public class Pattern1{

public static void main(String[]args){
 Pattern1.Star();
}
public static void Star(){
		// TODO Auto-generated method stub
		for(int row=1; row<=9;row++)
		{
			for(int col=1; col<=9; col++)
				{
//				if (col==1|| col==9||row==col && row<=5||row+col==10 && row<=5)

                   if(col==1|| row==1|| col==9 && row<=4|| row==5)
					System.out.print("* ");
		else
                  System.out.print("  "); 
				}
			System.out.println();
		
		
	}
}
}
