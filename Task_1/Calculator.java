package Task_1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int Num1=10;
		int Num2=3;
		
		System.out.println("Addition	: "+Math.addExact(Num1, Num2));
		System.out.println("Subtaction	: "+Math.subtractExact(Num1, Num2));
		System.out.println("Multiplication	: "+Math.multiplyExact(Num1, Num2));
		System.out.println("Division	: "+Math.divideExact(Num1, Num2));
		System.out.println("Modulus		: "+Math.floorMod(Num1, Num2));
		
	}
}
