package Task2;

import java.util.Scanner;

public class Student_Result_Management_System {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 10;
        int subjects = 5;
        int[][] marks = new int[students][subjects];
        int[] total = new int[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];
        System.out.println("Enter marks for 10 students in 5 subjects:");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            percentage[i] = total[i] / 5.0;
            if (percentage[i] >= 90) {
                grade[i] = 'A';}
            else if (percentage[i] >= 75) {
                grade[i] = 'B';}
            else if (percentage[i] >= 60) {
                grade[i] = 'C';}
            else if (percentage[i] >= 40) {
                grade[i] = 'D';}
            else {
                grade[i] = 'F';}
        }
        System.out.println("----- STUDENT RESULTS -----");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1)
                    + " | Total = " + total[i]
                    + " | Percentage = " + percentage[i]
                    + "% | Grade = " + grade[i]);
        }
        int topperIndex = 0;
        for (int i = 1; i < students; i++) {
            if (total[i] > total[topperIndex]) {
                topperIndex = i;
            }
        }
        System.out.println("----- TOPPER DETAILS -----");
        System.out.println("Student " + (topperIndex + 1));
        System.out.println("Total Marks : " + total[topperIndex]);
        System.out.println("Percentage  : " + percentage[topperIndex] + "%");
        System.out.println("Grade       : " + grade[topperIndex]);

        System.out.println("----- SUBJECT-WISE HIGHEST MARKS -----");
        for (int j = 0; j < subjects; j++) {
            int highest = marks[0][j];
            for (int i = 1; i < students; i++) {
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }
            }
            System.out.println("Subject " + (j + 1) + " Highest Marks = " + highest);
        }

        sc.close();
    }
}