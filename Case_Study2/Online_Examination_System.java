package Case_Study2;

import java.util.Scanner;

public class Online_Examination_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students = 20;
		int subjects = 5;
		int[][] marks = new int[students][subjects];
		int[] total = new int[students];
		double[] percentage = new double[students];
		for (int i = 0; i < students; i++) {
			System.out.println("Enter marks for Student " + (i + 1));
			for (int j = 0; j < subjects; j++) {
				System.out.print("Subject " + (j + 1) + ": ");
				marks[i][j] = sc.nextInt();
				total[i] += marks[i][j];
			}
			percentage[i] = total[i] / 5.0;
		}
		System.out.println("----- STUDENT RESULTS -----");
		for (int i = 0; i < students; i++) {
			System.out.print("Student " + (i + 1));
			System.out.print(" Total = " + total[i]);
			System.out.print(" Percentage = " + percentage[i] + "%");
			if (percentage[i] > 80)
				System.out.print(" Performance = Excellent");
			else if (percentage[i] >= 60)
				System.out.print(" Performance = Good");
			else if (percentage[i] >= 40)
				System.out.print(" Performance = Average");
			else
				System.out.print(" Performance = Poor");
			System.out.println();
		}
		System.out.println("----- TOP 3 STUDENTS -----");
		int[] tempTotal = total.clone();
		for (int rank = 1; rank <= 3; rank++) {
			int maxIndex = 0;
			for (int i = 1; i < students; i++) {
				if (tempTotal[i] > tempTotal[maxIndex]) {
					maxIndex = i;
				}
			}
			System.out.println("Rank " + rank + " -> Student " + (maxIndex + 1) + " Total = " + tempTotal[maxIndex]);
			tempTotal[maxIndex] = -1;
		}
		System.out.println("----- SUBJECT-WISE AVERAGE -----");
		for (int j = 0; j < subjects; j++) {
			int sum = 0;
			for (int i = 0; i < students; i++) {
				sum += marks[i][j];
			}
			double average = (double) sum / students;
			System.out.println("Subject " + (j + 1) + " Average = " + average);
		}
		System.out.println("---- FAILED STUDENTS -----");
		boolean failFound = false;
		for (int i = 0; i < students; i++) {
			boolean failed = false;
			for (int j = 0; j < subjects; j++) {
				if (marks[i][j] < 40) {
					failed = true;
					break;
				}
			}
			if (failed) {
				System.out.println("Student " + (i + 1));
				failFound = true;
			}
		}
		if (!failFound) {
			System.out.println("No Failed Students");
		}
		sc.close();
	}
}
