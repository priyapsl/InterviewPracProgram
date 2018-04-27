package com.test.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOfWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("D:\\eclipsedemo\\JavaPrac\\src\\com\\test\\practice\\file3.txt");
		BufferedReader br = new BufferedReader(reader);
        String s = null;
        while((s=br.readLine())!=null)
        {
        	String[] news = s.split(" ");
        	for(String new1 : news)
        	{
        		System.out.println("The single word is " + new1 + " The word count is " +new1.length());
        	}
        }
	}

}
