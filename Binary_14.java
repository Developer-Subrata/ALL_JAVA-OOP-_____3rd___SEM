/* Write a Java program that will accept an integer and convert it into a binary 
representation. 
Now count the number of bits equal to zero in this representation.
*/

import java.util.*;
public class Binary_14 {
   public static void main(String args[])   {
     Scanner sc=new Scanner(System.in);
      int dec,r=0,j=1,bnr=0,temp,zero=0;
      System.out.println("Enter decimal Number : ");
       dec=sc.nextInt();
        temp=dec;
      while(temp>0)   {
         r=temp%2;
         if(r==0) {
            zero++;
          }
	       bnr+=(r*j);
	       temp/=2;
         j*=10;
       }
       System.out.printf("The Bianry Of %d Is => %d ",dec,bnr);
       System.out.printf("\nThere Are %d Bits Is Equals To Zero ",zero);
    }
  }