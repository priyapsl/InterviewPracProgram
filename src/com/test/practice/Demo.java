package com.test.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(" i am in the deserialization");
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\eclipsedemo\\JavaPrac\\src\\com\\test\\practice\\file1.txt"));  
		 
		System.out.println(" i am in the deserialization 2");
		if(in.available()==1)
		 {
		Student s=(Student)in.readObject();  
		 in.close();
		}
		}
	}


