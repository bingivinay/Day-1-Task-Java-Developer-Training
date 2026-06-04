package Task_1;

import java.util.Scanner;

public class EmployeeMenu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int Choice;
		System.out.println("==========Employee menu ===========");
		
		do {
			
			System.out.println("Add Employee");
			System.out.println("Update Employee");
			System.out.println("Delete Employee");
			System.out.println("Exit");
			System.out.println("================");
			System.out.println("Enter your choice");
			Choice=sc.nextInt();
			switch (Choice) {
			case 1: {
				System.out.println("Eployee Added successfully");
				System.out.println("================");
				break;
			}
			case 2:{
				System.out.println("Employee Updatesd successfully");
				System.out.println("================");
				break;
			}
			case 3:{
				System.out.println("Employee deleted successfully");
				System.out.println("================");
				break;
			}case 4:{
				System.out.println("Exite menu ");
				break;
				
			}
			default:
				System.out.println("choose correct choice");
				System.out.println("================");
				break;
			}
			
		}while( Choice !=4);
		sc.close();
		

	}

}
