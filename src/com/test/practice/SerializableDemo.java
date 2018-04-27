package com.test.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class SerializableDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         
		 Student s = new Student();
		 System.out.println(" I am in serializable demo class");
		 FileOutputStream fout = new FileOutputStream("D:\\eclipsedemo\\JavaPrac\\src\\com\\test\\practice\\file1.txt");
		 //fout.write(65);
		 
		 ObjectOutputStream obj = new ObjectOutputStream(fout);
		 obj.writeObject(s);
		 obj.close();
		 fout.close();
		 
	}

}
