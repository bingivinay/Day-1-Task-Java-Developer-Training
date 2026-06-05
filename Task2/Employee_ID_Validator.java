package Task2;

import java.util.Scanner;

public class Employee_ID_Validator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] employeeIds = {"EMP-101","EMP-102","EMP-103",
        		"EMP-104", "EMP-105","EMP-106",
        		"EMP-107", "EMP-108", "EMP-109", "EMP-110"};
        System.out.print("Enter Employee ID to search: ");
        String searchId = sc.nextLine();
        boolean found = false;
        for (String id : employeeIds) {
            if (id.equals(searchId)) {   
                found = true;
                System.out.println("Employee ID Found!");
                String empNumber = id.substring(4);
                System.out.println("Employee Number using substring(): " + empNumber);
                String[] parts = id.split("-");
                System.out.println("Prefix: " + parts[0]);
                System.out.println("Employee Number using split(): " + parts[1]);
                break;
            }
        }
        if (!found) {
            System.out.println("Employee ID Not Found!");
        }
        sc.close();
    }
}
