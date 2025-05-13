package payilagam;

public class Recurssion {

	public static void main(String[] args) {
		
		
int result= find_fact1(4);
 System.out.println("Factorial of 4 is: "+ result);
	}
		
public static  int find_fact4(int no)
    {
            if(no==1)return no;
			return no*find_fact1(no-1);
		}
public static int	find_fact3(int no)
		{
			if(no==1)return no;
			return no*find_fact1(no-1);
		}
public static int	find_fact2(int no)
		{
			if(no==1)return no;
			return no*find_fact1(no-1);
		}
public static	int	find_fact1(int no)
		{
			if(no==1)return no;
			return no*find_fact1(no-1);
		}

	
		
	}

 

