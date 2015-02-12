

import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers from least to greatest that four numbers apart; ");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(",");
		int n1, n2, numbersBetween, numbersBetween1, numbersBetween2, numbersBetween3; 
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		numbersBetween = n1+1;
		numbersBetween1 = numbersBetween + 1;
		numbersBetween2 = numbersBetween1 + 1;
		numbersBetween3 = numbersBetween2 ;
		System.out.println("The numbers inbetween are \"" +  n1 + numbersBetween + numbersBetween1 
				+ numbersBetween2  + "\"" );

	
	}

}
