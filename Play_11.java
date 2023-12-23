/* Write a Java program to create an interface Playable with a method play() 
that takes no arguments and returns void. Create three classes 
Football, Volleyball, and Basketball that implement the Playable interface and 
override the play() method to play the respective sports. */

interface Playable {
   public void play();
  }
class Football implements Playable {
    public void play() {
        System.out.println("I am Playing Football , Now !!!");
      }
  }
class Volleyball implements Playable  {
    public void play()  {
        System.out.println("I am Playing Volleyball , Now !!!");
      }
  }
class Basketball implements Playable  {
    public void play() {
        System.out.println("I am Playing Basketball , Now !!!");
      }
  }
public class Play_11  {
   public static void main(String args[]) {
      Playable fb=new Football();
		fb.play();
	Playable vb=new Volleyball();
	         vb.play();	
	Playable bb=new Basketball();
		bb.play();
    }
  }