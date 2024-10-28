import java.util.*;
public class Main {
    public static void main(String[] args) {
        Timer timerThread = new Timer();
        Input inputThread = new Input();
        timerThread.start();
        inputThread.start();
        try {
            timerThread.join();
            inputThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Game over.");
    }
}