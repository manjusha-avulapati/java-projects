package com.varsha.manju;

public class RemoveRepeatedchrs {
	

    private static final char MARKER_FOR_REMOVAL = ' ';
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(removeconsecutivechars("aaaaabbbcc",2));
     System.out.println(removeconsecutivechars("aaaaabbbbbccccc", 4));
     System.out.println(removeconsecutivechars("sssdddfff", 1));
	}
	
	public static String removeconsecutivechars(String s, int allowedRepeteation){
		
		
		char[] charArr = s.toCharArray();
		char lastChar = charArr[0];//first char
		int count = 1;//start with first char as 0 already read
		
		for(int i=1;i<charArr.length;i++){
			
			if(charArr[i] == MARKER_FOR_REMOVAL){
                throw new IllegalArgumentException("Place holder character =" + MARKER_FOR_REMOVAL  + " is found in input.");
            }
			if(charArr[i] == lastChar){
                ++count;
                lastChar = charArr[i];
                if(count > allowedRepeteation) {
                	charArr[i] = MARKER_FOR_REMOVAL; //mark it for removal
                }
            } else {
                count = 1; //reset count 1 to include current char read
                lastChar = charArr[i];
            }
			
		}
		String output= new String(charArr);
        String result = output.replace(MARKER_FOR_REMOVAL, '\u0000');
		
		return result;
	}

}
