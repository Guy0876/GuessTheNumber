import java.util.*;
public class Input extends Thread{

    @Override
    public void run(){
        super.run();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int targetNumber = rand.nextInt(100) + 1, guess;
        System.out.println("The target number is: " + targetNumber);
        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");
                System.exit(0);
            } else {
                System.out.println("Incorrect. Try again.");
            }
        } while (guess != targetNumber);
        scanner.close();
    }
}
