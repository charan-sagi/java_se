package basics;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int total = 0;
		
		for (int i = 1; i <=5; i++) {
			System.out.print("Enter number : ");
			int n = s.nextInt();
			
			total += n;
		}
		
		int avg = total / 5;
		
		System.out.println("Average : " + avg);
	}

}
