package com.test.practice;

public class OccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String [] [] array1 = {{"priya1","priya12","priya13","priya14","priya1","priya1"},
	                        {"priya1","priya12","priya13","priya14","priya1","priya1"}};
	 
	 
	String word = "priya1";
	
	for(int i =0 ;i<2; i++)
	{
		for(int j=0;j<6;j++)
		{
			if(array1[i][j]==word)
			{
				System.out.println("string is matched" + "Location of string is" + i + " row " + j + " coll ");
			}
		}
	}
	
	}

}
