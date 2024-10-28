public class Timer extends Thread {

    // this is the "MAIN" of the thread
    @Override
    public void run() {
        super.run();


        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" Thread says " + i);
        }
        System.out.println("Time's up! You ran out of time to guess the number.");
        System.exit(0);
    }
}