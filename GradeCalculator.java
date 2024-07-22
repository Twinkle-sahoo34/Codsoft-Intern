import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		        // Input: Number of subjects
		        System.out.print("Enter the number of subjects: ");
		        int numSubjects = scanner.nextInt();

		        // Input: Marks obtained in each subject
		        int[] marks = new int[numSubjects];
		        for (int i = 0; i < numSubjects; i++) {
		            System.out.print("Enter marks for subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		        }

		        // Calculate Total Marks
		        int totalMarks = 0;
		        for (int mark : marks) {
		            totalMarks += mark;
		        }

		        // Calculate Average Percentage
		        float averagePercentage = (float) totalMarks / numSubjects;

		        // Grade Calculation
		        char grade;
		        if (averagePercentage >= 90) {
		            grade = 'A';
		        } else if (averagePercentage >= 80) {
		            grade = 'B';
		        } else if (averagePercentage >= 70) {
		            grade = 'C';
		        } else if (averagePercentage >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        // Display Results
		        System.out.println("Total Marks: " + totalMarks );
		        ;
		        System.out.println("Average Percentage: " + averagePercentage + "%");
		        System.out.println("Grade: " + grade);

		        scanner.close();
		    }
		}





