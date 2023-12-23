/*Write a Java program to create a base class Animal with methods move() and makeSound(). 
Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves.
 Also, override the makeSound() method in each subclass to make a specific sound for each animal.
*/
class Animal {
   public void move()  {
       System.out.println("Animal Moving With Fly or walking");
     }
   public void makeSound()   {
	System.out.println("Animal Southing");
     }
  }

class Bird extends Animal  {
    public void move()	{
	  System.out.println("Birds Move With Flying");
	}
    public void makeSound() {
	System.out.println("Birds Making_Sound");
     }
  }

class Panthera extends Animal {
    public void move()	{
	  System.out.println("Panthera Move With Walking");
	}
    public void makeSound()  {
	System.out.println("Panthera Making_Sound");
     }
  }

public class Animal_5 {
   public static void main(String args[])  {
      Animal anl=new Animal();
	Bird brd=new Bird();
	Panthera pntr=new Panthera();
        anl.move();
	anl.makeSound();
	brd.move();
	brd.makeSound();
	pntr.move();
	pntr.makeSound();
    }
  }