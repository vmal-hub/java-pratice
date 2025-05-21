package payilagam;

public class Stringstarts {

	public static void main(String[] args) {
		
		String s1= "vimalraj";	
		String s2= "vi";
		boolean starts = true;
		
       for (int i=0; i<s2.length(); i++)
       {
    	   if(s1.charAt(i)!=s2.charAt(i)) {
    		   starts = false;
    		   System.out.println("Not starts with");
  		   break;
    	   
    	   }
       }
	

if (starts==true) {
	

	System.out.println("Starts with vi");
}
	}
}
       
