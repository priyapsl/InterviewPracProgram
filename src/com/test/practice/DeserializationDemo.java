package com.test.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub

		/*
		 * FileInputStream input = new FileInputStream(
		 * "D:\\eclipsedemo\\JavaPrac\\src\\com\\test\\practice\\file1.txt");
		 * 
		 * ObjectInputStream obj = new ObjectInputStream(input); Object obj2 =
		 * obj.readObject(); Student s2 = (Student)obj2; s2.toString();
		 * input.close();
		 */
		System.out.println(" i am in the deserialization");
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(
						new File(
								"D:\\eclipsedemo\\JavaPrac\\src\\com\\test\\practice\\file1.txt")));

		System.out.println(" i am in the deserialization 2");
	
			Student s = (Student) in.readObject();
   System.out.println(s);
	
		in.close();
	}
}
