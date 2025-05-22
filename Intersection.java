package Filehandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		 List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
	
	List<Integer> ll = new ArrayList<Integer>(list1);
	ll.retainAll(list2);
	
	System.out.println(ll);
	//System.out.println(ll.containsAll(list2));
	}

}



