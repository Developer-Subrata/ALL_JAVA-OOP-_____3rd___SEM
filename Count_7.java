/*Write a Java recursive method to count the number of occurrences of a 
specific element in an array.
*/

import java.util.*;
public class Count_7  {
   public static int Counting(int[] arr, int  size, int ce,int index)   {
    if(index==size-1)	{
	 return 0;
	}
  else {
	 if(arr[index]==ce) { 
	   return (1+Counting(arr,size,ce,index+1));
	  }
    else {
           return (Counting(arr,size,ce,index+1));
          }
       }	
     }
   public static void main(String args[])  {
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[100];
	int size,ce,result,i,index=0;
     System.out.printf("Enter How Many Element You Want : ");
     size=sc.nextInt();
      System.out.printf("Enter %d Elements : \n",size);
      for(i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
     System.out.printf("Enter Which Element You Want To Count : ");
     ce=sc.nextInt();
     result=Counting(arr,size,ce,index);
   System.out.printf(" %d Is Occur %d Times In The Given Array.",ce,result);
    }
  }