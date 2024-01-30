// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of subjects
        int totalSubjects;

        // Get the number of subjects from the user
        System.out.print("Enter the no of subjects: ");
        totalSubjects  = scanner.nextInt();

        // Array to store marks for each subject
        int[] marks = new int[totalSubjects];

        // Get marks for each subject from the user
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the average
        double totalMarks = 0;
        for (int mark : marks) {
            totalMarks = totalMarks + mark;
        }
        double avg = totalMarks / totalSubjects;


        System.out.println("Average Marks: " + avg);

        // Determine the grade based on the average
        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else if (avg>=50){
            grade = 'E';
        }
          else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}