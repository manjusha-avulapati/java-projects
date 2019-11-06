package com.varsha.manju;

import java.util.HashMap;
import java.util.Map;

public class FirstNRCharInStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNonRepeatedChar("manjushamn"));
System.out.println(FirstNonRepeatedChar("vvarshitha"));
	}
	
	public static Character FirstNonRepeatedChar(String s){
		if(s == null || s.trim().length()==0){
			return null;
		}
		s = s.toLowerCase();
    char[] chars = 	s.toCharArray();	
	Map<Character,Integer> map = new HashMap<>(20);
		for(char c : chars){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+ 1);
			}		
			else{
				map.put(c, 1);
			}
		}
		
		for(char c: chars){
			if(map.get(c)==1){
				return c;
			}
		}
			
		return null;
	}

}
