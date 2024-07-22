
    import java.util.Random;
import java.util.Scanner;

class GAME1{
	public int number;
	public int inputnumber;
	public int noOfguesses=0;
	 
	public int getnoOfguesses() {
		return  noOfguesses;
	}
	
	public void setnoOfguesses(int noOfguesses) {
	this.noOfguesses=noOfguesses;
	}
	
	 GAME1() {
		Random rand=new Random();
		 this.number=rand.nextInt(100);
		
		
	}
	 void takeUserInput() {
		 System.out.println("guess the number");
		 Scanner sc=new Scanner(System.in);
		 inputnumber =sc.nextInt();
	 }
	 boolean isCorrectNumber() {
		 noOfguesses++;
		 if(inputnumber==number) {
			 System.out.format("yes you guessed it right it was %d\n u guessed it in %d attempts", number,noOfguesses);
			 return true;
			 
		 }
		 else if(inputnumber<number) {
			 System.out.println("too low....");
		 }
		 else if(inputnumber>number) {
			 System.out.println("too high....");
		 }
		 return false;
		 
	 }
}
           public class NumberGuessingGAME1{
	       public static void main(String[] args) {
           GAME1 g=new GAME1();
            boolean b=false;
           while(!b){
	
           g.takeUserInput();
            b=g.isCorrectNumber();
            System.out.println(b);
	}

	}
}


	


