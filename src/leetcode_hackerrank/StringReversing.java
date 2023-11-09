package leetcode_hackerrank;

public class StringReversing {

	public static void main(String[] args) {
		StringReversing sr = new StringReversing();
		System.out.println(sr.reverse("this is EsayaS"));
		System.out.println(sr.reverseChar("this is EsayaS"));
		System.out.println(sr.reverseUsingStringBuffer("this is EsayaS"));
		System.out.println(sr.reverseUsingByte("USA"));
		
	}
	
	//Recursively 
	public String reverse(String str){
		
		if(str == null || str.length() <=1){
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public String reverseChar(String str){
		char[] ch = str.toCharArray();
		int left = 0;
		int right = str.length() - 1 ;
		while( left <right ){
			char tempChar = ch[left];
			ch[left] = ch[right];
			ch[right] = tempChar;
			
			left++; 
			right--;
		}
		return String.copyValueOf(ch);
	}
	
	public String reverseUsingStringBuffer(String str){
		StringBuffer s= new StringBuffer();
		for ( int i= 0; i < str.length(); i++){
			s = s.append(str.charAt(str.length()-1-i));
		}
	
		return s.toString();
	}
	
	public String reverseUsingByte(String str){
		byte [] strByte = str.getBytes();
		byte [] re=new byte[strByte.length];
		for ( int i= 0; i < strByte.length; i++){
			re[i]= strByte[strByte.length -1-i];
		}
		
		return new String(re);
		
	}
	

}
