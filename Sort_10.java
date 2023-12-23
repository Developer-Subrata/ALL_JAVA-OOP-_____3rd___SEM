/*
Write a Java program to create an interface Sortable with a method sort() 
that sorts an array of integers in ascending order. 
Create two classes BubbleSort and SelectionSort that implement the Sortable 
interface and provide their own implementations of the sort() method.
*/

import java.util.*;
interface Sortable  {
    public void sort(int[] arr, int size);
  }

class BubbleSort implements Sortable  {
    public void sort(int[] arr, int size)	{
	 int i,j,temp;
	 for(i=0;i<size;i++)   {
	     for(j=0;j<size-i-1;j++)	{
		 if(arr[j]>arr[j+1])   {
		    temp=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=temp; 
		   }
		}	
	   }
	}
  }

class SelectionSort implements Sortable  {
    public void sort(int[] arr, int size)	{
	 int i,j,k,temp;
	 for(i=0;i<size-1;i++)  {
             k=i;
	     for(j=i+1;j<size;j++)	{
		 if(arr[k]>arr[j])   {
		     k=j;	
		   }
		    temp=arr[k];
		    arr[k]=arr[i];
		    arr[i]=temp; 
		  }
	    }	
     }	
   }

public class Sort_10  {
   public static void main(String args[])  {
      Scanner sc=new Scanner(System.in);
	int[] arr=new int[100];
        int size,ch;
    System.out.printf("Enter How Many Elements You Want : ");
    size=sc.nextInt();
 System.out.println("Enter Your "+size+" Elements :");
   for(int t=0;t<size;t++)   {
      arr[t]=sc.nextInt();
    }
while (true) {
System.out.println("\n1>> BUBBLE_SORT\t2>> SELECTION_SORT 3>> EXIT");	
ch=sc.nextInt();
if(ch==1) {
System.out.println("Bubble ");
Sortable bubbleSort = new BubbleSort();
bubbleSort.sort(arr,size);
print(arr,size);
}
else if(ch==2){
System.out.println("\nSelection  ");
Sortable selectionSort = new SelectionSort();
selectionSort.sort(arr,size); 
print(arr,size);
}
else if(ch==3) {
	System.exit(0);
}
else {
	System.out.println("\nEnter Correct Option !!!");
}
 }  
}
     private static void print(int[] arr,int size)   {
         for(int t=0;t<size;t++) {
           System.out.printf("%d ",arr[t]);
         }
      }
  }