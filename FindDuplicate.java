package String;

public class FindDuplicate {
	public static void main(String[]args) {
		
		System.out.println("Duplicates are: ");
		  
		int[]arr1= {2,3,4,5,6,8};
		int[]arr2= {1,3,4,7,8,9};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
			
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
					
//					if(!(arr1[i]==arr2[j])) {
//						System.out.println("Non-duplicates are: "+ arr1[i]);
//					}
					
		}
	
	}
	}
}
}
