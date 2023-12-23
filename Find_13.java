/* Write a Java program to find the k smallest elements in a given array.
 Elements in the array can be in any order. */

import java.util.*;
public class Find_13 {
    public static void main(String args[])    {
	Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
int size,k,i,j,temp=0,x;
        System.out.println("Enter How Many Number You Want : ");
        size=sc.nextInt();
     System.out.printf("\nEnter %d Elements : ",size);
      for(i=0;i<size;i++)	{
	  arr[i]=sc.nextInt();
	}
	System.out.println("Enter How Many Small Number You Want : ");
        k=sc.nextInt(); 
	 for(i=0;i<size-1;i++)   {
             x=i;
	     for(j=i+1;j<size;j++)	{
		 if(arr[x]>arr[j])   {
		     x=j;	
		   }
		    temp=arr[i];
		    arr[i]=arr[x];
		    arr[x]=temp; 
		  }
	     }	   
     for(i=0;i<k;i++) {
	 System.out.println("VALUE :"+arr[i]);
	}
  }
}