package com.test.practice;
import java.io.Serializable;


public class Student  implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	int age ;
	String name ;
	
	public Student()
	{ super();
		age = 20;
		 name = "ravi"; 
		
	}
	

  @Override
public String toString()
  {
	String s = age + " " + name + " " ;

	 
	return s;
	  
  }


  
}
