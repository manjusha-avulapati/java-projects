package com.varsha.manju;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestNumAry {

public static void main(String[] args)
 {
	int[] arr = {2,3,6,5,4,6,5};
	System.out.println("second highest is " + secondhighest(arr));
	System.out.println("secong hgst using stream" + secondhighestStrm());	
}

public static int secondhighest(int[] arr1){
	
	int hst = Integer.MIN_VALUE + 1;
	int shst = Integer.MIN_VALUE;
	for(int i : arr1){
		if(i>hst){
			shst = hst;
			hst = i;
		}
		else if(i > shst && i!= hst){
			shst = i;
		}
	}
	return shst;
	
}

public static int secondhighestStrm(){
	List<Integer> a = Arrays.asList(2,4,5,6,3,6);
	
	//for parallelizing use parallelStream instead of stream
	List<Integer> sorteduniquenums = 
			a.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(sorteduniquenums.get(sorteduniquenums.size()-2));
	return sorteduniquenums.get(sorteduniquenums.size()-2);

}
	

}
