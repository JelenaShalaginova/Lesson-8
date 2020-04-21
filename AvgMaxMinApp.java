package lesson8;
import java.util.*;

public class AvgMaxMinApp {
	
	public static void main(String[] args) {
		//declare array [] to store integer elements
		int numbers[];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of array: ");
		
		int size = input.nextInt();
		
		numbers = new int [size];
		
		//input
		//loop to prompt the user to input the numbers
		//in each iteration of loop to store the number provided by the user in the numbers[] at the index i
		for (int i = 0; i <size; i++) {
			System.out.println("Enter value " + (i+1));
			numbers [i] = input.nextInt();
		}
		
		//processing
		AvgMax avgMax = new AvgMax();
		Avg avg = new Avg();
		AvgMin min = new AvgMin();
		
		
		//use the setter to store the numbers provided by the user
		avg.setNumbers(numbers);
		avgMax.setNumbers(numbers);
		min.setNumbers(numbers);
		
		//calculation
		avg.calculateAverage();
		avgMax.computeMax();
		min.computeMin();
		
		//output
		double a = avg.getAverage();
		int b  = avgMax.getMax();
		int c = min.getMin();
		
		System.out.println("Average number: " + a);
		System.out.println("Max number: " + b);
		System.out.println("Min number: " + c);
		
	}//end main

}//end class
