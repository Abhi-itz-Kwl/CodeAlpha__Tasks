import java.util.ArrayList;
import java.util.Scanner;

public class studentGradeTracker {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Grade Tracker");
        System.out.println("Enter student grades (-1 to stop):");
        while (true) {
            System.out.print("Enter grade: ");
            if (scanner.hasNextDouble()) { // Check if input is a number
                double grade = scanner.nextDouble();
                if (grade == -1) 
                {
                    break;
                }
                if (grade >= 0 && grade <= 100) 
                {
                    grades.add(grade);
                } 
                else 
                {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            } 
            else 
            {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); 
            }
        }
        
        if (grades.isEmpty()) 
        {
            System.out.println("No grades entered.");
        } 
        else
         {
            
            double sum = 0;
            for (double grade : grades) 
            {
                sum += grade;
            }
            double average = sum / grades.size();
            double highest = grades.get(0);
            double lowest = grades.get(0);
            for (double grade : grades) {
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }
            System.out.println("\nGrade Summary:");
            System.out.println("Total Students: " + grades.size());
            System.out.println("Average Score: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        }

        scanner.close();
    }
}
