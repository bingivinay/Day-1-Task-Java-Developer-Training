package Task_1;

import java.util.Scanner;

public class AgeEligibilityChecker {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age");
		int Age =sc.nextInt();
		if (Age>0) {
			if (Age<18) {
				System.out.println("Not Eligible");
				}else if(Age>=18 && Age<=59) {
					System.out.println("Eligible");
				}else {
					System.out.println("Senior citizen");
				}
		}else {
			System.out.println("please enter correct Age");
			
			}
		
	}

}
