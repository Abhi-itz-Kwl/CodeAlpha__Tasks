import java.util.Scanner;

public class OnlineQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String answer;
        System.out.println("Welcome to the Online Quiz!");
         System.out.println("\n1. What is the capital of France?");
        System.out.println("a) London");
        System.out.println("b) Paris");
        System.out.println("c) Rome");
        System.out.println("d) Madrid");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("b")) 
        {
            score++;
        }
        System.out.println("\n2. Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Jupiter");
        System.out.println("c) Mars");
        System.out.println("d) Venus");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("c")) {
            score++;
        }
        System.out.println("\n3. What is the largest mammal?");
        System.out.println("a) Elephant");
        System.out.println("b) Blue Whale");
        System.out.println("c) Giraffe");
        System.out.println("d) Polar Bear");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("b")) {
            score++;
        }
         System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + " out of 3");
        
        if (score == 3) {
            System.out.println("Excellent! You got all answers right.");
        } else if (score == 2) {
            System.out.println("Good Job! You got 2 out of 3 correct.");
        } else {
            System.out.println("Better luck next time!");
        }
        
        sc.close();
    }
}
