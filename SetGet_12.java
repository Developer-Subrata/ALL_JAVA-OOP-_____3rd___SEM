/* Write a Java program to create a class called Person with private instance 
variables name, age. and country. Provide public getter and setter methods 
to access and modify these variables. */

import java.util.*;
class Person  {
    private String name,country;
    private int age;
     public String getName()	{
	 return name;
	}
       public void setName(String name)	{
	 this.name=name;
	}
     public int getAge()	{
	 return age;
	}
     public void setAge(int age)	{
	 this.age=age;
	}
     public String getCountry()	{
	 return country;
	}
     public void setCountry(String country)	{
	 this.country=country;
	} 
  }

public class SetGet_12 {
  public static void main(String args[])  {
      Person psn=new Person();  
      psn.setName("SUBRATA");
      psn.setAge(20);
      psn.setCountry("INDIA");
      System.out.println("Your Name : "+psn.getName());
	System.out.println("You Are Old : "+psn.getAge());
	  System.out.println("Your Country : "+psn.getCountry());
    }
 }