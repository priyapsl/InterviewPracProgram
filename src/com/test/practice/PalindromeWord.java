package com.test.practice;

public class PalindromeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("ABCBA");
		String s3 = "ABCBA";
		StringBuffer s2 = new StringBuffer();
		char [] arrayc = s.toCharArray();
		int size = arrayc.length;
		for(int i=size-1; i>=0;i--)
		{
			s2 = s2.append(arrayc[i]);
			System.out.println(s2);
		}
	
	  if(s.contentEquals(s2) )
	  {
		  System.out.println("The word is plaindrome word");
	  }
	
	 if(s3.intern() != s)
	 {
		 System.out.println("string objects matched correctly");
	 }
	}

	

	
}
