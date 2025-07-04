package String;

public class FindVowels {

	public static void main(String[] args) {
		
		String[]arr= {"apple","amma","vimal","mohan","santhosh"};
		
		
		for(int i=0; i<arr.length; i++){
			
			String word=arr[i];
			int count=0;
			
			for(int j=0; j<word.length(); j++) 
			{
				char ch= Character.toLowerCase(word.charAt(j));
				
				if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
				{
				count++;
			}
		}
		System.out.println("words:"+word+"=>"+"vowels_count:"+count);
	
	}
}
}

