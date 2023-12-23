/*4.	Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. 
In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles. */

import java.util.*;

class Employee
  {
   /* private String name;
    private String role;

    public Employee(String name, String role)
      {
        this.name=name;
	      this.role=role;
      }
 public String getName()
  {
   return name;
  }
    public String getRole()
  {
   return role;
  }*/
     public double calculateSalary()
      {
	      return 0.0;
      }
  }
class Manager extends Employee
  {
    private double basic_salary;
    private double bonus;
  
    public Manager(double basic_salary, double bonus)
      {
	      this.basic_salary=basic_salary;
	      this.bonus=bonus;
      }
     public double calculateSalary()
      {
        return (basic_salary+bonus);
      } 
  }
class Programmer extends Employee
   {
	  private double basic_salary;
	  private double over_time;
     public Programmer(double basic_salary, double over_time)
       {
	      this.basic_salary=basic_salary;
	      this.over_time=over_time;
       }
  public double calculateSalary()
    {
      return (basic_salary+over_time);
    }
  }

public class Emp_4
  {
   public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     double bs_M,bonus_M,over_P,bs_P;

     System.out.printf("\n Enter The Basic Salary Of Manager : ");
 bs_M=sc.nextDouble();
     System.out.printf("\n Enter The Bonus Of Manager : ");
 bonus_M=sc.nextDouble();
	Employee mngr=new Manager(bs_M,bonus_M);
     
     System.out.printf("\n Enter The Basic Salary Of Programmer : ");
  bs_P=sc.nextDouble();
     System.out.printf("\n Enter The Over_Time_Pay Of Programmer : ");
  over_P=sc.nextDouble();
	Employee pgmr=new Programmer(bs_P,over_P);

      System.out.println("SALARY OF MANAGER : "+mngr.calculateSalary());
      System.out.println("SALARY OF Programmer : "+pgmr.calculateSalary());
       
    }
  }
