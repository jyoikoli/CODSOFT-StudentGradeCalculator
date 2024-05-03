import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 91 && averagePercentage <= 100) {
            grade = "O";
        } else if (averagePercentage >= 81 && averagePercentage <= 90) {
            grade = "A+";
        } else if (averagePercentage >= 71 && averagePercentage <= 80) {
            grade = "A";
        } else if (averagePercentage >= 61 && averagePercentage <= 70) {
            grade = "B+";
        } else if (averagePercentage >= 50 && averagePercentage <= 60) {
            grade = "B";
        } else if (averagePercentage >= 45 && averagePercentage <= 49) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
